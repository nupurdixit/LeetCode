package LeetCode;

//Inverting a binary tree

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class InvertBinaryTree {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	/*public static TreeNode invertBinaryTree(TreeNode root){
		if(root==null){
			return root;
		}
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
		return root;
	}*/
	
	public static void invertBinaryTree(TreeNode root){
		Stack<TreeNode> s=new Stack<>();
		if(root==null){
			return;
		}
		TreeNode t=root;
		s.push(t);
		while(!s.isEmpty()){
			t=s.pop();
			System.out.print(t.val+" ");
			TreeNode temp=t.left;
			t.left=t.right;
			t.right=temp;
			if(t.left!=null){
				s.push(t.left);
			}
			if(t.right!=null){
				s.push(t.right);
			}
		}
	}
	public static void levelOrder(TreeNode root){
		if(root==null){
			return;
		}
		Queue<TreeNode> q=new LinkedList<>();
		TreeNode t=root;
		q.add(t);
		System.out.println();
		while(!q.isEmpty()){
			t=q.poll();
			System.out.print(t.val+" ");
			if(t.left!=null){
				q.add(t.left);
			}
			if(t.right!=null){
				q.add(t.right);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(3);
		TreeNode d=new TreeNode(4);
		TreeNode e=new TreeNode(5);
		TreeNode f=new TreeNode(6);
		TreeNode g=new TreeNode(7);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		c.left=f;
		c.right=g;
		invertBinaryTree(a);
		levelOrder(a);
	}

}
