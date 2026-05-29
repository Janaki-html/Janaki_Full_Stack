
public class May25_2 {

    //Print 1to n
//    static void print(int n) {
//        if (n == 0) {
//            return;
//        }
//        print(n - 1);
//        System.out.println(n);
//    }

   // print n to 1
//    static void print(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }

    //sum of first n natural numbers

//    static int sum(int n) {
//        if(n==0){
//            return 0;
//        }
//        return n + sum(n-1);
//    }

    //Factorial using recursion

//    static int fact(int n){
//        if(n==0){
//            return 1;
//        }
//        return n * fact(n - 1);
//
//    }

    //Power function

//    static double power(int n){
//        if(n==0){
//            return 0;
//        }
//        return Math.pow(n,n+1);
//
//    }

    //Fibonacci

    static int fib(int n){
        if(n==0|| n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    //Reverse a string

//    static void rev(String s,int i){
//        if(i<0){
//            return;
//        }
//        System.out.println(s.charAt(i));
//        rev(s,i-1);
//    }

    //Count digits

    static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args){
        System.out.println(count(123));
    }
}
