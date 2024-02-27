 public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
    DoublyLinkedListNode prev = null;
    DoublyLinkedListNode next = null;
    DoublyLinkedListNode current = llist;
    while(current!=null){
         
        next = current.next;
        current.next = prev;
        current.prev = next;
        prev = current;
        current = next;
    }
    current = prev;
    
    return current;
    
    }
