package com.springExample.DatabaseSB.service.implementation;

import com.springExample.DatabaseSB.model.Song;
import com.springExample.DatabaseSB.repository.SongRepository;
import com.springExample.DatabaseSB.service.implementation.SongService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Log
@Service
public class SongServiceImpl  implements SongService {

    SongRepository songRepository;


    public SongServiceImpl(SongRepository songRepository) {
        log.info("inside SongServiceImpl Constructor");
        this.songRepository = songRepository;
        log.info("completed SongServiceImpl Constructor");
    }

    @Override
    public List<Song> getAllSongs() {
        log.info("inside SongServiceImpl.getAllSongs method");
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public Optional<Song> getSongById(int id) {
        log.info("inside SongServiceImpl.getSongById method");
        return songRepository.findById(id);
    }

    @Override
    public void addSong(Song song) {
        log.info("inside SongServiceImpl.addSong method");
        songRepository.save(song);
    }
}
