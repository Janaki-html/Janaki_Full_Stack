class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

//// Practice node creation
//
//class hello{
//    int data;
//    hello next;
//
//    hello(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
////Traversing LinkedList
//
//class travel{
//    int data;
//    travel next;
//
//    travel(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
//class Count{
//    int data;
//    Count next;
//    Count(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
////Sum of nodes
//class Sum{
//    int data;
//    Sum next;
//    Sum(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
public class May26_1 {
    public static void main(String[] args){
//        Node a =new Node(10);
//        Node b= new Node(20);
//        Node c=new Node(30);
//
//        a.next=b;
//        b.next=c;
//        c.next=null;
//
//        System.out.println(a.next);
//        System.out.println(a.next);
//        System.out.println(a.next.next);
        //  second

//        hello a=new hello(5);
//        hello b=new hello(15);
//        hello c=new hello(25);
//        hello d=new hello(35);
//
//        a.next=b;
//        b.next=c;
//        c.next=d;
//
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);

        // Traversing LinkedList

//        travel a=new travel(5);
//        travel b=new travel(15);
//        travel c=new travel(25);
//        travel d= new travel(35);
//
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        travel temp=a;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        //Count numbers of nodes using traversing linkedList
//        int count=0;
//        Count a=new Count(10);
//        Count b=new Count(20);
//        Count c=new Count(30);
//
//        a.next=b;
//        b.next=c;
//        Count temp=a;
//        while(temp!=null){
//            count=count+1;
//            temp=temp.next;
//        }
//        System.out.println(count);

        //Sum of nodes

//        Sum a=new Sum(10);
//        Sum b=new Sum(20);
//        Sum c=new Sum(20);
//
//        a.next=b;
//        b.next=c;
//        Sum temp=a;
//        int sum=0;
//        while(temp!=null){
//            sum=sum+temp.data;
//            temp=temp.next;
//        }
//        System.out.println(sum);

        //Node insertion method

//        Node head=new Node(20);
//        Node second= new Node(30);
//        head.next=second;
//        Node newnode=new Node(10);
//        newnode.next=head;
//        Node temp=newnode;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        // task 1

//        Node second=new Node(50);
//        Node end=new Node(60);
//        Node newnode=new Node(40);
//        second.next=end;
//        newnode.next=second;
//        Node temp=newnode;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        //Insert at the end

//        Node head= new Node(10);
//        Node middle= new Node(20);
//        head.next=middle;
//        Node newnode=new Node(30);
//        middle.next =newnode;
//        Node temp=head;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        //Another method for previous one

//        Node head=new Node(10);
//        Node middle=new Node(20);
//        head.next=middle;
//        Node newNode= new Node(30);
//        Node temp=head;  // 10
//        while(temp.next!=null){ // 20
//            temp=temp.next;  //temp=20
//        }
//        temp.next=newNode;
//        temp=head;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        //Deletion of the linked list first node
//        Node head= new Node(5);
//        Node middle= new Node(15);
//        Node end= new Node(25);
//        head.next=middle;
//        middle.next=end;
//        head=head.next;
//        Node temp=head;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

        //Delete the last node of the linked list
        Node head=new Node(10);
        Node middle=new Node(20);
        Node end=new Node(30);
        head.next=middle;
        middle.next=end;
        Node temp=head;
        while(temp.next.next!=null){  //30
            temp=temp.next;  //temp=20
        }
        temp.next=null;   //20.next=null
        temp=head;  //temp=10
        while(temp!=null){   //10  20
            System.out.println(temp.data);  //10  20
            temp=temp.next;   //temp=20  null
        }
    }
}
