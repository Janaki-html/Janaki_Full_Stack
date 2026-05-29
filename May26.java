public class May26 {
    // Factorial

//    static int fact(int a){
//        if(a==0){
//            return 1;
//        }
//        return(a*fact(a-1));
//
//    }

    // Sum of n natural numbers

//    static int sum(int a){
//        if(a==0){
//            return 0;
//        }
//        return a+sum(a-1);
//    }

    //Count digits

//    static int count(int n){
//        if(n==0){
//            return 0;
//        }
//        return 1+count(n/10);    //512/10=52 52/10=5 5/10=0
//    }

    //Power

    static int power(int a, int b){
        if(b==0){
            return 1;
        }
        return a*power(a,b-1);  // 2* power(2,2) so 2*2 *power(2,1) 2*2*2 *power(2,0)
    }
    public static void main(String[] args){
        System.out.println(power(2,3));
    }
}
