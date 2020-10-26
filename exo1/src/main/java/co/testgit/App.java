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

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String helloTrystan(String name) {

        String trystan = "Hello Trystan";

        if (name == "") {
            name = trystan;
        }
        return trystan;
    }
}
