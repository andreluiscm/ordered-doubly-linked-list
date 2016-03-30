
public class Test
{

	void run()
	{
		// Create Empty List
		List list = new List();
		
		System.out.println();
		
		List list2 = new List();
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Insert
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		System.out.println();
		
		list2.insert(4);
		list2.insert(3);
		list2.insert(2);
		list2.insert(1);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Print List
		list.print();
		
		System.out.println();
		
		list2.print();
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Recursive Print List
		list.recursivePrint(list.head);
		
		System.out.println();
		
		list2.recursivePrint(list2.head);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Reverse Print List
		list.reversePrint(list.head);
		
		System.out.println();
		
		list2.reversePrint(list2.head);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Is Empty?
		System.out.println("Is the list " + list + " empty?");
		System.out.println(list.isEmpty());
		
		System.out.println();
		
		System.out.println("Is the list " + list2 + " empty?");
		System.out.println(list2.isEmpty());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Search
		Node nodeToSearch;
		
		nodeToSearch = list.search(1, true);
		System.out.println();
		nodeToSearch = list.search(2, true);
		System.out.println();
		nodeToSearch = list.search(3, true);
		System.out.println();
		nodeToSearch = list.search(4, true);
		System.out.println();
		nodeToSearch = list.search(5, true);
		
		System.out.println();
		
		nodeToSearch = list2.search(1, true);
		System.out.println();
		nodeToSearch = list2.search(2, true);
		System.out.println();
		nodeToSearch = list2.search(3, true);
		System.out.println();
		nodeToSearch = list2.search(4, true);
		System.out.println();
		nodeToSearch = list2.search(5, true);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Remove
		list.remove(1);
		System.out.println();
		list.remove(1);
		System.out.println();
		list.remove(2);
		System.out.println();
		list.print();
		
		System.out.println();
		
		list2.remove(1);
		System.out.println();
		list2.remove(1);
		System.out.println();
		list2.remove(2);
		System.out.println();
		list2.print();
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Recursive Remove
		list.recursiveRemove(1, list.head);
		System.out.println();
		list.recursiveRemove(2, list.head);
		System.out.println();
		list.recursiveRemove(3, list.head);
		System.out.println();
		list.print();
		
		System.out.println();
		
		list2.recursiveRemove(1, list2.head);
		System.out.println();
		list2.recursiveRemove(2, list2.head);
		System.out.println();
		list2.recursiveRemove(3, list2.head);
		System.out.println();
		list2.print();
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Compare Two Lists
		System.out.println(list.isEqualTo(list2));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Free
		list = list.free();
		System.out.println("List = " + list);
		
		System.out.println();
		
		list2 = list2.free();
		System.out.println("List = " + list2);
		
		System.out.println("--------------------------------------------------------------------------------");
	}

}
