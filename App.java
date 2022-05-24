import java.util.Random;

public class App {

    public static void main(String[] args) {

        StringBuilder token = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rndm = new Random();
        for(int i=0; i<10; i++){
            token.append(characters.charAt(rndm.nextInt(characters.length())));
        }

        System.out.println("Token: "+token);

    }

}
