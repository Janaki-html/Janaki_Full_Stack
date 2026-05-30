import java.util.*;

public class May30_1 {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        //Count digits
//        int n=156;
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n/10;
//        }
//        System.out.println(count);

        //Sum of digits
//        int n=156;
//        int sum=0;
//        while(n!=0){
//            int r=n%10;
//            sum=sum+r;
//            n=n/10;
//        }
//        System.out.println(sum);

        //Reverse a number
//        int n=156;
//        int num=0;
//        while(n!=0){
//            int r=n%10;
//            num=num*10+r;
//            n=n/10;
//        }
//        System.out.println(num);

        //Check palindrome for string
        String s="amma";
        String st="";
        for(int i=s.length()-1; i>=0; i--){
            st=st+s.charAt(i);
        }
        System.out.println(st);
        if(st.equals(s)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

        //Check Palindrome for an number
//        int n=121;
//        int original=n;
//        int num=0;
//        while(n!=0){
//            int r=n%10;
//            num=num*10+r;
//            n=n/10;
//        }
//        if(num==original){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }

        //Largest of three numbers
//        int a=n.nextInt();
//        int b=n.nextInt();
//        int c=n.nextInt();
//        int large=0;
//        if(a>b && a>c){
//            large=a;
//        }
//        else if(b>a && b>c){
//            large=b;
//        }
//        else{
//            large=c;
//        }
//        System.out.println(large);

        //first non repeated character
//        String s="aabbcdde";
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0; i<s.length();i++){
//            if(h.containsKey(s.charAt(i))){
//                h.put(s.charAt(i),h.get(s.charAt(i))+1);
//            }
//            else{
//                h.put(s.charAt(i),1);
//            }
//        }
//        for (int i=0; i<=s.length(); i++){
//            if(h.get(s.charAt(i))==1){
//                System.out.println(s.charAt(i));
//                break;
//            }
//        }
        //Frequency of character
//        String s="janakin";
//        HashMap<Character,Integer> h=new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(h.containsKey(s.charAt(i))){
//                h.put(s.charAt(i),h.get(s.charAt(i))+1);
//            }
//            else{
//                h.put(s.charAt(i),1);
//            }
//        }
//        System.out.println(h);

        //Missing Number
//        int[] a={1,2,3,4,5,6,8};
//        for(int i=0;i<a.length-1;i++){
//            if(a[i+1]!=a[i]+1){
//                System.out.println(a[i]+1);
//            }
//        }

        //Reverse words
//        String S="i love java";
//        String[] s1=S.split(" ");
//        for(int i=s1.length-1;i>=0; i--){
//            System.out.print(s1[i]+" ");
//        }

        //Reverse a words without split
//        String s="i love java ";
//        Stack<String > st=new Stack();
//        String word="";
//        for(int i=0; i<s.length();i++){
//            if (s.charAt(i)!=' '){
//                word=word+s.charAt(i);
//            }
//            if(s.charAt(i)==' '){
//                st.push(word);
//                word="";
//            }
//        }
//        System.out.println(st.pop());

        //Remove duplicates from an array

        int[] a={1,2,3,1,1,2};
        for(int i=0; i<a.length;i++) {
            boolean isdup=false;
            for(int j=0; j<i;j++){
                if(a[i]==a[j]){
                    isdup=true;
                    break;
                }
            }
            if(!isdup){
                System.out.println(a[i]);
            }
        }

    }
}
