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

	
	static void bastanEkle(int data) {
		
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
	
	
	 static void BulVeEkle(int j,int data) {
	   
	        Node iterator=head;
	   
	        while(iterator.next!=null) {
		   
		     if(iterator.data==j) {
			   
			   Node newNode=new Node(data);
			   newNode.next=iterator.next;
			   iterator.next=newNode;
		     }
		   
		   iterator=iterator.next; 
	        }
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
	

        static void deleteBastan() {
    	head=head.next;
         }
    
        static void deleteOrtadan(Node ÖncekiNode, Node SonrakiNode) {
    
         ÖncekiNode.next=SonrakiNode;
         }
    
	
	static void sondanSil() {
		
	       Node iterator=head;
	   
	        while(iterator.next.next!=null) {
		      iterator=iterator.next;
	        }
	   
	        iterator.next=null;
   }
    
    
	public static void main(String[] args) {
	
		
		
        bastanEkle(4);	
        bastanEkle(3);
	bastanEkle(2);
	bastanEkle(1);
	traverseORprint();
	deleteBastan();
	sondanEkle(6);
	BulVeEkle(4, 5);
	sondanSil();
	traverseORprint();
		
	}
	
}
