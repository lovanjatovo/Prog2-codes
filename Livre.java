package com.Robot.Library;

import java.time.LocalDate;

public class Livre {
    public enum Genre {
        ROMANCE , ACTION , THRILLER , POLICIER , EDUCATIF
    }
    int idLivre;
    String titre;
    int nombrePages;
    LocalDate dateParution;
    String resume;
    Auteur auteur;
    Genre genre;

    public Livre(Livre oeuvre) {
        if (oeuvre != null){
            this.idLivre = oeuvre.idLivre;
            this.titre = oeuvre.titre;
            this.nombrePages = oeuvre.nombrePages;
            this.dateParution = oeuvre.dateParution;
            this.resume = oeuvre.resume;
            this.auteur = oeuvre.auteur;
            this.genre = oeuvre.genre;
        }
    }

    public Livre(int idLivre, String titre, int nombrePages, LocalDate dateParution, String resume, Auteur auteur, Genre genre) {
        this.idLivre = idLivre;
        this.titre = titre;
        this.nombrePages = nombrePages;
        this.dateParution = dateParution;
        this.resume = resume;
        this.auteur = auteur;
        this.genre = genre;
    }

    public int getIdLivre() {
        return idLivre;
    }

    public String getTitre(){
        return titre;
    }

    public String getResume() {
        return resume;
    }

    public int getNombrePages(){
        return nombrePages;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public Genre getGenre() {
        return genre;
    }
}
