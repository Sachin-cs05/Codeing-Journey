public class Trie_client {
    public static void main(String[] args) {
        // Trie t = new Trie();
        // t.insert("sachin");
        // t.insert("saini");
        // System.out.println(t.search("sa"));
        // System.out.println(t.startsWith("sa"));

        trie_contact t1 = new trie_contact();
        t1.insert("sachin");
        t1.insert("saini");
        System.out.println(t1.startsWith("sa"));
    }
}
