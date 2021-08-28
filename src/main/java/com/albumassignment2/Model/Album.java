package com.albumassignment2.Model;

import com.albumassignment2.validName.ValidName;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

public class Album {

    @Id
    private String id;
    @Length(max = 10)
    private String name;
    private String description;
    private String coverPicUrl;
    @ValidName
    private String createdBy;

    public Album(String name, String description, String coverPicUrl,String createdBy) {
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
        this.createdBy = createdBy;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
