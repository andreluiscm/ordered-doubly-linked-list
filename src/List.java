
public class List
{
	
	Node head;

	public List()
	{
		super();
		
		System.out.println("An empty list " + this + " has been created");
	}
	
	void insert(int value)
	{
		if (this.head == null)
		{
			this.head = new Node(value, this.head, this.head);	
		}
		else
		{
			if (this.head.value > value)
			{
				this.head = new Node(value, this.head.previous, this.head);
			}
			else
			{
				Node currentNode = this.head;
				
				while (currentNode != null)
				{
					if (currentNode.next == null || currentNode.next.value > value)
					{
						break;
					}
					else
					{
						currentNode = currentNode.next;
					}
				}
				
				currentNode.next = new Node(value, currentNode, currentNode.next);
			}
		}
		
		System.out.println("Value " + value + " has been inserted into the list " + this);
	}
	
	void print()
	{
		System.out.println("Printing list " + this);
		
		if (isEmpty())
		{
			System.out.println("This list is empty");
		}
		else
		{
			for (Node currentNode = this.head; currentNode != null; currentNode = currentNode.next)
			{
				System.out.println("Node: " + currentNode + "\tValue: " + currentNode.value);
			}
		}
	}
	
	void recursivePrint(Node currentNode)
	{	
		if (this.head == currentNode)
		{
			System.out.println("Printing list " + this + " recursively");
			
			if (isEmpty())
			{
				System.out.println("This list is empty");
			}
		}
		
		if (currentNode != null)
		{
			System.out.println("Node: " + currentNode + "\tValue: " + currentNode.value);
			
			recursivePrint(currentNode.next);
		}
	}
	
	void reversePrint(Node currentNode)
	{
		if (this.head == currentNode)
		{
			System.out.println("Printing reverse list " + this);
			
			if (isEmpty())
			{
				System.out.println("This list is empty");
			}
		}
		
		if (currentNode != null)
		{
			reversePrint(currentNode.next);
			
			System.out.println("Node: " + currentNode + "\tValue: " + currentNode.value);
		}
	}
	
	boolean isEmpty()
	{
//		System.out.println("Is this list empty?");
		
		if (this.head == null)
		{
			return true;
		}
		
		return false;
	}
	
	Node search(int value, boolean showMessage)
	{
		if (showMessage)
		{
			System.out.println("Looking for number " + value + " in list " + this);
			
			if (isEmpty())
			{
				System.out.println("This list is empty");
			}
		}
		
		for (Node currentNode = this.head; currentNode != null; currentNode = currentNode.next)
		{
			if (currentNode.value > value)
			{
				if (showMessage)
				{
					System.out.println("Not found");
				}
				
				return null;
			}
			
			if (currentNode.value == value)
			{
				if (showMessage)
				{
					System.out.println("Found");
					System.out.println("Node: " + currentNode + "\tValue: " + currentNode.value);
				}
				
				return currentNode;
			}
		}
		
		if (showMessage)
		{
			System.out.println("Not found");
		}
		
		return null;
	}
	
	void remove(int value)
	{
		System.out.println("Looking for number " + value + " to be removed from the list " + this);
		
		if (isEmpty())
		{
			System.out.println("This list is empty");
		}
		else
		{
			Node nodeToRemove = search(value, false);
			
			if (nodeToRemove != null)
			{
				if (nodeToRemove == this.head)
				{
					this.head = this.head.next;
				}
				else
				{
					nodeToRemove.previous.next = nodeToRemove.next;
				}
				
				System.out.println("Found");
				System.out.println("Node: " + nodeToRemove + "\tValue: " + nodeToRemove.value);
				
				nodeToRemove = null;
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	
	void recursiveRemove(int value, Node currentNode)
	{
		if (this.head == currentNode)
		{
			System.out.println("Looking for number " + value + " to be removed recursively from the list " + this);
			
			if (isEmpty())
			{
				System.out.println("This list is empty");
			}
		}
		
		if (currentNode != null)
		{
			if (currentNode.value == value)
			{
				if (currentNode == this.head)
				{
					this.head = currentNode.next;
				}
				else
				{
					currentNode.previous.next = currentNode.next;
				}
				
				System.out.println("Found");
				System.out.println("Node: " + currentNode + "\tValue: " + currentNode.value);
				
				currentNode = null;
			}
			else
			{
				recursiveRemove(value, currentNode.next);
			}
		}
		else
		{
			System.out.println("Not found");
		}
	}
	
	List free()
	{
		System.out.println("Deallocating memory from the list " + this);

		Node previousNode;
		Node currentNode = this.head;
		
		while (currentNode != null)
		{
			previousNode = currentNode;
			
			currentNode = currentNode.next;
			
			previousNode = null;
		}

		return null;
	}
	
	int length()
	{
		int length = 0;
		
		for (Node currentNode = this.head; currentNode != null; currentNode = currentNode.next)
		{
			length++;
		}
		
		return length;
	}
	
	boolean isEqualTo(List list)
	{
		System.out.println("Are lists " + this + " and " + list + " equal?");
		
		if (length() == list.length())
		{
			Node currentNode2 = list.head;
			
			for (Node currentNode = this.head; currentNode != null; currentNode = currentNode.next)
			{
				if (currentNode.value == currentNode2.value)
				{
					currentNode2 = currentNode2.next;
				}
				else
				{
					return false;
				}
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
