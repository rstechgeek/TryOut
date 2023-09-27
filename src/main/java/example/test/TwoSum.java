package example.test;

public class TwoSum {

    public static void main(String[] args) {
        ListNode four = new ListNode(4);
        ListNode two = new ListNode(2, four);
        ListNode three = new ListNode(9, two);
        ListNode six = new ListNode(6, four);
        ListNode five = new ListNode(7, six);
        new TwoSum().addTwoNumbers(three, five);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            System.out.println(digit);
            carry = sum / 10;
            System.out.println(carry);

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }


}
