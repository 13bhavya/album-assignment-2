package com.albumassignment2.Model;

public class User {

    private String id;
    private String name;
    private String email;
    private String photoPhotoUrl;

    public User(String name, String email, String photoPhotoUrl) {
        this.name = name;
        this.email = email;
        this.photoPhotoUrl = photoPhotoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoPhotoUrl() {
        return photoPhotoUrl;
    }

    public void setPhotoPhotoUrl(String photoPhotoUrl) {
        this.photoPhotoUrl = photoPhotoUrl;
    }
}

