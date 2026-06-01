package com.Robot.Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;


public class BibliothequeTest {
    private Bibliotheque bibliotheque;
    private Auteur auteur1;
    private Livre livre1;
    private Livre livre2;

    @BeforeEach
        // donnees de depart
    void setUp() {
        // Given
        bibliotheque = new Bibliotheque(1, "Andraharo", "Andraharo lot 54", "Antananarivo", new ArrayList<>(), new ArrayList<>());
        auteur1 = new Auteur(1, "Ada", "Lovelace", "A.LovelaC", LocalDate.of(1802, 2, 26), "Angleterre", null, Auteur.GenreAuteur.FEMININ);
        livre1 = new Livre(3, "Malices", 300, LocalDate.of(1862, 4, 3), "Les deux francais enfuis", auteur1, Livre.Genre.THRILLER);
        livre2 = new Livre(4, "les Adorables", 210, LocalDate.of(1816, 4, 5), "Deux francais qui s'aiment amoureusement", auteur1, Livre.Genre.ROMANCE);
    }

    @Test
    void testAjoutLivre() {
        //when
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        //then
        assertEquals(2, bibliotheque.biblio.size(), "bibliotheque contenant 2 livres");
        /* assertTrue(bibliotheque.retirerLivreParId().stream()
                .noneMatch(livre1 -> livre1.retirerLivreParId() == 3)); // noneMatch == aucune correspondance # anyMatch  */
    }

    @Test
    void testEnleverLivre() {
        // When
        bibliotheque.retirerLivreParId(3);

        // then
        assertEquals(1, bibliotheque.biblio.size(), "enlevement d'un livre par son id");
    }

    @Test
    void testListerTitreLivre(){
        // when
        bibliotheque.listerTitreLivres();

    }
}
