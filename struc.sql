+-----------------+
|     MainApp     |
+-----------------+
| - main(String[])|
+-----------------+
| + initGUI()     |
| + start()       |
+-----------------+
          |
          |
          V
+--------------------+
|     MainFrame      |
+--------------------+
| - frame            |
+--------------------+
| + initComponents() |
| + showFrame()      |
+--------------------+
         / \
        /   \
       /     \
      V       V
+-----------------------+       +-----------------------+
|  CustomDetectionPanel |       |   LiveDetectionPanel  |
+-----------------------+       +-----------------------+
| - customDetectButton  |       | - liveDetectButton    |
+-----------------------+       +-----------------------+
| + initPanel()         |       | + initPanel()         |
| + handleDetection()   |       | + handleDetection()   |
+-----------------------+       +-----------------------+
         |
         |
         V
+-----------------------+
|   DetectionManager    |
+-----------------------+
| + detectCustom()      |
| + detectLive()        |
+-----------------------+
         |
         |
         V
+-----------------------+
|    ObjectDetector     |
+-----------------------+
| - model               |
+-----------------------+
| + loadModel()         |
| + detect()            |
+-----------------------+

/*  1 -> MainApp: This is the main class of the application. It has a main method to start the program and methods to initialize the graphical user interface (GUI) and start the application.

    2 -> MainFrame: This class represents the main frame of the GUI. It contains methods to set up the frame and its components, like buttons, and to show the frame.

    3 -> CustomDetectionPanel: This panel is responsible for custom object detection. It has a button to trigger detection and methods to initialize the panel and handle detection.

    4 -> LiveDetectionPanel: Similar to the custom panel, but it's for live object detection. It also has a button for detection and methods for initialization and handling detection.

    5 -> DetectionManager: This class manages the detection process. It contains methods to perform custom and live detection.

    6 -> ObjectDetector: This class handles the actual object detection. It has methods to load a detection model and to perform detection on input data./*