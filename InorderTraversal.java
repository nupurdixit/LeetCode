package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import LeetCode.PreOrderTraversal.TreeNode;

public class InorderTraversal {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	
	public static List<Integer> inorderTraverse(TreeNode root){
		Stack<TreeNode> stack=new Stack<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		TreeNode t=root;
		if(t==null){
			return list;
		}
		do{
			if(t!=null){
				stack.push(t);
				t=t.left;
			}
			else{
				t=stack.pop();
				list.add(t.val);
				t=t.right;
			}	
			
		}while(t!=null | !stack.isEmpty());
		
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
		List<Integer> arrlist=inorderTraverse(a);
		for(int num:arrlist){
			System.out.print(num+" ");
		}
	}

}
