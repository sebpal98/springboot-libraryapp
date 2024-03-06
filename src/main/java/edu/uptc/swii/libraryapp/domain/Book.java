package edu.uptc.swii.libraryapp.domain;

public class Book {

    private String name;
    private String description;
    private String imagenUrl;

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

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", description=" + description + ", imagenUrl=" + imagenUrl + "]";
    }

}