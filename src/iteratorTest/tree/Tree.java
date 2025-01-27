package iteratorTest.tree;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Iterator;

class Tree implements Iterable<Node> {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    @Override
    public Iterator<Node> iterator() {
        return new TreeIterator(root);
    }
}