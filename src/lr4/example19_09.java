package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class example19_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alphabet = "abcdefghigklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String numbers = "1234567890";
        String symbols = "~`!@#$%^&*()_+-=[]{}\\|'\"/?.,<>";
        char[] alphabetArray = new char[alphabet.length()];
        alphabetArray = alphabet.toCharArray();
        char[] numbersArray = new char[numbers.length()];
        numbersArray = numbers.toCharArray();
        char[] symbolsArray = new char[symbols.length()];
        symbolsArray = symbols.toCharArray();

        System.out.println("Enter the message you want to encrypt:");
        String message = in.nextLine();
        char[] messageArray = new char[message.length()];
        messageArray = message.toCharArray();

        System.out.println("Enter the encryption key:");
        int key = in.nextInt();

        for(int i = 0; i < messageArray.length; i++){
            char curentChar = messageArray[i];

            if (Character.isWhitespace(curentChar)){
                continue;
            }
            else if (Character.isLetter(curentChar)){
                char tempChar = curentChar;
                if (Character.isUpperCase(curentChar)){
                    curentChar = Character.toLowerCase(curentChar);
                }
                for (int j = 0; j < alphabetArray.length; j++){
                    if (curentChar == alphabetArray[j]){
                        if (j + key <= alphabetArray.length){
                            curentChar = alphabetArray[j + key];
                            break;
                        }
                        else{
                            int diff = j + key - alphabetArray.length;
                            curentChar = alphabetArray[diff];
                            break;
                        }

                    }
                }
                if (Character.isUpperCase(tempChar) && Character.isLowerCase(curentChar)){
                    curentChar = Character.toUpperCase(curentChar);
                }
                messageArray[i] = curentChar;
            }
            else if (Character.isDigit(curentChar)){
                for (int j = 0; j < numbersArray.length; j++){
                    if (curentChar == numbersArray[j]){
                        if (j + key <= numbersArray.length){
                            curentChar = numbersArray[j + key];
                            break;
                        }
                        else{
                            int diff = j + key - numbersArray.length;
                            curentChar = numbersArray[diff];
                            break;
                        }

                    }
                }
                messageArray[i] = curentChar;
            }
            else {
                for (int j = 0; j < symbolsArray.length; j++){
                    if (curentChar == symbolsArray[j]){
                        if (j + key <= symbolsArray.length){
                            curentChar = symbolsArray[j + key];
                            break;
                        }
                        else{
                            int diff = j + key - symbolsArray.length;
                            curentChar = symbolsArray[diff];
                            break;
                        }

                    }
                }
                messageArray[i] = curentChar;
            }
        }

        String result = Arrays.toString(messageArray);
        System.out.print("Encrypted message: " + result);

        in.close();
    }
}
