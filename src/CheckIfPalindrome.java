import java.util.Scanner;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner input = new Scanner(System.in); // scanner
        String enteredString = input.next(); //input = text

        char[] enteredStringReverseArray = new char[enteredString.length()+1];
        char[] omformer = new char[enteredString.length()+1];



        for (int i = 0; i < enteredString.length(); i++) {
            enteredStringReverseArray[enteredString.length()-i] = enteredString.charAt(i); //gør det først bogstav til det bagerste i array

        }

        for (int i = 0; i < enteredString.length(); i++) {
            omformer[i+1] = enteredString.charAt(i);

        }



        String enteredOmformer = new String(omformer);
        String enteredStringReverse = new String(enteredStringReverseArray); // ændre array til String
        System.out.println(enteredString);
        System.out.println(enteredStringReverse);

        /*Nu er String'en reversed */
        String test = enteredStringReverse;

        if(omformer.equals(enteredStringReverseArray)==true){
            System.out.println("Congratz -"+ enteredStringReverse +"- is a palindrome.");
        }else{
            System.out.println("You have failed in life, -"+ enteredStringReverse +"- is not a palindrome.");
        }

    }
}
