// ImageController.java

package com.example.controller;

import com.example.model.Image;
import com.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageController {

    @Autowired
    private ImageService imageService;

    // Route for the main page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Route for upload page
    @GetMapping("/upload")
    public String uploadForm(Model model) {
        model.addAttribute("image", new Image());
        return "upload";
    }

    // Handle file upload
    @PostMapping("/upload")
    public String uploadSubmit(@RequestParam("file") MultipartFile file, Model model) {
        String filename = imageService.saveImage(file);
        model.addAttribute("filename", filename);
        return "index";
    }

    // Route to start live camera feed
    @GetMapping("/camera")
    public String startCamera(Model model) {
        imageService.startCamera();
        return "index";
    }
}
