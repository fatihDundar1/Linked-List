package linkedList;

public class LinkedList {
    
   static Node head; 
  
	static class Node{
		int data;
		Node next; 
	
		Node(int data){
			this.data=data;
			next=null;
		         }	
	}

	
	static void ba�tanEkle(int data) {
		
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	

	
	static void ortalardanEkle(Node �ncekiNode,int data) {
		
		if(�ncekiNode==null) {
			System.out.println("�nceki Node yok");
			return;
		}
		
		Node newNode=new Node(2);
		newNode.next=�ncekiNode.next;
		�ncekiNode.next=newNode;
		
	}
	
	
    static void sondanEkle(int data) {
    	
    	Node sonNode=new Node(data);
    	sonNode.next=null;
    	
    	Node tnode=head;
    	while(tnode.next!=null)
    		tnode=tnode.next;
    	
    	tnode.next=sonNode;
    	
    }
	
	static void traverseORprint() {
		Node tnode=head;
		while(tnode!=null) {
			System.out.println(tnode.data);
			
			tnode=tnode.next;
			
		}
	}
	

    static void deleteBa�tan() {
    	head=head.next;
    }
    
   static void deleteOrtadan(Node �ncekiNode, Node SonrakiNode) {
    
    �ncekiNode.next=SonrakiNode;
    }
    
    
    
	public static void main(String[] args) {
	
	LinkedList list=new LinkedList();	
		
    ba�tanEkle(1);
	ba�tanEkle(2);
	ba�tanEkle(3);
	traverseORprint();
	deleteBa�tan();
	sondanEkle(0);
	traverseORprint();
	}
	
}