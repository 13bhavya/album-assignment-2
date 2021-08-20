package com.albumassignment2.repository;

import com.albumassignment2.Model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList<>();

    public Album getAlbum(){
        Album album = new Album(2, "Eminem", "2010 pop songs", "/./");
        return album;
    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbum() {
        return albumList;
    }

    public Album getAlbumbyId(int albumId) {
        for(Album album:albumList){
            if(album.getAlbumId() == albumId){
                return album;
            }
        } return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album al:albumList){
            if(al.getAlbumId() == albumId){
                al.setName(al.getName());
                al.setDescription(al.getName());
                al.setCoverPicUrl(al.getCoverPicUrl());
                return al;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album al:albumList){
            if(al.getAlbumId() == albumId){
                deletedAlbum = al;
                albumList.remove(al);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
