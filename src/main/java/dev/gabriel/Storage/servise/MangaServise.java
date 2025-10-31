package dev.gabriel.Storage.servise;

import org.springframework.stereotype.Service;
import java.util.List;

import dev.gabriel.Storage.model.Manga;
import dev.gabriel.Storage.repository.MangaRepository;

@Service
public class MangaServise {

    private final MangaRepository mangaRepository;

    public MangaServise(MangaRepository mangaRepository){
        this.mangaRepository = mangaRepository;
    }

    //Listar
    public List<Manga> getAll() {return mangaRepository.findAll();}
    //Criar
    public Manga save(Manga manga) {return mangaRepository.save(manga);}
    //Deletar
    public void delete(Long id){mangaRepository.deleteById(id);}
}
