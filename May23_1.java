import java.util.Scanner;


public class May23_1 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        // Reverse string

//        String s= "janaki";
//        for(int i=s.length()-1; i>=0;i--){
//            System.out.print(s.charAt(i));
//        }

        // palindrome
//        String s=in.next();
//        String r="";
//        for(int i=s.length()-1; i>=0; i--){
//            r=r+s.charAt(i);
//        }
//        if(s.equals(r)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not");
//        }

        // count vowels

//        String s= in.next();
//        int v=0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o'  || s.charAt(i)=='u' || s.charAt(i)=='i'){
//                v=v+1;
//            }
//        }
//        System.out.println(v);

        //Count uppercase and lowercase of a string

//        String s= in.next();
//        String a=s.toUpperCase();
//        int up=0;
//        int low=0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)==a.charAt(i)){
//                up+=1;
//            }
//            else{
//                low+=1;
//            }
//        }
//        System.out.println(up);
//        System.out.println(low);

        //Remove spaces from string

//        String s="ja nak i";
//        s=s.replace(" ","");
//        System.out.println(s);

        // Frequency of a character

//        String s= "janaki";
//        for(int i=0; i<s.length(); i++){
//            int count=1;
//            for(int j=i+1; j<s.length(); j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count+=1;
//                }
//
//            }
//            System.out.println(s.charAt(i)+"-"+count);
//        }

        //Find duplicates

//        String s="janaki";
//        for(int i=0; i<s.length(); i++){
//            for(int j=i+1; j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    System.out.println(s.charAt(i));
//                }
//            }
//        }

        //Lowercase to uppercase

//        String s="janaki";
//        String re="";
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
//              re=re + (char)(s.charAt(i)-32);
//            }
//        }
//        System.out.println(re);

        // Check array sorted or not

        int[] a={1,2,3,5,6,4};
        boolean f=true;
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    f=false;
                }
                break;
            }
        }
        if(f==false){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("sorted");
        }

        // find missing number

//        int[] a={1,2,4,5};
//        int actual_sum=5*(5+1)/2;
//        int sum=0;
//        for(int i=0; i<a.length; i++){
//            sum=sum+a[i];
//        }
//        int miss=actual_sum-sum;
//        System.out.println(miss);

        // Move zeros to end

//        int[] a={1,0,3,0,6};
//        int[] b=new int[5];
//        int j=0;
//        for(int i=0; i<a.length; i++) {
//            if (a[i] != 0) {
//                b[j] = a[i];
//                j++;
//            }
//
//        }
//        for(int i=0; i<b.length; i++){
//            System.out.println(b[i]+" ");
//        }
    }
}
