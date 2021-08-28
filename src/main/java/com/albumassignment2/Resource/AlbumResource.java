package com.albumassignment2.Resource;

import com.albumassignment2.Model.Album;
import com.albumassignment2.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody @Valid Album album){

        return albumService.saveAlbum(album);
    }

    @GetMapping
    public List<Album> getAllAlbum(){
        return albumService.getAllAlbum();
    }

    @GetMapping("/albumId")
    public void getAlbumById(@RequestParam("albumId") @Valid String albumId){
        albumService.getAlbumbyId(albumId);
    }



    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name ="albumId") String albumId ){
        albumService.deleteAlbum(albumId);
    }
}
