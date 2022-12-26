public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(3);
        list.insertAtBeginning(5);
        list.insertAtBeginning(8);
        list.display();
        System.out.println();
        list.insertAtPos(1, 4);
        list.display();

    }
}
