package dev.gabriel.Storage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gabriel.Storage.model.Manga;
import dev.gabriel.Storage.servise.MangaServise;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/manga")

public class MangaController {

    //injeção de dependencia
    private final MangaServise mangaServise;

    public MangaController(MangaServise mangaServise){
        this.mangaServise = mangaServise;
    }

    @GetMapping
    public List<Manga> getAll() {return mangaServise.getAll();}

    @PostMapping
    public Manga create(@RequestBody Manga manga) {return mangaServise.save(manga);}

    @PutMapping
    public List<Manga> update(@RequestBody Manga manga){return mangaServise.update(manga);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {mangaServise.delete(id);}
}
