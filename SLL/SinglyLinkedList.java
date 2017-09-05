class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
    public String toString(){
        if(next == null){
            return "Node Object value: " + value + " next: null";
        }
        return "Node O bject value: " + value + " next: " + next.toString();
    }
}
  
class SinglyLinkedList{
    public Node head;
    //Constructor
    public SinglyLinkedList(){
        head = null;
    }
    // Create a add(int) method that will add a node to the end of your list with the value in the parameter
    public void add(int val){
        if(head == null){
            head = new Node(val);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(val);
    }

    // Create a remove() method that will remove a node from the end of your list
    public SinglyLinkedList remove(){
        if(head == null){
            System.out.println("EmptyList");
            return this;
        }//Empty SLL means
        if(head.next == null){
            head = null;
            return this;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }//current becomes second to last Node
        current.next = null;
        return this;
    }

    // Create printValues() method that will print all the values of each node in the list in order
    public void printValues(){
        if(head == null){
            System.out.println("EmptyList");
            return;
        }//Empty SLL means do nothing
        Node current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
    // Optional Challenges:
    // Implement a find(int) method that will return the first node with the value in the parameter
    public Node find(int val){
        if(head == null){
            System.out.println("EmptyList");
            return null;
        }//Empty SLL means do nothing
        if(head.value == val){
            return head;
        }
        Node current = head;
        while(current != null){
            if(current.value == val){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    // Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
    public void removeAt(int n){//not finished
        if(head == null){
            System.out.println("EmptyList");
            return;
        }//Empty SLL means do nothing
        if(head.next == null && n == 0){
            head = null;
            return;
        }//remove list if n is 0 and only one in list
        if(head.next != null && n==0){
            head = head.next;
            return;
        }//moves head to next Node if it exists
        int count = 1;
        Node prev = head;
        while(prev.next != null){
            if(count == n){
                prev.next = prev.next.next;//maintain link 
            }
            count++;
            prev = prev.next;
        }

    }
}