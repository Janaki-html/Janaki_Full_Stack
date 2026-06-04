import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class June2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Count digits
//        int n=in.nextInt();
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n/10;
//        }
//        System.out.println(count);

        //Reverse number
//        int num=0;
//        int n=in.nextInt();
//        while(n!=0){
//            int r=n%10;
//            num=num*10+r;
//            n=n/10;
//        }
//        System.out.println(num);

        //Move zeros to end
//        int[] a={1,0,5,0,4};
//        int index=0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]!=0){
//                a[index]=a[i];
//                index++;
//            }
//        }
//        while(a.length>index){
//            a[index]=0;
//            index++;
//        }
//        for(int i=0; i<a.length;i++) {
//            System.out.println(a[i]);
//        }

        //Remove duplicates from an array

//        int[] a={1,2,3,3,2};
//        for(int i=0; i<a.length; i++){
//            boolean isdup=false;
//            for(int j=0; j<i;j++){
//                if(a[i]==a[j]){
//                    isdup=true;
//                    break;
//                }
//            }
//            if(!isdup){
//                System.out.println(a[i]);
//            }
//        }

        // Reverse a word from the sentence
        String s="I LOve Java";
        Stack<Character> st=new Stack<>();
        boolean isdup=false;
        for(int i=0; i< s.length();i++){
            if(s.charAt(i)==' '){
                isdup=true;
            }
            if(s.charAt(i)!=' '){
                st.push(s.charAt(i));
            }
        }
        System.out.println(st.pop());

        //Amstrong Number
//        int n=153;
//        int o=n;
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n/10;
//        }
//        System.out.println(count);
//        int sum=0;
//        int s=0;
//        while(o!=0){
//            int r=o/10;
//            for (int i=1; i<=count;i++){
//                s=sr^i;
//            }
//            o=o/10;
//        }
//        System.out.println(s);

        // Check whether the array is sorted or not
//        int[] a={6,1,2,3,4,5};
//        boolean issorted=true;
//        for (int i=0; i<a.length-1;i++){
//            if (a[i + 1] < a[i]) {
//                issorted = false;
//                break;
//            }
//        }
//        if(!issorted){
//            System.out.println("sorted");
//        }
//        else{
//            System.out.println("not");
//        }
    }
}
