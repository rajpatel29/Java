package Tree_Traversal_DFS_Inorder;

public class MainClass 
{
	static Node root;
	static int counter = 1;
	public static void main(String[] args) 
	{
		root = new Node(1);
		root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        System.out.println("DFS ");
        
        System.out.println("InOrder");
        inorder(root);
        
        System.out.println();
        System.out.println();
        
        System.out.println("preOrder");
        preorder(root);
        
        System.out.println();
        System.out.println();

        System.out.println("postorder");
        postorder(root);
        
	}

	private static void inorder(Node root) 
	{
		if(root == null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
	}
	
	private static void preorder(Node root) 
	{
		if(root == null)
		{
			return;
		}
		System.out.println(root.val);
		preorder(root.left);
		preorder(root.right);
	}
	
	private static void postorder(Node root) 
	{
		if(root == null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.val);
	}
	
}
