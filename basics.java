public class basics {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length(node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(6);
        node c = new node(7);
        node d = new node(8);
        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        System.out.println("Length: " + length(a));
    }
}