# YOLOv4 Object Detection in Java using OpenCV

## Overview
This Java application demonstrates object detection using YOLOv4 with OpenCV. It detects objects in an input image and annotates them with bounding boxes and labels.

## Prerequisites
1. **Java Development Kit (JDK)**: Ensure JDK is installed.
2. **OpenCV for Java**: Download and set up OpenCV from [OpenCV's official site](https://opencv.org/releases/).
3. **YOLOv4 Model**: Obtain `yolov4.cfg`, `yolov4.weights`, and `coco.names`. You can find these on the [Darknet GitHub](https://github.com/AlexeyAB/darknet).

## Setup
1. **Java Setup**:
   - Install JDK and set up your environment.
   
2. **OpenCV Setup**:
   - Download and extract OpenCV for Java.
   - Set the path to the OpenCV native library (`opencv_java490.dll` ) in the code:
     ```java
     System.load("path_to_opencv_java_dll");
     ```

3. **Model Files Setup**:
   - Download the YOLOv4 files and update paths in `YoloObjectDetection.java`:
     ```java
     String modelConfiguration = "path_to_yolov4_cfg";
     String modelWeights = "path_to_yolov4_weights";
     String classNamesFile = "path_to_coco_names";
     ```

## Running the Application
1. **Compile and Run**:
   - Compile `YoloObjectDetection.java`:
     ```bash
     javac YoloObjectDetection.java
     ```
   - Execute the compiled Java program:
     ```bash
     java YoloObjectDetection
     ```

## Notes
- **Project Structure**: Keep all files (`java` source, `yolov4.cfg`, `yolov4.weights`, `coco.names`) in the same directory.
  
- **Object Detection**: Detects up to 20 objects per image based on COCO dataset classes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file.

## Contact
For issues or questions, contact [raufpokemom00@icloud.com](mailto:raufpokemon00@icloud.com).
