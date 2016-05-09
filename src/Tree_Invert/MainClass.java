package Tree_Invert;

import Tree_Traversal_DFS.Node;

public class MainClass 
{
	static TreeNode result;
	public static void main(String[] args) 
	{
		TreeNode root;
		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        inTraversal(root);
        
        inorder(result);
	}
	
	
	public static TreeNode inTraversal(TreeNode root)
	{
		return callMe(root, new TreeNode(9999999), "first" , root);
	}
	
	public static TreeNode callMe(TreeNode root, TreeNode parent , String str , TreeNode root1)
	{
		TreeNode temp = null;
		if(root == null)
		{
			return null;
		}
		
		if(str.equals("first"))
		{
			
			temp = new TreeNode(root.val);
			result = temp;
		}
		else if(str.equals("left"))
		{
			temp = new TreeNode(root.val);
			parent.right = temp;
			
		}
		else 
		{
			temp = new TreeNode(root.val);
			parent.left = temp;
		}
		
		
		if(root.right != null)
		{
			callMe(root.right, temp, "right" , root1);
		}
		
		if(root.left != null)
		{
			callMe(root.left, temp, "left" , root1);
		}
		
		return root1;
	}

	
	private static void inorder(TreeNode root) 
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
	}

}
