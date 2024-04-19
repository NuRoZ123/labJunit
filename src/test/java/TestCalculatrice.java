import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatrice {

    @Test
    void testSomme1() {
        Calculatrice c = new Calculatrice();

        assertEquals(5, c.somme(2, 3));
    }

    @Test
    void testProduit() {
        Calculatrice c = new Calculatrice();

        assertEquals(6, c.produit(2, 3));
    }
}
