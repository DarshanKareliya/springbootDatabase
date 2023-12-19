package com.springExample.DatabaseSB.service.implementation;

import com.springExample.DatabaseSB.model.Album;
import com.springExample.DatabaseSB.repository.AlbumRepository;
import com.springExample.DatabaseSB.service.AlbumService;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log
@Service
public class AlbumServiceImpl implements AlbumService {

    AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        log.info("inside AlbumServiceImpl Constructor");
        this.albumRepository = albumRepository;
        log.info("completed AlbumServiceImpl Constructor");
    }


    @Override
    public List<Album> getAllAlbums() {
        return (List<Album>) albumRepository.findAll();
    }

    @Override
    public Optional<Album> getAlbumById(int id) {
        return albumRepository.findById(id);
    }

    @Override
    public void addAlbum(Album album) {
        albumRepository.save(album);
    }
}
