package utility;

import java.util.Random;

public final class Crittografia {
    private static Crittografia instance;

    private Crittografia() { 
    }
    
    public static Crittografia getInstance() {
        if(instance == null) {
            instance = new Crittografia();
        }
        return instance;
    }
public String getPassword(){    
    String password="";
    Random r =new Random();     
    do {
    char casuale= (char) (r.nextInt(123));
    if((casuale>=48 && casuale<=52)||(casuale>=65&& casuale<=90)||(casuale>=97&& casuale<=122)){
    	password=password+casuale;
    	
    }
   
    }while(password.length()<8);
    return password;
}

}