public class HalfTheString {
    public static void main(String[] args) {
        String stringerino = "TSM WILL WIN WORLDS THIS YEAR ";
        if (stringerino.length()%2==0){
            for (int i = 0; i <(stringerino.length()/2) ; i++) {
                System.out.print(stringerino.charAt(i));
            }
        }else{
            System.out.println("The String is invalid");
        }
    }
}
