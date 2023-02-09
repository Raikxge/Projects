import sys
from pyo import *
import pyo
import time
from PyQt5.QtWidgets import *
from PyQt5.QtGui import *
from PyQt5.QtCore import *
import numpy as np
import matplotlib.pyplot as plt
from matplotlib.backends.backend_qt5agg import FigureCanvasQTAgg as FigureCanvas
s = pyo.Server()

ins = pyo.pm_get_input_devices()
print(ins)

midiport = pyo.pm_get_default_input()

s.setMidiInputDevice(midiport)
print("Selected device number: " + str(midiport))

s.boot()
s.start()

# Set Up MIDI
notes = Notein(poly=10, scale=1, mul=.5)

bend = Bendin(brange=2, scale=1)

p = Port(notes['velocity'], .001, .5)

sound = Sine(freq=notes['pitch'] * bend, mul=p).out()

scope = pyo.Scope(sound)

stylesheet = """ *{background-image: url(background.jpg) 0 0 0 0 stretch stretch;}"""  

class MyApp(QWidget):
    def __init__(self):
        super().__init__()
        self.initUI()

    def initUI(self):
        # creating a Vertical Box layout
        layout = QVBoxLayout()

        dial_layout = QHBoxLayout()
        button_layout = QHBoxLayout()
        self.freeverb = 0.0
        self.delay = 0.0
        self.dist = 0.0
        self.harmonizer = 0.0
        self.chorus = 0.0

        self.freeverb_active = False
        self.dist_active = False
        self.delay_active = False
        self.harmonizer_active = False
        self.chorus_active = False

        self.setGeometry(100, 100, 1060, 800)
        self.setFixedSize(500, 200)
        self.setWindowTitle('Pedal Pro+')
        self.setWindowIcon(QIcon('guitar.png'))

        palette = self.palette()
        palette.setColor(QPalette.Background, QColor(200,200,200))
        self.setPalette(palette)

        button_width = 200
        button_height = 250
        button_padding = 10
        self.button_list = [QPushButton('FREEVERB', self),
                            QPushButton('DELAY', self),
                            QPushButton('DISTORTION', self),
                            QPushButton('HARMONIZER', self),
                            QPushButton('CHORUS', self)]
        for i, button in enumerate(self.button_list):
            button.setGeometry(button_padding + i * (button_width + button_padding),
                                self.height() - button_height - button_padding,
                                button_width,
                                button_height)
            button.setFixedHeight(100)
            button.setStyleSheet("background-color: white; border-radius: 10px;border:1px solid black; text-align:top;")
            button_layout.addWidget(button)
            button.clicked.connect(self.on_button_clicked)

        #| Dial for Freeverb
        self.freeverb_dial = QDial(self)
        self.freeverb_dial.setNotchesVisible(True)
        self.freeverb_dial.setRange(0, 1)
        self.freeverb_dial.valueChanged.connect(self.set_freeverb)
        dial_layout.addWidget(self.freeverb_dial)
        
        #| Dials For Delay
        self.delay_dial = QDial(self)
        self.delay_dial.setNotchesVisible(True)
        self.delay_dial.setRange(0, 2)
        self.delay_dial.setGeometry(275, 440, 60, 60)
        self.delay_dial.valueChanged.connect(self.set_delay)
        dial_layout.addWidget(self.delay_dial)  

        #| Dials for Distortion
        self.dist_dial = QDial(self)
        self.dist_dial.setNotchesVisible(True)
        self.dist_dial.setRange(0, 1)
        self.dist_dial.setGeometry(475, 440, 60, 60)
        self.dist_dial.valueChanged.connect(self.set_dist)
        dial_layout.addWidget(self.dist_dial)

        #| Dials for Harmonizer
        self.harmonizer_dial = QDial(self)
        self.harmonizer_dial.setNotchesVisible(True)
        self.harmonizer_dial.setRange(0, 10)
        self.harmonizer_dial.setGeometry(675, 440, 60, 60)
        self.harmonizer_dial.valueChanged.connect(self.set_harmonizer)
        dial_layout.addWidget(self.harmonizer_dial)

        #| Dials for Chorus
        self.chorus_dial = QDial(self)
        self.chorus_dial.setNotchesVisible(True)
        self.chorus_dial.setRange(0, 5)
        self.chorus_dial.setGeometry(875, 440, 60, 60)
        self.chorus_dial.valueChanged.connect(self.set_chorus)
        dial_layout.addWidget(self.chorus_dial)

        # setting layout to the main window
        layout.addLayout(button_layout)
        layout.addLayout(dial_layout)
        self.setLayout(layout)

    def set_freeverb(self):
        value = self.freeverb_dial.value()
        global sound
        sound = Freeverb(sound, size=value) if self.freeverb_active else sound
        print("Freeverb has been set to:" + str(value))

    def set_delay(self):
        value = self.delay_dial.value()
        global sound
        sound = Delay(sound, delay=value).out() if self.delay_active else sound
        print("Delay has been set to:" + str(value))

    def set_dist(self):
        value = self.dist_dial.value()
        global sound
        sound = Disto(sound, drive=value).out() if self.dist_active else sound
        print("Distortion has been set to:" + str(value))

    def set_harmonizer(self):
        value = self.harmonizer_dial.value()
        global sound
        sound = Harmonizer(sound, transpo=value) if self.harmonizer_active else sound
        print("Harmonizer has been set to:" + str(value))

    def set_chorus(self):
        value = self.chorus_dial.value()
        global sound
        sound = Chorus(sound, depth=value).out() if self.chorus_active else sound
        print("Chorus has been set to:" + str(value))

    def on_button_clicked(self):
        sender = self.sender()
        if sender.property('clicked'):
            sender.setProperty('clicked', False)
            sender.setStyleSheet("background-color: white; border-radius: 10px;border:1px solid black; text-align:top;")
            if sender.text() == "FREEVERB":
                self.freeverb_active =False
            elif sender.text() == "DELAY":
                self.delay_active =False
            elif sender.text() == "DISTORTION":
                self.dist_active =False
            elif sender.text() == "HARMONIZER":
                self.harmonizer_active =False
            elif sender.text() == "CHORUS":
                self.chorus_active =False
        else:
            sender.setProperty('clicked', True)
            sender.setStyleSheet("background-color: lightgray; border-radius: 10px;border:3px solid black; text-align:top;")
            if sender.text() == "FREEVERB":
                self.freeverb_active = True
                self.set_freeverb()
            elif sender.text() == "DELAY":
                self.delay_active = True
                self.set_delay()
            elif sender.text() == "DISTORTION":
                self.dist_active = True
                self.set_dist()
            elif sender.text() == "HARMONIZER":
                self.harmonizer_active = True
                self.set_harmonizer()
            elif sender.text() == "CHORUS":
                self.chorus_active = True
                self.set_chorus()

    def plot(self):
          
        # random data
        data = [random.random() for i in range(10)]
  
        # clearing old figure
        self.figure.clear()
  
        # create an axis
        ax = self.figure.add_subplot(111)
  
        # plot data
        ax.plot(data, '*-')
  
        # refresh canvas
        self.canvas.draw()

if __name__ == '__main__':
    app = QApplication(sys.argv)
    app.setStyleSheet(stylesheet)
    ex = MyApp()
    ex.show()
    s.gui(locals())
    sys.exit(app.exec_())
    