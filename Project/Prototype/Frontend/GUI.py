import sys
from PyQt5.QtCore import Qt
from PyQt5.QtWidgets import QApplication, QMainWindow, QLineEdit, QWidget, QDial, QPushButton, QLabel, QVBoxLayout 
from PyQt5.QtGui import QPainter, QPen, QIcon, QBrush 


class MyWindow(QMainWindow):
    def __init__(self):
        super().__init__()

        # Set the window's background color to dark grey
        palette = self.palette()
        palette.setColor(self.backgroundRole(), Qt.darkGray)
        self.setPalette(palette)

        # Give the window a title
        self.setWindowTitle('Pedal Pro+')

        # Set size of window
        self.setGeometry(100, 200, 400, 600)

        # Assign a logo to the app
        self.setWindowIcon(QIcon('guitar.png'))

        # Create a central widget to hold the text input field
        central_widget = QWidget(self)
        self.setCentralWidget(central_widget)

        # Add a text input field that captures user input
        self.input_field = QLineEdit(self)
        self.input_field.move(200, 50)
        self.input_field.resize(200, 25)
        self.input_field.setAlignment(Qt.AlignCenter)

        # Use a layout manager to center the text input field in the central widget
        central_widget_layout = QVBoxLayout()
        central_widget_layout.addWidget(self.input_field, alignment=Qt.AlignCenter)
        central_widget.setLayout(central_widget_layout)

        # Area to display sound responsive waves
        self.display_area = QWidget(self)
        self.display_area.move(0, 0)
        self.display_area.resize(500, 200)
        # Set the display area's background color to white
        palette = self.display_area.palette()
        self.display_area.setStyleSheet("background-color: white;")
        self.display_area.setPalette(palette)

        # Dial_1 - Freeverb
        self.dial_1 = QDial(self)
        self.dial_1.setWindowTitle('freeverb')
        self.dial_1.move(25, 320)
        self.dial_1.resize(55, 55)
        self.dial_1.setNotchesVisible(True)
        self.dial_1_label = QLabel("Freeverb", self)
        self.dial_1_label.move(30, 370)



        # Dial_2 - Delay
        self.dial_2 = QDial(self)
        self.dial_2.setWindowTitle('delay')
        self.dial_2.move(125, 320)
        self.dial_2.resize(55, 55)
        self.dial_2_label = QLabel("Delay", self)
        self.dial_2_label.move(140, 370)
        self.dial_2.setNotchesVisible(True)


        # Dial_3 - Distortion
        self.dial_3 = QDial(self)
        self.dial_3.setWindowTitle('distortion')
        self.dial_3.move(225, 320)
        self.dial_3.resize(55, 55)
        self.dial_3_label = QLabel("Distortion", self)
        self.dial_3_label.move(230, 370)
        self.dial_3.setNotchesVisible(True)


        # Dial_4 - Harmonizer
        self.dial_4 = QDial(self)
        self.dial_4.setWindowTitle('harmonizer')
        self.dial_4.move(325, 320)
        self.dial_4.resize(55, 55)
        self.dial_4_label = QLabel("Harmonizer", self)
        self.dial_4_label.move(330, 370)
        self.dial_4.setNotchesVisible(True)


        # Button to act as digital guitar pedal applies effect as long as its pressed
        self.pedal = QPushButton(self)
        self.pedal.move(0, 400)
        self.pedal.resize(400, 200)

        # Connect the clicked signal to a function
        self.pedal.clicked.connect(self.pedal_clicked)

        # Set the button's background color to light grey
        palette = self.pedal.palette()
        self.pedal.setStyleSheet("background-color: lightgray; border-radius: 10px;")
        self.pedal.setPalette(palette)


    def get_input(self):
        return self.input_field.text()

    def get_dial_value(self):
        return self.dial.value()

    def pedal_clicked(self):
        # This function will be called when the button is clicked
        print("Pedal clicked!")

    

app = QApplication(sys.argv)
window = MyWindow()
window.show()
sys.exit(app.exec_())
