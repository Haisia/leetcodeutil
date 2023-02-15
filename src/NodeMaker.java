import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodeMaker {
  public static Node nodeMaker(Integer[] arr) {
    if (arr.length == 0) return null;

    Node root = new Node(arr[0], new ArrayList<>());
    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    int lt = 2;
    while (lt < arr.length) {
      Node node = q.poll();
      List<Node> children = node.children;

      Integer value = arr[lt];
      while (value != null) {
        Node childNode = new Node(value, new ArrayList<>());

        children.add(childNode);
        q.offer(childNode);

        lt++;
        if (lt >= arr.length) break;
        value = arr[lt];
      }
      lt++;
    }

    return root;
  }
}
