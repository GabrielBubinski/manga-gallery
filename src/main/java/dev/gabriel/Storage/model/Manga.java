package dev.gabriel.Storage.model;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_manga")
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantCap;
    private String imageUrl;

    @CreationTimestamp
    public Instant creationTimeStamp;
    @UpdateTimestamp
    public Instant updateTimeStamp;


    // Construtores
    public Manga() {
    }

    public Manga(Long id, String name, Integer quantCap, String imageUrl, Instant creationTimeStamp,Instant updateTimeStamp) {
        this.id = id;
        this.name = name;
        this.quantCap = quantCap;
        this.imageUrl = imageUrl;
        this.creationTimeStamp = creationTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
    }

    // getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantCap;
    }

    public void setQuantity(Integer quantCap) {
        this.quantCap = quantCap;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Instant getcreationTimeStamp() {
        return creationTimeStamp;
    }

    public void setcreationTimeStamp(Instant creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }
    public Instant getupdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setupdateTimeStamp(Instant updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

}


