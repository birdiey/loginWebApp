package za.ac.tut.business;

public class Details {


    public Details() {
    }

    public String verification(String name, String word) {
        
        String message = "Hello";

        if (name.equals("app") && word.equals("123")) {
            message = "Welcome!!!";
             
        } else {
            message = "Invalid login . Contact admin";
           
        }
        
        return message;
    }
    
}
