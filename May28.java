class CircularQueue {

    int[] q = new int[5];

    int front = -1;
    int rear = -1;

    // Enqueue
    void enqueue(int data) {

        // Queue Full
        if ((rear + 1) % q.length == front) {

            System.out.println("Queue Full");
        }

        // First insertion
        else if (front == -1) {

            front = 0;
            rear = 0;

            q[rear] = data;
        }

        // Normal insertion
        else {

            rear = (rear + 1) % q.length;

            q[rear] = data;
        }
    }

    // Dequeue
    void dequeue() {

        // Queue Empty
        if (front == -1) {

            System.out.println("Queue Empty");
        }

        // Only one element
        else if (front == rear) {

            System.out.println("Deleted: " + q[front]);

            front = -1;
            rear = -1;
        }

        // Normal deletion
        else {

            System.out.println("Deleted: " + q[front]);

            front = (front + 1) % q.length;
        }
    }

    // Display
    void display() {

        // Queue Empty
        if (front == -1) {

            System.out.println("Queue Empty");
        }

        else {

            int i = front;

            while (i != rear) {

                System.out.print(q[i] + " ");

                i = (i + 1) % q.length;
            }

            System.out.print(q[rear]);
        }
    }
}

public class May28 {

    public static void main(String[] args) {

        CircularQueue c = new CircularQueue();

        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(40);

        c.display();

        System.out.println();

        c.dequeue();

        c.display();

        System.out.println();

        c.enqueue(50);
        c.enqueue(60);

        c.display();
    }
}