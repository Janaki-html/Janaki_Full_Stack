import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static javafx.scene.input.KeyCode.Q;

public class May27 {
    public static void main(String[] args){
        //Stack
//        Stack<Integer> s=new Stack<>();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s);
//        System.out.println(s.pop());
//        System.out.println(s.peek());

        //Stack practice
//        Stack<Integer> s=new Stack<>();
//        s.push(5);
//        s.push(15);
//        s.push(25);
//        s.push(35);
//        s.push(45);
//        s.push(55);
//        s.push(65);
//        System.out.println(s);
//        s.pop();
//        System.out.println(s);
//        System.out.println(s.peek());
//        System.out.println(s.isEmpty());
//        System.out.println(s.size());
//        System.out.println(s.search(15));

        // Stack Traversal

//        Stack<Integer> s=new Stack<>();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }

        //String reverse

//        String s1="janaki";
//        Stack<Character > s=new Stack<>();
//        for(int i=0; i<s1.length(); i++) {
//            s.push(s1.charAt(i));
//        }
//        while ((!s.isEmpty())){
//            System.out.println(s.peek());
//            s.pop();
//        }

        //Reverse a number using stack
//        int number=123;
//        Stack<Integer> s=new Stack<>();
//        while (number!=0){
//            int r=number%10;
//            s.push(r);
//            number=number/10;
//        }
//        System.out.println(s);

        //Balanced parantheses

//        String s="(()())";
//        Stack<Character> st=new Stack<>();
//        boolean balance=true;
//        for(int i=0; i<s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                st.push('(');
//            } else {
//                if (st.isEmpty()) {
//                    balance = false;
//                    break;
//                }
//                st.pop();
//            }
//        }
//            if(!st.isEmpty()){
//                balance=false;
//            }
//        System.out.println(balance);

        // Stack using array

//        int[] stack=new int[3];
//        int top=-1;
//        top++;
//        stack[top]=10;
//        top++;
//        stack[top]=20;
//        top++;
//        stack[top]=30;
//        System.out.println(stack[top]);
//        top--;
//        System.out.println(stack[top]);

        //Queue

        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(15);
        q.add(25);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
