import java.sql.Array;
import java.util.*;

public class May29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Large element of an array
//        int[] a= new int[5];
//        for (int i=0; i<a.length;i++){
//            a[i]=in.nextInt();
//        }
//        int large=a[0];
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]>=large){
//                large=a[i];
//            }
//        }
//        System.out.println(large);

        //Reverse an array
//        int[] a=new int[6];
//        for(int i=0; i<a.length; i++){
//            a[i]=in.nextInt();
//        }
//        for(int i=a.length-1;i>=0; i--){
//            System.out.println(a[i]);
//        }

        //Reverse an string using stack

//        String s="janaki";
//        Stack st=new Stack();
//        for (int i=0;i<s.length();i++){
//            st.push(s.charAt(i));
//        }
//        for(int i=0; i<=s.length(); i++){
//            System.out.println(st.pop());
//            i++;
//        }

        //palindrome of string
//        String s="amma";
//        String  rev="";
//        for(int i=s.length()-1; i>=0; i--){
//            rev=rev+s.charAt(i);
//        }
//        if(rev.equals(s)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }

        //Second Largest element

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int largest = a[0];
        int second = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >largest || a[i] > second) {
                second = largest;
                largest=a[i];

            }
        }
        System.out.println(second);

        //Count vowels

//        String s="janaki";
//        int count=0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
//                count++;
//            }
//        }
//        System.out.println(count);
        //Frequency Count of an array using hashmap

//        int[] a={1,2,3,1,2};
//        HashMap<Integer, Integer> h=new HashMap<>();
//        for(int i=0; i<a.length;i++){
//            if(h.containsKey(a[i])){
//                h.put(a[i],h.get(a[i]+1));
//            }
//            else{
//                h.put(a[i],1);
//            }
//        }
//        System.out.println(h);

        //First Non-repeated character

//        String s = "aabbcddef";
//        HashMap<Character, Integer> h = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (h.containsKey(s.charAt(i))) {
//                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
//            } else {
//                h.put(s.charAt(i), 1);
//            }
//        }
//        System.out.println(h);
//        for(int i=0; i<s.length();i++){
//           if(h.get(s.charAt(i))==1){
//               System.out.println(s.charAt(i));
//               break;
//           }
//        }

        //Valid Parantheses

//        String s="(()())";
//        String o=s;
//        Stack st=new Stack();
//        boolean balance=true;
//        for(int i=0; i<s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                st.push('(');
//                balance=true;
//            }
//            else {
//                if(st.isEmpty()){
//                    System.out.println("Stack is empty");
//                    balance=false;
//                }
//                st.pop();
//            }
//        }
//        if(!st.isEmpty()){
//            System.out.println("Stack is full");
//            balance=false;
//        }
//        System.out.println(balance);

        //Reverse string using stack

//        String s="janaki";
//        Stack st=new Stack();
//        for(int i=s.length()-1; i>=0;i--){
//            st.push(s.charAt(i));
//        }
//        System.out.println(st);

        //Implementation of Queue using array

//        Queue q= new Queue(5);
//        q.Enqueue(10);
//        q.Enqueue(20);
//        System.out.println(q.data);
//
//
//    }
//}
////Queue Implementation
//class Queue{
//    int size;
//    int a[];
//    int front;
//    int data;
//    int rear;
//    Queue(int size){
//        this.size=size;
//        a=new int[size];
//        front=-1;
//        rear=-1;
//    }
//
//    //Enqueue
//    void Enqueue(int data){
//            if (rear == size - 1) {
//                System.out.println("Queue is Full");
//            }
//            if(front==-1){
//                front=0;
//            }
//            rear++;
//            a[rear]=data;
//    }
//    void Dequeue(int data){
//        if(front==-1|| rear<front){
//            System.out.println("Queue is Empty");
//        }
//        System.out.println(a[front]+" "+"removed");
//        front++;
//    }
//    void Peek(int data){
//
    }
}