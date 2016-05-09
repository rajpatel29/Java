package Tree_Path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClass 
{
	static TreeNode root;
	
	
	public static void main(String args[])
	{
		root = new TreeNode(1);
		root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        List<String> list = binaryTreePaths(root);
        
        
        for (int i = 0; i < list.size(); i++) 
        {
        	System.out.println(list.get(i));
		}
	}
	
	 public static List<String> binaryTreePaths(TreeNode root) 
	 {
		 List<String> list = new ArrayList<>();
		 
		if(root == null)
		{
				return list;
		}
		 
		findPath(root , new StringBuilder(), list);
		
		return list;
	 }
	
	
	public static void findPath(TreeNode root , StringBuilder sb,  List<String> list)
	{
		if(root.left == null && root.right == null)
		{
			sb.append(root.val);
			list.add(sb.toString());
			return ;
		}

		sb.append(root.val);
		sb.append("->");
		
		if(root.left != null)
		{
			findPath(root.left,  new StringBuilder(sb) , list);
		}
		if(root.right != null)
		{
			findPath(root.right , new StringBuilder(sb) ,  list);
		}
	}
}
