import java.util.LinkedList;

public class MyLinkedList<T> {

private int size;
private Node<T> tail;
private Node<T> head;

    public MyLinkedList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }


    class Node<T>{
        Node<T> prev;
        Node<T> next;
        T data;


        public Node(Node<T> prev, Node<T> next, T data) {
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }

    public void add(T data){

        addLast(data);
    }
    public void addLast(T data){
        Node<T> last =tail;
        Node<T> newNode =new Node<>(last,null,data);
        tail=newNode;
        if (last==null){
            head=newNode;
            // qutu boshdursa ilk ve sonuncu nulldur ora newNode elave edirik
        }
        else {
            last.next=newNode;
            //eger sonuncu kimse varsa sonuncunun novbetisine newNode elave edirem
        }
        size++;
    }
public void addFirst(T data){
        Node<T> first = head;
        Node<T> newNode =new Node<>(null,first,data);
        if (first==null){
            this.head=newNode;
        }
        else {
            first.prev=newNode;

        }
        this.head=newNode;
        size++;

}
public void indexCheck(int index){
        if (index<0 || index>size){
throw new IndexOutOfBoundsException();
    }
      }

    public T get(int index){
indexCheck(index);
         if (index<size/2){
            Node<T> node= head;
             for (int i=0;i<index;i++){
                 node=node.next;
             }return node.data;
         }
         else {
Node<T> node =tail;
for (int i=size-1;i>index;i--){
node=node.prev;


    }return node.data;


}}
    public boolean isEmpty() {
        return size == 0;
    }
 public void remove(int index){
        indexCheck(index);
        // gelen indexi yoxlayiriq
     Node<T> node =head;
     for (int i=0;i<index;i++){
         node=node.next;
         // i indexine uygun node nin yerine next nodeni qoy
     }



     if (node.prev!=null){
   node.prev.next=node.next;
 }
     else {
         head=node.next;
         //head silinir
     }
if (node.next !=null){
   node.next.prev=node.prev;
}
else {
    tail=node.prev;
}

}}
