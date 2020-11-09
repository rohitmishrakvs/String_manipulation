import java.util.*;

class Node{
	int data ;
	Node next;
	public Node(int d){
		this.data=d;
		this.next=null;
	}
}


class ThirdLastElemnetInLinkedList{
	public static Node insertNode(Node head,int data){
		Node newNode = new Node(data);
		if(head==null){
			head =  new Node(data);
			return newNode;
		}
		newNode.next=null;
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
		return head;
	}
	public static void display(Node head){
		
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public static void findElement(Node head){
		Node temp = head;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		temp = head;
		for(int i =0;i<count-3;i++){
			temp=temp.next;
		}
		System.out.println("*********"+temp.data);
	}
	
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0){
            int ele = sc.nextInt();
            head = insertNode(head,ele);
        }
        display(head);
		findElement(head);
	}
}