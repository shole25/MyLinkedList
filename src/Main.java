public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList=new MyLinkedList<>();
        linkedList.add("firstData");
        linkedList.add("secondData");
        linkedList.add("MyLovelyCode");
        linkedList.remove(1);
        System.out.println(linkedList.get(0));
        //System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

    }



}