package LeetCode;

public class MergeTwoSortedLinkedLists {
	static class ListNode{
		ListNode next;
		int val;
		public ListNode(int x){
			val=x;
		}
	}
	
	public static ListNode mergeSortedLists(ListNode l1,ListNode l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		if(l1.val<l2.val){
			l1.next=mergeSortedLists(l1.next,l2);
			return l1;
		}
		else{
			l2.next=mergeSortedLists(l1,l2.next);
			return l2;
		}
		
	}
	
	public static void print(ListNode n){
		while(n.next!=null){
			System.out.print(n.val+" -> ");
			n=n.next;
		}
		if(n.next==null){
			System.out.println(n.val+" -> nil");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(3);
		ListNode l3=new ListNode(5);
		ListNode l4=new ListNode(7);
		ListNode l5=new ListNode(2);
		ListNode l6=new ListNode(4);
		ListNode l7=new ListNode(6);
		ListNode l8=new ListNode(7);
		ListNode l9=new ListNode(8);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;
		l8.next=l9;
		l9.next=null;
		
		ListNode n=mergeSortedLists(l1,l5);
		print(n);
		
	}

}
