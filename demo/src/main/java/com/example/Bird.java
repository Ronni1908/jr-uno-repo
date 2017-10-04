package com.example;

/**
 * Created by jro on 26.10.2016.
 */
public class Bird {

    private String Navn;
    private Long Lengde;

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public Long getLengde() {
        return Lengde;
    }

    public void setLengde(Long lengde) {
        Lengde = lengde;
    }

    public Bird(String navn, Long lengde) {
        Navn = navn;
        Lengde = lengde;
    }
}
