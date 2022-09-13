package co.lugutori.samples.list;

public class List<T> {
    public Node<T> head;

    public List(){
        head = null;
    }
    public void addNode(T data){
        Node<T> newNode = new Node<T>(data);
        if(null == head){
            head = newNode;
            return;
        }
        Node<T> window = head;
        while(window.next != null){
            window = window.next;
        }
        window.next = newNode;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        Node<T> window = head;
        while(null != window){
            builder.append(window.getData().toString());
            if(null != window.next){
                builder.append(",");
            }
            window = window.next;
        }
        builder.append("]");
        return builder.toString();
    }

}
