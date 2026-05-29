import java.util.Scanner;

public class May24 {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);

        // Reverse an array using swapping method

//        int[] a=new int[5];
//        for (int i = 0; i < a.length; i++) {
//            a[i]=in.nextInt();
//        }
//        int start = 0;
//        int end=a.length-1;
//       while(start<end){
//            int temp=a[start];
//            a[start]=a[end];
//            a[end]=temp;
//            start++;
//            end--;
//       }
//       for(int i=0; i<a.length;i++){
//           System.out.print(a[i]);
//       }

        //Linear Search

//        int[] a={1,5,72,5,8,9};
//        int target=7;
//        boolean found=false;
//        for(int i=0; i<a.length; i++){
//            if(a[i]==target){
//                found=true;
//                break;
//            }
//        }
//        if(found==true){
//            System.out.println("Found");
//        }
//        else{
//            System.out.println("Not found");
//        }

        //Binary Search

//        int[] a={1,2,3,4,5,8};
//        int target=8;
//        boolean found=false;
//        int start=0;
//        int end=a.length-1;
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(a[mid]==target){
//                found=true;
//                break;
//            }
//            else if (target<a[mid]){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        System.out.println(found);

        // Bubble sorting
//        int[] a={1,5,2,6,3};
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a.length-1-i; j++){    // 0 to 3 1 to 2
//                if(a[j]>a[j+1]){   // 1>5, 1>2 ,1>6, 1>3 no and 5>2 yeah   2>5 no 2>6no 6>3   3>6no
//                    int temp=a[j];  //temp=5   temp=6
//                    a[j]=a[j+1];    // a[j]=2   a[j]=3
//                    a[j+1]=temp;    //a[j+1]=5   a[j+i]=6
//                }
//            }
//        }
//        for(int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//        }

        // selection sorting

//        int[] a={5,2,1,4,3};
//        for(int i=0; i<a.length-1; i++){
//            int min=i;    // min=0
//            for(int j=i+1; j<a.length; j++){
//               if(a[min]>a[j]){     //5>2  2>1
//                   min=j;          //min=1
//               }
//            }
//            int temp=a[i];   // temp=2
//            a[i]=a[min];     //a[i]=2
//            a[min]=temp;     //a[min]=5
//        }
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

        //Insertion sorting

        int[] a={5,2,4,1,3};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
