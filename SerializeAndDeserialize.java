package LeetCode;
import java.util.*;
public class SerializeAndDeserialize {
	static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		public TreeNode(int x){
			val=x;
		}
	}
	public static String serialize(TreeNode root){
		StringBuilder sb=new StringBuilder();
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node=queue.remove();
			if(node==null){
				sb.append("#,");
				continue;
				
			}
			sb.append(node.val+",");
			queue.add(node.left);
			queue.add(node.right);
		}
		
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	
	public static TreeNode deserialize(String str){
		String[] nodes=str.split(",");
		TreeNode[] treeNodes=new TreeNode[nodes.length];
		for(int i=0;i<nodes.length;i++){
			treeNodes[i]=getNode(nodes[i]);
		}
		TreeNode root = treeNodes[0];
		int nullCount=0;
		for(int i=0;i<treeNodes.length;i++){
			int left=2*(i-nullCount)+1;
			int right=2*(i-nullCount) + 2;
			TreeNode node=treeNodes[i];
			if(node==null){
				nullCount++;
				continue;
			}
			if(left>=nodes.length || right>=nodes.length){
				break;
			}
			node.left=treeNodes[left];
			node.right=treeNodes[right];
			
		}
		return root;		
	}
	
	public static TreeNode getNode(String str){
		if(!str.equals("#")){
			return new TreeNode(Integer.parseInt(str));
		}
		return null;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(1);
		TreeNode b=new TreeNode(2);
		TreeNode c=new TreeNode(3);
		TreeNode d=new TreeNode(4);
		TreeNode e=new TreeNode(5);
	
		a.left=b;
		a.right=c;
		
		c.left=d;
		c.right=e;
		String str=serialize(a);
		TreeNode root=deserialize(str);
		String str1=serialize(root);
		System.out.println("str= "+str);
		System.out.println("str1 = "+str1);
		
	}

}
