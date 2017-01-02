package LeetCode;
/*
 * Link: https://leetcode.com/problems/delete-node-in-a-bst/
 */
public class DeleteNodeInBST {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	public static TreeNode deleteNode(TreeNode root,int key){
		if(root==null){
			return null;
		}
		if(key<root.val){
			root.left=deleteNode(root.left,key);
		}
		else if(key>root.val){
			root.right=deleteNode(root.right,key);
		}
		else{
			if(root.left==null){
				return root.right;
			}
			if(root.right==null){
				return root.left;
			}
			else{
				int minNode=findMin(root.right);
				root.val=minNode;
				root.right=deleteNode(root.right,root.val);
			}
		}
		return root;
	}
	
	public static int findMin(TreeNode root){
		while(root.left!=null){
			root=root.left;
		}
		return root.val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode root=SerializeAndDeserialize.deserialize("1,2,3,#,#,4,5,#,#,#,#");
		//deleteNode(root,4);
		//String str=SerializeAndDeserialize.serialize(root);
		//System.out.println(str);
	}

}
