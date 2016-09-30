package LeetCode;

import LeetCode.DeleteNodeInASinglyLinkedList.ListNode;

public class PalindromeOfSinglyList {
	static class ListNode{

  		int val;
  		ListNode next;
  		ListNode(int x){
  			val=x;
  		}
	}
	public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode middle=findMiddle(head);
        ListNode p=head;
        //ListNode middle.next=reverseList(middle.next);
        ListNode q=reverseList(middle.next);
        while(p!=null && q!=null && p.val==q.val){
            p=p.next;
            q=q.next;
        }
        return q==null;
    }
    
    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode nextNode=null;
        ListNode prevNode=null;
        ListNode currentNode=head;
        if(head.next==null){
        	return head;
        }
        while(currentNode!=null){
            nextNode=currentNode.next;
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
        }
        return prevNode;
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isPalindrome();
	}

}
