public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }else{
             //Declare a temp node to travers to the end of linkedlist
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    //Lets show the data

    public void show(){

        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data){

        Node node = new Node();
        node.data = data;
       // node.next = null;
        node.next = head;

        head = node;

    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        //Traverse the loop to find the index we passed
        //Declare a temp  node

        //index value 0 has some special request

        if(index == 0){
            insertAtStart(data);
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {

                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){

        if (index == 0){
            head = head.next;
        }else{
            //Declare two temp variables
            Node n = head;
            Node n1 =null;
            for (int i =0; i<index -1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;

            System.out.println("n1 " + n1.data + "Deleted");
            n1 = null;
        }
    }

}
