import java.util.HashMap;
import java.util.Stack;

public class June3 {
    public static void main(String[] args){

        //Amstrong number checking
//        int n=153;
//        int original=n;
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n/10;
//        }
//        int sum=0;
//        int o=original;
//        while(original!=0){
//            int r=original%10;
//            sum=sum+(int)Math.pow(r,count);
//            original=original/10;
//        }
//        System.out.println(sum);
//        if(o==sum){
//            System.out.println("Amstrong");
//        }
//        else{
//            System.out.println("Not");
//        }

        //count even and odd numbers in a string

//        int n=12345;
//        int even=0;
//        int odd=0;
//        while(n!=0){
//            int r=n%10;
//            if(r%2==0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//            n=n/10;
//        }
//        System.out.println("EVEN NUMBERS:"+even);
//        System.out.println("ODD: "+odd);

        //Strong Number

//        int n=145;
//        int o=n;
//        int fact=0;
//        int sum=1;
//        while(n!=0){
//            int r=n%10;   //r=5
//            for (int i = 1; i <=r ; i++) {
//                sum=sum*i;
//
//            }
//            fact=fact+sum;
//            sum=1;
//            n=n/10;
//        }
//        System.out.println(fact);
//        if(fact==o){
//            System.out.println("Strong");
//        }
//        else{
//            System.out.println("Not");
//        }

        //Factorial
//        int n=5;
//        int fact=1;
//        for(int i=1; i<=n; i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);

        //Check if array sorted or not?

//        int[] a={1,2,3,4,5,6,7};
//        boolean issort=true;
//        for(int i=0; i<a.length-1; i++){
//            if(a[i+1]<a[i]){
//                issort=false;
//            }
//        }
//        if(issort==true){
//            System.out.println("Sorted");
//        }
//        else{
//            System.out.println("Not");
//        }

        //Move zeros to end
//        int[] a={0,1,0,3,0,5,6};
//        int index=0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]!=0){
//                a[index]=a[i];
//                index++;
//            }
//        }
//        while(index<a.length){
//            a[index]=0;
//            index++;
//        }
//        for (int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

        //Find duplicate elements

//        int[] a={1,2,3,2,4,1};
//        for(int i=0; i<a.length; i++){
//            for(int j=i+1; j<a.length; j++){
//                if(a[i]==a[j]){
//                    System.out.println(a[i]);
//                }
//            }
//        }

        //Find missing number
//        int[] a={1,2,3,4,5,6,8,10};
//        for(int i=0; i<a.length-1; i++){
//            if(a[i+1]!=a[i]+1){
//                System.out.println(a[i]+1);
//            }
//        }

        //Reverse a words in sentence
//        String s="Ms.JanakiNanu is a software developer at amazon ";
//        String  word="";
//        Stack<String> st=new Stack<>();
//        for(int i=0; i< s.length(); i++){
//            if(s.charAt(i)!=' ') {
//                word=word+s.charAt(i);
//            }
//            if(s.charAt(i)==' ') {
//                st.push(word);
//                word="";
//            }
//        }
//        while(!st.isEmpty()){
//            System.out.print(st.pop()+" ");
//        }

        //Count words in a sentence

//        String s="One day i will be software developer at amazon my manifestation";
//        int count=1;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)==' '){
//                count++;
//            }
//        }
//        System.out.println(count);

        //Count occurrence of a character

        String s="banana";
        int count=0;
        HashMap<Character, Integer> h=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i), h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i), 1);
            }
        }
        System.out.println(h);
        //Check Anagram

//        String s="abc";
//        String s1="aaa";
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0; i<s.length(); i++) {
//            h.put(s.charAt(i), 1);
//        }
//        boolean yes=false;
//        int index=0;
//        for(int i=0; i<s1.length(); i++){
//            if(h.containsKey(s1.charAt(index))){
//                yes=true;
//            }
//            else {
//                yes=false;
//                break;
//            }
//            index++;
//        }
//        if(yes==true && s.length()==s1.length()){
//            System.out.println("Anagram");
//        }
//        else{
//            System.out.println("Not Anagram");
//        }

        //First Non-repeating character

//        String s="aabbcdde";
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0; i< s.length(); i++){
//            if(h.containsKey(s.charAt(i))){
//                h.put(s.charAt(i), h.get(s.charAt(i))+1);
//            }
//            else{
//                h.put(s.charAt(i), 1);
//            }
//        }
//        for (int i=0; i<s.length(); i++){
//            if(h.get(s.charAt(i))==1){
//                System.out.println(s.charAt(i));
//                break;
//            }
//        }

        //Most frequent character

//        String s="aaaaabbcccddeeff";
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//            if(h.containsKey(s.charAt(i))){
//                h.put(s.charAt(i), h.get(s.charAt(i))+1);
//            }
//            else{
//                h.put(s.charAt(i), 1);
//            }
//        }
//        char b=' ';
//        for(int i=0; i<s.length(); i++){
//        int large=h.get(s.charAt(0));
//            if(h.get(s.charAt(i))>=large){
//                b=s.charAt(i);
//            }
//        }
//        System.out.println(b);

        //Valid Parentheses

//        String s="(()())";
//        boolean isbalance=false;
//        Stack<Character> st=new Stack<>();
//        for (int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='(') {
//                st.push('(');
//                isbalance=true;
//            }
//            else{
//                if(st.isEmpty()){
//                    System.out.println("Stack is Empty");
//                    isbalance=false;
//                }
//                st.pop();
//            }
//        }
//        if(!st.isEmpty()){
//            System.out.println("Stack is full");
//            isbalance=false;
//        }
//        System.out.println(isbalance);

        //Node counting
//        Node first=new Node(10);
//        Node second=new Node(20);
//        Node third=new Node(30);
//        Node fourth=new Node(40);
//        first.next=second;
//        second.next=third;
//        third.next=fourth;
//        int count=0;
//        Node temp=first;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        System.out.println(count);
//    }
//}
////Node counting
//class Node2{
//    int data;
//    Node next;
//    Node2(int data){
//        this.data=data;
//        this.next=null;
    }
}