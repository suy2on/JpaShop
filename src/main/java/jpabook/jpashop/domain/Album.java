package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item{

    private String artist;
    private String etx;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEtx() {
        return etx;
    }

    public void setEtx(String etx) {
        this.etx = etx;
    }
}
