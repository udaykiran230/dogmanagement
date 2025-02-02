package linkedlist;

/**
*
* @author S567161 Udaykiranreddy Devarapally
*/
public class colorsListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node firstNode = new Node("red");
		Node secondNode = new Node("yellow");
		Node thirdNode = new Node("orange");
		Node fourthNode = new Node("pink");
		Node fifthNode = new Node("black");
		Node sixthNode = new Node("white");
		Node seventhNode = new Node("blue");
		Node eighthNode = new Node("green");
		
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		fourthNode.next = fifthNode;
		fifthNode.next = sixthNode;
		sixthNode.next = seventhNode;
		seventhNode.next = eighthNode;
		
		Node headNode = new Node("purple");
		headNode.next = firstNode;
		
		Node currNode = headNode;
		printList(headNode);
		

	}
	
	public static void printList(Node currNode) {
		System.out.println("Linked List after adding all colors:");
		while (currNode != null) {
			System.out.print(currNode.color+ " -> ");
			currNode = currNode.next;
		}

	}
	
	public static Node addMiddle(Node head) {
		Node newNode = new Node("grey");
		Node currNode = head;
		while(currNode.color != "pink") {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return head;		
	}

}
