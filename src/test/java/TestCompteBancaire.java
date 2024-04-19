import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCompteBancaire {

    @Test
    public void TestCrediter() {
        CompteBancaire cb = new CompteBancaire(50);

        // cas 1: on crédite 20
        cb.crediterSolde(20);

        assertEquals(70, cb.getSolde());

        // cas 2: on crédite un chiffre négatif
        cb.crediterSolde(-20);

        assertEquals(70, cb.getSolde());
    }

    @Test
    public void TestDebiter() {
        CompteBancaire cb = new CompteBancaire(50);

        // cas 1: on debite 20
        cb.debiterSolde(20);

        assertEquals(30, cb.getSolde());

        // cas 2: on débite un chiffre négatif
        cb.crediterSolde(-20);

        assertEquals(30, cb.getSolde());
    }
}
