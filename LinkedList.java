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

	
	static void baştanEkle(int data) {
		
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	

	
	static void ortalardanEkle(Node öncekiNode,int data) {
		
		if(öncekiNode==null) {
			System.out.println("önceki Node yok");
			return;
		}
		
		Node newNode=new Node(2);
		newNode.next=öncekiNode.next;
		öncekiNode.next=newNode;
		
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
	

    static void deleteBaştan() {
    	head=head.next;
    }
    
   static void deleteOrtadan(Node ÖncekiNode, Node SonrakiNode) {
    
    ÖncekiNode.next=SonrakiNode;
    }
    
    
    
	public static void main(String[] args) {
	
	LinkedList list=new LinkedList();	
		
    baştanEkle(1);
	baştanEkle(2);
	baştanEkle(3);
	traverseORprint();
	deleteBaştan();
	sondanEkle(0);
	traverseORprint();
	}
	
}