package com.springExample.DatabaseSB.service;

import com.springExample.DatabaseSB.model.Album;
import com.springExample.DatabaseSB.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<Album> getAllAlbums();

    Optional<Album> getAlbumById(int id);

    void addAlbum(Album album);
}
