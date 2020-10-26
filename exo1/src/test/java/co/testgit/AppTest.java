package co.testgit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
// issounami
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    void helloBoyAndGirl(){
        assertEquals("Hello World", App.helloBoyAndGirl(null), "null");
    }

    @Test

    void helloTrystan() {
        assertEquals("Hello Trystan", App.helloTrystan(""));
    }
}
