package com.Robot.Library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static com.Robot.Library.Auteur.GenreAuteur.MASCULIN;
import static com.Robot.Library.Livre.Genre.POLICIER;

public class Bibliotheque {
    private static final Logger log = LoggerFactory.getLogger(Bibliotheque.class);
    int idBibliotheque;
    String nom;
    String addresse;
    String ville;
    ArrayList<Livre> biblio;
    ArrayList<Auteur> listeDesAuteurs;

    @Override
    public String toString(){
        return "nom";
    }

    public Bibliotheque(int idBibliotheque, String nom, String addresse, String ville, ArrayList<Livre> biblio, ArrayList<Auteur> listeDesAuteurs) {
        this.idBibliotheque = idBibliotheque;
        this.nom = nom;
        this.addresse = addresse;
        this.ville = ville;
        this.biblio = biblio != null ? biblio : new ArrayList<>();
        this.listeDesAuteurs = listeDesAuteurs != null ? listeDesAuteurs : new ArrayList<>();
    }

    public void ajouterLivre(Livre nouveauLivre){
        this.biblio.add(nouveauLivre);
    }

    public boolean retirerLivreParId(int idCible){
        for (Livre livre : biblio){
            if(idCible == livre.getIdLivre()){
            biblio.remove(idCible);
                System.out.println("Livre" + livre.getTitre() + " retire avec succes ");
                return true;
            }
        }
        return false ;
    }

    public List<Livre> listerTitreLivres (){
        return biblio.stream().sorted(Comparator.comparing(Livre::getTitre)).collect(Collectors.toList()); // * comment l'utiliser (comparator comparing de stream)
        // ensuite trier les resultats par ordre croissant des titres dans un nouveau tableau et afficher ce tableau
    }

    public ArrayList<Livre> rechercherTitre(String titreCible){
        ArrayList<Livre> titresDisponibles = new ArrayList<>();
        for (Livre livre : biblio){
            if (livre.getTitre().equalsIgnoreCase(titreCible)){
               titresDisponibles.add(livre); // mettre les titresCibles dans un nouveau tableau pour ensuite les parcourir apres et les lister
            }
        }
        return titresDisponibles;
    }

    public ArrayList<Livre> rechercheParGenre(Livre.Genre genreCible) {
        ArrayList<Livre> genreDispo = new ArrayList<>();
        for (Livre livre : biblio) {
            if (livre.getGenre() == genreCible) {
                genreDispo.add(livre);// ici , on doit ajouter chaque livre similaire a genreCible dans un nouveau tableau
            }
        }
        System.out.println("Ci-joint sont les genres de livre similaire a celui que vous recherchez : ");
        return genreDispo;// on doit afficher ici le nouveau tableau contenant la liste des livres de meme genre
    }

    public ArrayList<Livre> rechercherParAuteur(Auteur auteurCible){
        ArrayList<Livre> auteurTrouve = new ArrayList<>();
        for (Livre livre : biblio){
            if (livre.getAuteur().getIdAuteur() == auteurCible.getIdAuteur()){
                auteurTrouve.add(livre);
                // mettre chaque livre trouve ayant le meme auteur dans un nouveau tableau
            }
        }
        return auteurTrouve; // afficher le nouveau tableau contenant les livres scrits par le meme auteur
    }

    public ArrayList rechercherParResume(String motCle){
        ArrayList<Livre> resumeSimilaire = new ArrayList<>();
        for (Livre livre : biblio){
            if (livre.getResume() != null && livre .getResume().toLowerCase().contains(motCle.toLowerCase())){
                resumeSimilaire.add(livre); // mettre chaque resultat dans un nouveau tableau contenant les mots approximativement similaires
            }
        }
        return resumeSimilaire; // retourner le nouveau tableau des resumes similaires a celui qu' on a recherche
    }

    public void afficherGenreDispo(){
        int countRomance = 0;
        int countAction = 0;
        int countThriller = 0;
        int countPolicier = 0;
        int countEducatif = 0;
        for (Livre livre : biblio){
            if (livre.getGenre() == Livre.Genre.ROMANCE){
                countRomance++;
            } else if (livre.getGenre() == Livre.Genre.ACTION) {
                countAction++;
            } else if (livre.getGenre() == Livre.Genre.THRILLER) {
                countThriller++;
            } else if (livre.getGenre() == POLICIER) {
                countPolicier++;
            } else if (livre.getGenre() == Livre.Genre.EDUCATIF) {
                countEducatif++;
            }
        }
        System.out.println("Ci-dessous sont les genres disponibles dans la bibliotheque :");
        System.out.println("Romance : "+countRomance+" , Action : "+countAction+" , Thriller : "+countThriller+" , Policier : "+countPolicier+" , Educatif : "+countEducatif);
    }

    public static void main(String[] args) {
        Auteur Happ = new Auteur(1,"hope","Julian","Happ",LocalDate.of(2000,12,4),"Irlande",null, MASCULIN);
        Livre happy = new Livre(1,"HP",5, LocalDate.of(2008,2,12),"Someone's happy",Happ, POLICIER);
        System.out.println(Happ.idAuteur);
    }
}
