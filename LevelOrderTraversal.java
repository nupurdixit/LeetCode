package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import LeetCode.PostOrderTraversal.TreeNode;

public class LevelOrderTraversal {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	public static List<List<Integer>> levelOrder(TreeNode root){
		List<Integer> innerList=new ArrayList<>();
		List<List<Integer>> outerList=new ArrayList<>();
		Queue<TreeNode> queue=new LinkedList<>();
		
		if(root==null){
			return outerList;
		}
		 
		TreeNode t=root;
		queue.add(t);
		queue.add(null);
		while(!queue.isEmpty()){
			t=queue.remove();
			if(t!=null){
				innerList.add(t.val);
				if(t.left!=null){
					queue.add(t.left);
				}
				if(t.right!=null){
					queue.add(t.right);
				}
			}
			else{
				if(!queue.isEmpty()){
					queue.add(null);
				}
				outerList.add(innerList);
				innerList=new ArrayList<>();
			}
			
		}
		return outerList;
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
		List<List<Integer>> arrlist=levelOrder(a);
		for(List<Integer> num:arrlist){
			System.out.println(num+" ");
			
		}
	}

}
