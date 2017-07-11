
/**
 * Created by K40-1 on 2017/7/11.
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode t = new ListNode(0);
        if (l1.val > l2.val){
            t.val = l2.val;
            t.next = mergeTwoLists(l1, l2.next);
        }else {
            t.val = l1.val;
            t.next = mergeTwoLists(l1.next, l2);
        }
        return t;
    }

}
