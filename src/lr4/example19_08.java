package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class example19_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the message you want to encrypt:");
        String message = in.nextLine();
        System.out.println("Enter the encryption key:");
        int key = in.nextInt();

        char[] messageArray = new char[message.length()];
        int[] encryptedMessageArray = new int[message.length()];
        messageArray = message.toCharArray();

        for(int i = 0; i < messageArray.length; i++){
            encryptedMessageArray[i] = messageArray[i] + key;
        }

        for (int j = 0; j < encryptedMessageArray.length; j++){
            messageArray[j] = (char) encryptedMessageArray[j];
        }

        String result = Arrays.toString(messageArray);
        System.out.print("Encrypted message: " + result);

        in.close();
    }
}
