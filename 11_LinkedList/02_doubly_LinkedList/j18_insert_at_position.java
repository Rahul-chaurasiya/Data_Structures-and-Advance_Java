
class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}


public class j18_insert_at_position {

    static void addNode(Node head_ref, int pos, int data){
		Node curr = head_ref;
		for(int i=0;i<pos-1;i++){
		    curr = curr.next;
		}
		Node temp = new Node(data);
		temp.next = curr.next;
		temp.prev = curr;
		curr.next = temp;
	}


    public static void traversal(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        System.out.print("our current Linkedlist is : ");
        traversal(head);
        addNode(head, 2,40);
        System.out.println("After insert at position");
        traversal(head);

    }
}
