import java.util.Stack;

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseList {
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        print(head);
        //Node res = reverse(head);
        //print(res);
        Node res= reverseStack(head);
        print(res);
    }

    private static Node reverseStack(Node head) {
        //TC : O(n)
        //SC : O(n)
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        System.out.println(stack);
        Node res = head;
        while(res != null){
            res.data = stack.pop();
            res = res.next;
        }
        return head;
    }

    private static Node reverse(Node head) {
        //TC : O(n)
        //SC : O(1)
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
}
