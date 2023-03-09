package fr.simplon.lordofsimplon.api.player;

import fr.simplon.lordofsimplon.api.heroes.IHeroe;
import fr.simplon.lordofsimplon.impl.heroes.Heroe;
import org.junit.jupiter.api.*;


class PlayerTest {
    private Player test_player;
    @BeforeEach
       public void testInitialisation() {
       IHeroe test_heroe = new Heroe("Superwoman", null);
       test_player = new Player (test_heroe, "Lauriane", 0);
        }

    @Test
    public void testGetHeroe(){
        String expectedName = "Superwoman";
        IHeroe actualHeroe = test_player.getHeroe();
        Assertions.assertEquals(expectedName, actualHeroe.getName(), "Le nom obtenu est différent de celui attendu.");
    }

    @AfterEach
    public void testEnd() {
        test_player = null;
    }
}