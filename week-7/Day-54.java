class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
            //head = llist
        if (llist == null) {
            return null;
        }

        //single node
        if (llist.next == null) {
            return llist;
        }

        SinglyLinkedListNode prevNode = null;
        SinglyLinkedListNode currNode = llist;

        while (currNode != null) {
            SinglyLinkedListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        llist = prevNode;
        return llist;
    }

}
