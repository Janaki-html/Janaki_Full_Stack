import java.util.Scanner;

public class May5_StringsPractice {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        // Reverse String

//        System.out.print("Enter the string: ");
//        String s= in.next();    // s=janaki j=0 a=1 n=2 a=3 k=4 i=5
//        for (int i=s.length()-1; i>=0;i--){   // i=6 -1 =5 to 0
//            System.out.print(s.charAt(i));
//        }

        // String palindrome
//        System.out.print("Enter the string:");
//        String s=in.next();
//        String s1="";
//        for (int i=s.length()-1; i>=0; i--){
//            s1+=s.charAt(i);
//        }
//        if(s.equals(s1)){
//            System.out.print("Palindrome");
//        }
//        else{
//            System.out.print("Not Palindrome");
//        }

        // Count Vowels

//        System.out.print("Enter the String:");
//        String s= in.next();
//        int count=0;
//        for (int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='a'){
//                count+=1;
//            } else if (s.charAt(i)=='e') {
//                count+=1;
//            } else if (s.charAt(i)=='i') {
//                count+=1;
//            }
//            else if(s.charAt(i)=='o'){
//                count+=1;
//            }
//            else if (s.charAt(i)=='u') {
//                count+=1;
//            }
//        }
//        System.out.print(count);

        //Remove Space

        System.out.print("Enter the String:");
        String s= in.next();
//        s.replace(" ","");
//        System.out.print(s);
        String result=" ";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                result+=s.charAt(i);
            }
        }
        System.out.print(result);
    }
}
