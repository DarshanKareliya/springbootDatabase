package com.springExample.DatabaseSB.repository;

import com.springExample.DatabaseSB.model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlbumRepository extends CrudRepository<Album,Integer> {
}
