from pyo import *
import pyo
import time
from playsound import playsound

#server
s = Server()
print ("Server setup")
s.setMidiInputDevice(3)
print ("midi setup")
s.boot()
s.start()

# Set Up MIDI
midi = Notein()

# ADSR
amp = MidiAdsr(midi['velocity'])

# Pitch
pitch = MToF(midi['pitch'])

# Table
wave = SquareTable()
#wave = SineTable(size=1024)

# Osc
osc = Osc(wave, freq=pitch, mul=amp)

fx = ''
n = int(input("number of effects: "))

fxs = []

for i in range(0,n):
    fx = input("Enter an effect: ")
    fxs.append(fx)

print (fxs)

sound = osc
for i in range(0,n):

    #button boolean
    if fxs[i] == 'freeverb':
        sound = Freeverb(osc)

    #button boolean
    #dial delay >0
    #dial feedback 0-1
    if fxs[i] == 'delay':
        d = float(input("Enter your delay: "))
        f = float(input("Enter your feedback: "))
        sound = Delay(sound, delay=d, feedback=f, maxdelay=3).out()

    #button boolean
    #dial drive 0-1
    #dial slope 0-1
    if fxs[i] == 'dist':
        dr = float(input("Enter your drive: "))
        sl = float(input("Enter your slope: "))
        sound = Disto(sound, drive=dr, slope=0, mul=.5).out()

    #button boolean
    #dial transposition -20 - 20
    #dial window_size 0 - 1
    if fxs[i] == 'harmonizer':
        env = WinTable(8)
        ws = float(input("Enter your window size: "))
        tr = float(input("Enter your transposition: "))
        trans = -20
        tratio = pow(2.0, tr / 12.0)
        rate = -(tratio - 1) / ws
        ind = Phasor(freq=rate, phase=[0, 0.5])
        win = Pointer(table=env, index=ind, mul=0.7)
        sound = Delay(sound, delay=ind * ws, mul=win).mix(1)

    #button boolean
    #dial frequency 0 - 5
    if fxs[i] == 'chorus':
        f = float(input("Enter your frequency multiplier: "))
        sf2 = sound.mix(2).out()
        freqs = [0.254, 0.465, 0.657, 0.879, 1.23, 1.342, 1.654, 1.879]
        cds = [0.0087, 0.0102, 0.0111, 0.01254, 0.0134, 0.01501, 0.01707, 0.0178]
        ads = [0.001, 0.0012, 0.0013, 0.0014, 0.0015, 0.0016, 0.002, 0.0023]
        lfos = Sine(freqs*f, mul=ads, add=cds)
        sound = Delay(sound, lfos, feedback=.5, mul=1)


sound.out()

s.gui(locals())