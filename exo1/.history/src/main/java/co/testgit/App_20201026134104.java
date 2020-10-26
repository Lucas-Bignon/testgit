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


    public static String helloRomain(String name){
        
        String helloPrenom = "Hello Romain"; 
        if(name == ""){
            name = helloPrenom;  
        }
        return name; 
    }

    public static String helloAmin(String name){
        
        String helloPrenom = "Hello Amin"; 
        if(name == ""){
            name = helloPrenom;  
        }
        return name; 
    }

    
    public static String helloAurelie(String name){
        String aurelie = "Hello Aurélie";
        if (name == "") {
          name = aurelie;
        }
        return name;
        
        
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
        return name;
    }

}
