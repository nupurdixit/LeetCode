package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
	
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	public static List<Integer> preOrderTraverse(TreeNode root){
		Stack<TreeNode> stack=new Stack<>();
		List<Integer> list=new ArrayList<>();
		
		if(root==null){
			return list;
		}
		
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode t=stack.pop();
			list.add(t.val);
			if(t.right!=null){
				stack.push(t.right);
			}
			if(t.left!=null){
				stack.push(t.left);
			}
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
		List<Integer> arrlist=preOrderTraverse(a);
		for(int num:arrlist){
			System.out.print(num+" ");
		}
		
	}

}
