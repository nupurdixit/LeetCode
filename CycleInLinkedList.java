package LeetCode;

public class CycleInLinkedList {
	static class ListNode{
		ListNode next;
		int val;
		public ListNode(int x){
			val=x;
		}
	}
	public static boolean hasCycle(ListNode head){
		if(head==null || head.next==null){
			return false;
		}
		ListNode slow=head;
		ListNode fast=head.next;
		
		while(fast.next!=null && fast.next.next!=null){
			if(slow==fast){
				return true;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			ListNode n1 = new ListNode(2);
			ListNode n2 = new ListNode(3);
			ListNode n3 = new ListNode(5);
			ListNode n4 = new ListNode(8);
			
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n2;

			System.out.println(hasCycle(n1));
		}
	}

}
