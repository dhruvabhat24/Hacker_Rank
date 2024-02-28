static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        }
        
        if (head2 == null) {
            return head1;
        }
        
        SinglyLinkedListNode topHead = null;
        if (head1.data < head2.data) {
            topHead = head1;
            topHead.next = mergeLists(head1.next, head2);
        } else {
            topHead = head2;
            topHead.next = mergeLists(head2.next, head1);
        }
        return topHead;
    }
