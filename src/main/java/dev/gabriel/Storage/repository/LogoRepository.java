package dev.gabriel.Storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.gabriel.Storage.model.ImageLogo;

public interface LogoRepository extends JpaRepository<ImageLogo,Long>{
    
}
