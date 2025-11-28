package dev.gabriel.Storage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.gabriel.Storage.model.ImageLogo;
import dev.gabriel.Storage.servise.LogoServise;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/logo")
public class ImageLogoController {
    
    private final LogoServise logoServise;

    public ImageLogoController(LogoServise logoServise){
        this.logoServise = logoServise;
    }

    @GetMapping
    public List<ImageLogo> getAll() {return logoServise.getAll();}
    

}
