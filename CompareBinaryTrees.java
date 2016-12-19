package LeetCode;

import java.util.*;

import LeetCode.LevelOrderTraversal.TreeNode;

public class CompareBinaryTrees {
	static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int x){
            val=x;
        }
    }
    public boolean identical(TreeNode t1,TreeNode t2){
    
    	if(t1==null && t2==null){
    		return true;
    	}
    	if(t1==null || t2==null){
    		return false;
    	}
    	return (t1.val==t2.val && identical(t1.left, t2.left) && identical(t1.right,t2.right));
    }
    public void buildTree(int[] arr){
    	
    	for(int i:arr){
    		TreeNode t1=new TreeNode(i);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(3);
		TreeNode c=new TreeNode(2);
		TreeNode d=new TreeNode(5);
		TreeNode e=new TreeNode(6);
		TreeNode f=new TreeNode(7);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=f;
		c.left=e;
		
		TreeNode p=new TreeNode(1);
		TreeNode q=new TreeNode(3);
		TreeNode r=new TreeNode(2);
		TreeNode s=new TreeNode(5);
		TreeNode t=new TreeNode(6);
		TreeNode u=new TreeNode(7);
		p.left=q;
		p.right=r;
		q.left=s;
		q.right=u;
		r.left=t;
		
		CompareBinaryTrees comp=new CompareBinaryTrees();
		System.out.println(comp.identical(a,p));
	}

}
