import java.util.Scanner;

public class CountVowels {


    public static void main(String args[]){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String enteredText = "";
        int countedLetters = 0;

        System.out.println("Enter a String: ");

        Scanner scanner = new Scanner(System.in);
        enteredText=scanner.nextLine();

        for (int i = 0; i < enteredText.length() ; i++) {
            for (int j = 0; j < vowels.length ; j++) {
                if(enteredText.charAt(i)==vowels[j]){
                    countedLetters++;
                }
            }
        }

        System.out.println(countedLetters);


    }
}
