package com.springExample.DatabaseSB.repository;

import com.springExample.DatabaseSB.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song,Integer> {
}
