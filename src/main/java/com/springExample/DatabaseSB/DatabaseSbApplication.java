package com.springExample.DatabaseSB;

import com.springExample.DatabaseSB.model.Album;
import com.springExample.DatabaseSB.model.Song;
import com.springExample.DatabaseSB.service.AlbumService;
import com.springExample.DatabaseSB.service.implementation.SongService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@SpringBootApplication
@Log
public class DatabaseSbApplication implements CommandLineRunner {

	SongService songService;
	AlbumService albumService;



	public DatabaseSbApplication(SongService songService, AlbumService albumService) {
		this.songService = songService;
		this.albumService = albumService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DatabaseSbApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("stating the application.");
		log.info("creating objects of Album and Song");
		Album album=new Album();
		album.setAlbumId(1);
		album.setAlbumName("myAlubum");

		Song song1= new Song();
		song1.setSongId(1);
		song1.setSongName("zindagi ek safar hai suhana");
		song1.setAlbum(album);

		Song song2= new Song();
		song2.setSongId(2);
		song2.setSongName("disco dancer");
		song2.setAlbum(album);

		List<Song> album1Songs=new ArrayList<>();
		album1Songs.add(song1);
		album1Songs.add(song2);

		album.setSongs(album1Songs);

		log.info("object creation complete");

		log.info("saving into DB");
		albumService.addAlbum(album);
		log.info("done saving");

	}
}
