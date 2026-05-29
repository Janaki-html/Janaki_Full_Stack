import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class May25_1 {
    public static void main(String[] arge){
        Scanner in=new Scanner((System.in));

        //ArrayList

//        ArrayList<Integer> a= new ArrayList<>();
//        a.add(10);
//        a.add(20);
//        a.add(30);
//        System.out.println(a);
//        a.remove(0);
//        System.out.println(a);
//        System.out.println(a.get(1));
//        a.set(1,22);
//        System.out.println(a);
//
//        for(int i=0; i<a.size(); i++){
//            System.out.println(a.get(i));
//        }

        //HashMap

//        HashMap<String, Integer> map=new HashMap<>();
//        map.put("janaki",98);
//        map.put("janu",99);
//        map.put("jan",99);
//        System.out.println(map);
//        map.remove("jan");
//        System.out.println(map);
//        System.out.println(map.get("janaki"));
//
//        for(String key: map.keySet()){
//            System.out.println(key+" "+map.get(key));
//        }

        //Frequency Counting using HashMap method

//        int[] a={1,2,2,3,1};
//        HashMap <Integer,Integer> map=new HashMap<>();
//        for(int i=0; i<a.length;i++){
//            if(map.containsKey(a[i])){   // a[0]=1 map is empty now so false a[1]=2 false a[2]=2 true a[3]=3 false a[4]=1 true
//                map.put(a[i],map.get(a[i])+1);   //2=1+1=2 1=1+1=2
//            }
//            else{
//                map.put(a[i],1);     //1=1 2=1 3=1
//            }
//        }
//        System.out.println(map);

        //Frequency counting for a string

//        String s="jAnaki";
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//            if(map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }
//            else {
//                map.put(s.charAt(i),1);
//            }
//        }
//        System.out.println(map);

        //Duplicates for string
//        String a="janaki";
//        HashMap<Character,Integer> h=new HashMap<>();
//        for(int i=0; i<a.length(); i++){
//            if(h.containsKey(a.charAt(i))){
//                h.put(a.charAt(i),h.get(a.charAt(i))+1);
//            }
//            else{
//                h.put(a.charAt(i),1);
//            }
//            if(h.get(a.charAt(i))>1){
//                System.out.println(a.charAt(i));
//            }
//        }

        //Duplicates for array

//        int[] a={1,2,2,3,5};
//        HashMap<Integer,Integer> h=new HashMap<>();
//        for(int i=0; i<a.length; i++){
//            if(h.containsKey(a[i])){
//                h.put(a[i],h.get(a[i])+1);
//            }
//            else{
//                h.put(a[i],1);
//            }
//            if(h.get(a[i])>1){
//                System.out.println(a[i]);
//            }
//        }
        //Count words

//        String s="One day i will become a software engineer @ AMAZON";
//        HashMap<String,Integer> h=new HashMap<>();
//        String[] words=s.split(" ");
//        for(int i=0; i<words.length; i++){
//            if(h.containsKey(words[i])) {
//                h.put(words[i], h.get(words[i])+1);
//            }
//            else {
//                h.put(words[i],1);
//            }
//        }
//        System.out.println(h);

    }
}
