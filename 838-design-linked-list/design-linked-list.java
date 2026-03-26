
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (head == null || index >= size) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        size++;

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        size++;

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node node = new Node(val);
        size++;

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }
}
