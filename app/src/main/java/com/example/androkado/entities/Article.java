package com.example.androkado.entities;

import java.io.Serializable;

public class Article implements Serializable {
    private String libelle;
    private Float price;
    private String description;
    private int degree;
    private String url;

    public Article() {
    }

    public Article(String libelle, Float price, String description, int degree, String url) {
        this.libelle = libelle;
        this.price = price;
        this.description = description;
        this.degree = degree;
        this.url = url;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Article{" +
                "libelle='" + libelle + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", degree=" + degree +
                ", url='" + url + '\'' +
                '}';
    }
}
