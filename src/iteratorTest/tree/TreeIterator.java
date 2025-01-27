package iteratorTest.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

// BFS 기반 Iterator 구현 (Tree 클래스 내부에서 사용)
class TreeIterator implements Iterator<Node> {
    private Queue<Node> queue;

    public TreeIterator(Node root) {
        queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Node next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Node node = queue.poll();
        queue.addAll(node.getChildren()); // 자식 노드들을 큐에 추가
        return node;
    }
}
