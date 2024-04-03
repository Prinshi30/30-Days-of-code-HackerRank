 public static Node removeDuplicates(Node head) {
        Set<Integer> set = new HashSet<Integer>();
        if (head == null) return head;
        set.add(head.data);
        Node curr = head;
        while (curr.next != null) {
            
            if (set.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                set.add(curr.next.data);
                curr = curr.next;
            }            
        }
        return head;
    }
