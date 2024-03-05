public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
            DoublyLinkedListNode dummy = head;
            DoublyLinkedListNode previous = null;

            DoublyLinkedListNode node = new DoublyLinkedListNode(data);
            while (head != null) {
                if (head.data > data) {
                    // First element
                    if (previous != null) {
                        previous.next = node;    
                    }
                    
                    node.next = head;
                    node.prev = previous;
                    return (node.prev == null) ? node : dummy; 
                }
                
                previous = head;
                head = head.next;
            }
            
            previous.next = node;
            node.prev = previous;
            node.next = null;
            return dummy;

        }
