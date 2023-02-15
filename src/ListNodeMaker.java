public class ListNodeMaker {
  public static ListNode listNodeMaker(int[] arr){
    if (arr.length == 0) return null;

    ListNode root = new ListNode(arr[0]);
    ListNode node = root;
    for (int i = 1; i < arr.length; i++) {
      node.next = new ListNode(arr[i]);
      node = node.next;
    }

    return root;
  }
}
