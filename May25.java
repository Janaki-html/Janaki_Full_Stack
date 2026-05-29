import java.util.Scanner;

public class May25 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        // Bubble sort
//        int[] a={2,5,1,6,3};
//        for(int i=0; i<a.length; i++){
//            for(int j=i+1; j<a.length; j++){
//                if(a[j]<a[i]){
//                    int temp=a[j];
//                    a[j]=a[i];
//                    a[i]=temp;
//                }
//            }
//        }
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

        //Selection Sort

//        int[] a={2,6,5,3,1};
//        for(int i=0;i<a.length; i++){
//            int min=i;
//            for(int j=i+1; j<a.length; j++){
//                if(a[min]>a[j]){
//                    min=j;
//                }
//            }
//            int temp=a[min];
//            a[min]=a[i];
//            a[i]=temp;
//        }
//
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

        //Insertion sorting

//        int[] a={2,4,1,0,6};
//        for(int i=1; i<a.length; i++){
//            int current=a[i];   // current=4,1,0
//            int j=i-1;   // j=0,1,2
//            while(j>=0 && a[j]>current){  //0=0  && 2>4  1>=0 && 4>1  0>=0 && 2>1  -1>=0 && 1>1   2>=0 && 1>0  1>=0 && 4>0
//                a[j+1]=a[j];    //a[2]=4  a[1]=2  a[3]=1  a[2]=4 a[1]=2
//                j--;    //0,-1,1,0 , -1
//            }
//           a[j+1]=current;   //a[2]=4 a[1] =2  a[0]=1
//        }
//        for (int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }
    }
}

