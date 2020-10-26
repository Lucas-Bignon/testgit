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
<<<<<<< HEAD

    void helloTrystan() {
        assertEquals("Hello Trystan", App.helloTrystan(""));
=======
    void helloLucas(){
        assertEquals("Hello Lucas", App.helloLucas(""));
    }

    @Test
    void helloRomain(){
        assertEquals("Hello Romain", App.helloRomain("")); 
    }
        @Test
        void helloAmin(){
            assertEquals("Hello Amin", App.helloAmin(""));
>>>>>>> 5b0919f43765781fcb86b382f099386da0f0bf7c
    }
}
