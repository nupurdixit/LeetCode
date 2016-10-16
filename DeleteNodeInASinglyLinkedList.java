package LeetCode;
/*Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become
 1 -> 2 -> 4 after calling your function.*/
/*
 * public class ListNode{
 * 		int val;
 * 		ListNode next;
 * 		ListNode(int x){
 * 			val=x;
 * 		}
 */
public class DeleteNodeInASinglyLinkedList {
	
	static class ListNode{

	  		int val;
	  		ListNode next;
	  		ListNode(int x){
	  			val=x;
	  		}
	}
	
	public static void deleteNode(ListNode node){
		if(node.next==null){
			return;  //tail is not to be removed
		}
		
		node.val=node.next.val;   //place the value of node 3 in node 2
		node.next=node.next.next; //Let 2 point to the next of 3's next
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(4);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=null;
		System.out.print(a.val+"->"+b.val+"->"+c.val+"->"+d.val);
		System.out.println();
		deleteNode(c);
		System.out.print(a.val+"->"+a.next.val+"->"+b.next.val);
	}

}
