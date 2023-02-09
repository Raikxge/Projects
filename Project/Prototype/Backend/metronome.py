#working
import time
from playsound import playsound

bpm = 60  # beats per minute
sec = (60/bpm)

while True:
    playsound("sample_tracks/tick.mp3")
    time.sleep(sec)