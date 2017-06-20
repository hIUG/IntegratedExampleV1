package com.e.c.a.h.integratedexamplev1.data.model;

/**
 * Created by hugoa on 5/12/2017.
 */

public class CharacterModel {
    private String id;
    private String name;
    private String description;
    private String thumbnail;
    private String image;

    public CharacterModel() {
    }

    public CharacterModel(String id, String name, String description, String thumbnail, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.image = image;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
