import java.util.Scanner;

class DoublyLinkedList{
	public static void main(String[] args){
	
	}
}

class List{
	private Node head;
	class Node{
		private int data;
		private Node prev;
		private Node next;
		
		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;		
		}
	}
	
	public void insert(int data){
		Node temp = new Node(data);
		if(head == null)
			head = temp;
		else{
			Node ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.right = temp;
			temp.left = ptr;
		}
	}
	
	public void delete(){
		if(head == null)
			System.out.println()
			
	}
}

