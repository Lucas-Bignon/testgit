package co.testgit;

/**
 * Hello world!
 */
public final class App {
    private App() {
		throw new IllegalStateException("Test class");
	}
    public static String helloBoyAndGirl(String name){
        return "Hello World";
    }
    public static String helloLucas(String name){
        return "Hello Lucas";
    }


    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
