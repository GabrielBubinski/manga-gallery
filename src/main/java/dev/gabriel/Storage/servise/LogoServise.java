package dev.gabriel.Storage.servise;

import org.springframework.stereotype.Service;
import java.util.List;

import dev.gabriel.Storage.model.ImageLogo;
import dev.gabriel.Storage.repository.LogoRepository;


@Service
public class LogoServise {

    private final LogoRepository logoRepository;

    public LogoServise(LogoRepository logoRepository){
        this.logoRepository = logoRepository;
    }
    
    public List<ImageLogo> getAll() {return logoRepository.findAll();}
}
