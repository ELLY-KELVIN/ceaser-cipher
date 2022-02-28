
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose what to do: \n 1. Encrypt. \n 2.Decrypt. \n 3. Exit ");
        //users input
        int decision = scanner.nextInt();
        scanner.nextLine();


        if (decision==1) {
            System.out.println("Enter message to be encrypted");
            String inputMessage = scanner.nextLine().toUpperCase();//chainig methods
            System.out.println("Choose a key to cipher the message");
            int encryptingKey = scanner.nextInt();
            Encrypt encrypt = new Encrypt(encryptingKey,inputMessage);
            System.out.println(String.format("Ciphered Message is: %s " ,encrypt.encode()) );

        }
        else if (decision == 2) {
            System.out.println("Enter message to decrypt");
            String diciphered = scanner.nextLine().toUpperCase();
            System.out.println("Choose the decrypting key from your keyboard");
            int decryptKey = scanner.nextInt();
            Decrypt decrypt = new Decrypt(decryptKey, diciphered);
            System.out.println(String.format("Your diciphered message is: %s", decrypt.decode()) );

        }
        else if (decision ==3){
            System.exit(0);
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}




