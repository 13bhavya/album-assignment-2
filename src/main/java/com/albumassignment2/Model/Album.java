package com.albumassignment2.Model;

public class Album {

    private int AlbumId;
    private String name;
    private String description;
    private String coverPicUrl;

    public Album(int albumId, String name, String description, String coverPicUrl) {
        AlbumId = albumId;
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
    }

    public int getAlbumId() {
        return AlbumId;
    }

    public void setAlbumId(int albumId) {
        AlbumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
}
