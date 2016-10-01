package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import LeetCode.PostOrderTraversal.TreeNode;

public class LevelOrderBottomToTop {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> outerList=new ArrayList<>();
		Queue<TreeNode> q=new LinkedList<>();
		if(root==null){
			return outerList;
		}
		
		TreeNode t=root;
		int i=1;int j=1;
		q.add(t);
		
		while(!q.isEmpty()){
			List<Integer> list=new ArrayList<>();
			while(j!=0){
				t=q.poll();
				list.add(t.val);
				i--;
				j--;
				
				if(t.left!=null){
					q.add(t.left);
					i++;
				}
				if(t.right!=null){
					q.add(t.right);
					i++;
				}
			}
			j=i;
			outerList.add(0,list);//outerList.add(list) will print the tree from top to bottom
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
//			for(int num1:num){
//				System.out.println(num1+" ");
//			}
		}
	}

}
