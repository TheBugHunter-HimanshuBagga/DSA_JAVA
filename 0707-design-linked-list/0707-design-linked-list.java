class MyLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {

        if(index < 0 || index >= size){
            return -1;
        }

        if(index == 0){
            return head.data;
        }

        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        return temp.next.data;
    }
    
    public void addAtHead(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

        size++;
    }
    
    public void addAtIndex(int index, int val) {

        if(index > size){
            return;
        }

        if(index <= 0){
            addAtHead(val);
            return;
        }

        Node temp = head;
        int i = 0;
        Node newNode = new Node(val);
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }
    
    public void deleteAtIndex(int index) {

        if(index >= size || index < 0){
            return;
        }

        if(index == 0){
            head = head.next;
            size--;
            return;
        }

        Node temp = head;
        int i = 0;
        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        size--;
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