package com.exercises.applicationProg2;

public class Produit {
    int id;
    String nom;
    String description;
    float prixUnitaire;
    public enum categorie{
        ORDINATEUR , TELEPHONE , ACCESSOIRE
    }

    @Override
    public String toString(){
        return "id :" + this.id + " ,  nom :" + this.nom ;
    }

    public Produit(int id, String nom, String description, float prixUnitaire) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prixUnitaire = prixUnitaire;
    }

    public int getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }

    public void baisserPrix(float pourcentage){
        float prixPourcentage = pourcentage * prixUnitaire / 100;
        System.out.println(pourcentage);
    }

    public static void main(String args[]){
        var p1 = new Produit(1,"pizza","azerty",30);
        var p2 = new Produit(2,"tacos","azerty",30);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}
