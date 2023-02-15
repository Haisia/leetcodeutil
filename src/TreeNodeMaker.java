import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeMaker {
  public TreeNode treeNodeMaker(Integer[] arr) {
    if (arr.length == 0) return null;

    TreeNode root = new TreeNode(arr[0]);
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    int lt = 1;
    while (lt < arr.length) {
      TreeNode node = q.poll();

      if (arr[lt] != null) node.left = new TreeNode(arr[lt]);
      lt++;
      if (node.left != null) q.offer(node.left);

      if (lt >= arr.length) break;

      if (arr[lt] != null) node.right = new TreeNode(arr[lt]);
      lt++;
      if (node.right != null) q.offer(node.right);
    }

    return root;
  }
}
