public class LinkTester{
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(6);
        list.add(5);
        list.add(0);
        list.add(10);
        // list.remove();
        list.printValues();
        Node found = list.find(5);
        System.out.println(found);
        list.removeAt(3);
        System.out.println("Remove 3rd");
        list.printValues();
    }
}