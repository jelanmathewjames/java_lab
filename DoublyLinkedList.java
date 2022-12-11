import java.util.Scanner;
class DoublyLinkedList{
	public static void main(String[] args){
		boolean flag = true;
		List doubly = new List();
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.print("Enter\n 1 insert element\n 2 delete element\n 3 for display\n 4 exit");
			char choice = sc.next().charAt(0);
			switch(choice){
				case '1':System.out.println("Enter data to insert");
						 doubly.insert(sc.nextInt());
						 break;
				case '2':System.out.println("Enter data to delete");
						 doubly.delete(sc.nextInt());
						 break;
				case '3':doubly.display();
						 break;
				case '4':flag = false;
						 break;
				default:System.out.println("Invalid input");
				
			}
		}
			
		
	}
}
class List{
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
	private Node head;
	public void insert(int data){
		Node temp = new Node(data);
		if(head == null)
			head = temp;
		else{
			Node ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = temp;
			temp.prev = ptr;
		}
	}
	public void delete(int key){
		Node ptr = head;
		while(ptr != null){
			if(ptr.data==key){
				if(ptr.prev == null){
					head = head.next;
					if(head!=null)
						head.prev=null;
				}else if(ptr.next == null)
					ptr.prev.next = null;
				else{
					ptr.prev.next = ptr.next;
					ptr.next.prev = ptr.prev;
				}return;
			}
			ptr = ptr.next;		
		}
		System.out.println("Data not found");	
	}
	
	public void display(){
		if(head == null)
			System.out.println("List is empty");
		else{
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+" ");
				temp= temp.next;
			}System.out.println();
		}
	}
}

