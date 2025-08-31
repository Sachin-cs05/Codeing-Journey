import java.util.HashMap;

public class trie_contact {
    private class Node{
        char data;
        HashMap<Character,  Node> child = new HashMap<>();
        boolean IsTerminal;
        int count = 0;
    }
    private Node root;
    public trie_contact(){
        Node nn = new Node();
        nn.data = '*';
        root = nn;
    }
    public void insert(String word) {
		Node temp = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (temp.child.containsKey(ch)) {
				temp = temp.child.get(ch);
                temp.count++;
			} else {
				Node nn = new Node();
                nn.data = ch;
                nn.count = 1;
				temp.child.put(ch, nn);
				temp = nn;

			}

		}

		temp.IsTerminal = true;// color yaha Word end ho raha h
	}
    public boolean search(String word) {
		Node temp = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!temp.child.containsKey(ch)) {
				return false;
			} else {

				temp = temp.child.get(ch);
			}
		}
		return temp.IsTerminal;
	}
    public int startsWith(String prefix) {
		Node temp = this.root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (!temp.child.containsKey(ch)) {
				return 0;
			} else {
				temp = temp.child.get(ch);
			}
		}
		return temp.count;
	}
}
