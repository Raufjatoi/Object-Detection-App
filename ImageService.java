// ImageService.java (Updated with OpenCV)

package com.example.service;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public String saveImage(MultipartFile file) {
        // Implement logic to save image to file system
        return "images/" + file.getOriginalFilename(); // Example: save in static/images/
    }

    public void startCamera() {
        // Open default camera
        VideoCapture camera = new VideoCapture(0);

        if (!camera.isOpened()) {
            System.out.println("Error: Camera not opened");
            return;
        }

        // Create a window to display camera feed
        String windowName = "Live Camera";
        Size frameSize = new Size(640, 480);
        Mat frame = new Mat();

        // Display live camera feed
        while (true) {
            if (camera.read(frame)) {
                Imgproc.resize(frame, frame, frameSize);
                Core.flip(frame, frame, 1); // Flip horizontally for mirror effect
                Imgproc.putText(frame, "Press Q to quit", new org.opencv.core.Point(10, 30),
                        Core.FONT_HERSHEY_SIMPLEX, 1, new org.opencv.core.Scalar(255, 255, 255), 2);
                org.opencv.highgui.HighGui.imshow(windowName, frame);
            }

            // Check for user input to quit (press 'q')
            if (org.opencv.highgui.HighGui.waitKey(1) == 'q') {
                break;
            }
        }

        // Release resources
        camera.release();
        org.opencv.highgui.HighGui.destroyAllWindows();
    }
}
