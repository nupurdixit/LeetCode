package LeetCode;
/*
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeaf {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	public static int sumRootToLeaf(TreeNode root){
		return sum(root,0);
	}
	public static int sum(TreeNode node,int val){
		if(node==null){
			return 0;
		}
		val=val*10 + node.val;
		if(node.left==null && node.right==null){
			return val;
		}
		return sum(node.left,val)+sum(node.right,val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(3);
		a.left=b;
		a.right=c;
		System.out.println(sumRootToLeaf(a));
	}

}
