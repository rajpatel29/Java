package Tree_Traversal_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass 
{
	static Node root;
	static int counter = 1;
	public static void main(String[] args) 
	{
		root = new Node(11);
		root.left = new Node(22);
        root.right = new Node(33);
        root.left.left = new Node(44);
        root.left.right = new Node(55);
        
        System.out.println("Level by Level traversal ");
        
        printLevelOrder();
	}

	private static void printLevelOrder() 
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node temp = queue.poll();
			System.out.println( counter + " : " + temp.val);
			counter++;
			if(temp.left != null)
			{
				queue.add(temp.left);
			}
			
			if(temp.right != null)
			{
				queue.add(temp.right);
			}
		}
	}
}
