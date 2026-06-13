class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int val){
        this.val = val;
    }
}

class MyLinkedList {
    ListNode dummyLeft;
    ListNode dummyRight;
    int length;


    public MyLinkedList() {
        dummyLeft = new ListNode(0);
        dummyRight = new ListNode(0);
        length = 0;
        dummyLeft.next = dummyRight;
        dummyRight.prev = dummyLeft;

        dummyLeft.prev = null;
        dummyRight.next = null;
    }
    
    public int get(int index) {
        if(index >= length){
            return -1;
        }
        int i = 0;
        ListNode curr = dummyLeft.next;

        while(curr.next != null){
            if(i == index){
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        
        ListNode tba = new ListNode(val);

        tba.prev = dummyLeft;
        tba.next = dummyLeft.next;
        dummyLeft.next.prev = tba;
        dummyLeft.next = tba;
        length++;
    }
    
    public void addAtTail(int val) {
        ListNode tba = new ListNode(val);

        tba.next = dummyRight;
        tba.prev = dummyRight.prev;
        dummyRight.prev.next = tba;
        dummyRight.prev = tba;
        length++;
    }
    
    public void addAtIndex(int index, int val) {

        if(index > length){
            return;
        }
        if(index == length){
            addAtTail(val);
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }

        int i = 0;
        ListNode tba = new ListNode(val);
        ListNode curr = dummyLeft.next;

        while(curr.next != null){
            if(i == index){
                tba.prev = curr.prev;
                tba.next = curr;
                curr.prev.next = tba;
                curr.prev = tba;
                length++;
                return;
            }
            curr = curr.next;
            i++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index >= length){
            return;
        }

        int i = 0;
        ListNode curr = dummyLeft.next;

        while(curr.next != null){
            if(i == index){
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                curr.next = null;
                curr.prev = null;
                length--;
                return;
            }
            curr = curr.next;
            i++;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */