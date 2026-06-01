package com.Robot.Library;

import java.time.LocalDate;

public class Auteur {
    public enum GenreAuteur {
        MASCULIN , FEMININ , AUTRES
    }
    int idAuteur;
    String nomFamille;
    String prenom;
    static String nomAuteur;
    LocalDate dateNaissance;
    String pays;
    Livre oeuvre;
    private GenreAuteur sexe;

    public Auteur(Auteur auteur) {
        if(oeuvre != null){
            this.idAuteur = auteur.idAuteur;
            this.nomAuteur = auteur.nomAuteur;
            this.nomFamille = auteur.nomFamille;
            this.prenom = auteur.prenom;
            this.dateNaissance = auteur.dateNaissance;
            this.pays = auteur.pays;
            this.oeuvre = auteur.oeuvre;
            this.sexe = auteur.sexe;
        }
    }

    public Auteur(int idAuteur, String nomFamille, String prenom, String nomAuteur, LocalDate dateNaissance, String pays, Livre oeuvre, GenreAuteur sexe) {
        this.idAuteur = idAuteur;
        this.nomFamille = nomFamille;
        this.prenom = prenom;
        this.nomAuteur = nomAuteur;
        this.dateNaissance = dateNaissance;
        this.pays = pays;
        this.oeuvre = oeuvre;
        this.sexe = sexe;
    }

    public int getIdAuteur() {
        return idAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public Livre getOeuvre() {
        return oeuvre;
    }

}
