package dev.gabriel.Storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.gabriel.Storage.model.Manga;

public interface MangaRepository extends JpaRepository<Manga,Long> {
}
