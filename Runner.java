public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(34);
        list.insert(100);
        list.insert(10);
        list.insertAtStart(200);
        list.insertAt(0, 1);
        list.show();
        list.deleteAt(2);
        list.show();
    }
}
