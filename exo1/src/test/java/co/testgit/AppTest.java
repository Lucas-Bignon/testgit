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
<<<<<<< HEAD
    @Test
    void helloLucas(){
        assertEquals("Hello Lucas", App.helloLucas(""));
    @Test
    void helloRomain(){
        assertEquals("Hello Romain", App.helloRomain("")); 
>>>>>>> e4f9634f3d88f629f7543cd19e1a40eeff4f3619
    }
}
