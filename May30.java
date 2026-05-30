import java.util.LinkedList;

public class May30 {
    public static void main(String[] args){
        //Count LinkedList
//        LinkedList<Integer> l=new LinkedList<>();
//        Node1 a=new Node1(10);
//        Node1 b=new Node1(20);
//        Node1 c= new Node1(30);
//        a.next=b;
//        b.next=c;
//        int count=0;
//        Node1 temp=a;
//        while(temp!=null){
//            count=count+1;
//            temp=temp.next;
//        }
//        System.out.println(count);

        //Sum of nodes
//        Node a=new Node(10);
//        Node b=new Node(20);
//        Node c= new Node(30);
//        a.next=b;
//        b.next=c;
//        int sum=0;
//        Node temp=a;
//        while(temp!=null){
//            sum= sum+temp.data;
//            temp=temp.next;
//        }
//        System.out.println(sum);

        //Insert at end

        Node1 a= new Node1(10);
        Node1 b= new Node1(20);
        a.next=b;
        Node1 newnode=new Node1(30);
        b.next=newnode;
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(newnode.data);
    }
}
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
