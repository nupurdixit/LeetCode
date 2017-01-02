package LeetCode;
import java.util.*;

import LeetCode.SerializeAndDeserialize.TreeNode;

public class ShowPaths {
	
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		
		public TreeNode(int x){
			val=x;
		}
	}
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>(); //create a list tp store the paths
        StringBuilder sb=new StringBuilder(); //Stringbuilder required for maintaining string within path e.g. 1->2->3 etc
        helper(root,list,sb);
        return list;
    }
    
    public static void helper(TreeNode root,List<String> list,StringBuilder sb){
        if(root==null){
            return;
        }
        int len=sb.length();  //length of sb is 0 at this moment
       
        sb.append(root.val);
        
        if(root.left==null && root.right==null){
            list.add(sb.toString());
        }
        else{
            sb.append("->");
            helper(root.left,list,sb);
            helper(root.right,list,sb);
        }
        sb.setLength(len);  ///this is done so that after one path is found the StringBuilder length is set back to 0. This is done because STRINGBUILDER is 
        					// MUTABLE, it will thus store the previous path value in itself and cause problem in display when other values append to it.
        					//e..g if first path is 1->2 , and second path 1->3, so if this is not done then it displays second path as 1->23 which is wrong
        
    }
    
    public static void main(String[] args){
    	TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(3);
		TreeNode d=new TreeNode(4);
		TreeNode e=new TreeNode(5);
	
		a.left=b;
		a.right=c;
		
		c.left=d;
		c.right=e;
		System.out.println(binaryTreePaths(a));
    }
    
}
