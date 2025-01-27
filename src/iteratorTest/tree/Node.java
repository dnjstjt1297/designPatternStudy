package iteratorTest.tree;
import java.util.ArrayList;

import java.util.*;

class Node {
    int value;
    private List<Node> children;

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    // 자식 추가
    public void addChild(Node child) {
        this.children.add(child);
    }

    // 자식 리스트 조회 (읽기 전용)
    public List<Node> getChildren() {
        return Collections.unmodifiableList(children);
    }
}
