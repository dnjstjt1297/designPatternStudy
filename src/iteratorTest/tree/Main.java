package iteratorTest.tree;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        root.addChild(node3);
        root.addChild(node2);
        node2.addChild(node6);
        node2.addChild(node5);
        node3.addChild(node4);

        Tree tree = new Tree(root);

        Iterator<Node> iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().value + " ");
        }

    }
}
