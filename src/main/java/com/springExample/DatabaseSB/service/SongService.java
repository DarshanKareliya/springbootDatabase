package com.springExample.DatabaseSB.service.implementation;

import com.springExample.DatabaseSB.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {

    List<Song> getAllSongs();

    Optional<Song> getSongById(int id);

    void addSong(Song song);
}
