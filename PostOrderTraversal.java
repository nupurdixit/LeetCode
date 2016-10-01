package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import LeetCode.InorderTraversal.TreeNode;

public class PostOrderTraversal {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	
	public static List<Integer> postOrderTraverse(TreeNode root){
		Stack<TreeNode> s1=new Stack<>();
		Stack<TreeNode> s2=new Stack<>();
		List<Integer> list=new ArrayList<>();
		
		TreeNode t=root;
		if(t==null){
			return list;
		};
		
		s1.push(t);
		while(!s1.isEmpty()){
			t=s1.pop();
			s2.push(t);
			if(t.left!=null){
				s1.push(t.left);
			}
			if(t.right!=null){
				s1.push(t.right);
			}
		}
		
		while(!s2.isEmpty()){
			list.add(s2.pop().val);
		}
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(15);
		TreeNode b=new TreeNode(1);
		TreeNode c=new TreeNode(6);
		TreeNode d=new TreeNode(0);
		TreeNode e=new TreeNode(3);
		TreeNode f=new TreeNode(8);
		TreeNode g=new TreeNode(2);
		TreeNode h=new TreeNode(4);
		TreeNode i=new TreeNode(7);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		e.left=g;
		e.right=h;
		c.right=f;
		f.left=i;
		List<Integer> arrlist=postOrderTraverse(a);
		for(int num:arrlist){
			System.out.print(num+" ");
		}
	}

}
