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
    void helloLucas(){
        assertEquals("Hello Lucas", App.helloLucas(""));
    }

    @Test
    void helloRomain(){
        assertEquals("Hello Romain", App.helloRomain("")); 
    }
        @Test
        void helloAmin(){
            assertEquals("Hello Lucas", App.helloAmin(""));

    }
}
