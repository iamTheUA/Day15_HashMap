package Day15;

public class HashMap  {
	int size = 10;
	public Node  table[] = new Node[size];

	public void put(String key, Integer value) {
		int hash = Math.abs(key.hashCode() & size);
		Node  node = new Node ();
		node.key = key;
		node.value = value;
		Node  n = table[hash];
		if (n == null) {
//			System.out.println("+");
			table[hash] = node;
		} else {
			while (n.next!= null) {
				if (n.key == key) {
					n.value = value;
//				System.out.println("Changed");
					return;
				}
				n = n.next;
			}
			if(n.key==key) {
				n.value = value;
//				System.out.println("Changed");
				return;
			}
			n.next = node; 
//			System.out.println("+next");
		}
	}

	public int get(String key) {
		int hash = Math.abs(key.hashCode() & size);

		Node  node = table[hash];
		if (node == null) {
			return 0;
		} else {
			while (node != null) {
				if (node.key == key) {
					return node.value;
				}
				node = node.next;
			}
			return 0;
		}
	}

	public void remove(String key) {
		int hash = key.hashCode() % size;
		Node  node = table[hash];
		if (node == null) {
			System.out.println("Not Found");
		} else if (table[hash].key == key) {
			table[hash] = table[hash].next;
		} else {
			Node  pre=node;
			node=pre.next;
			int flag=0;
			while (node != null) {
				if (node.key == key) {
					pre.next = node.next;
					flag=1;
				}
				node = node.next;
			}
			if(flag==0) {
				System.out.println("Not Found");				
			}
		}
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			// System.out.print("-----");
			Node  n = table[i];
			while (n != null) {
				System.out.println(n.key + " : " + n.value);
				n = n.next;
			}
		}
	}
}
