package lianbiao;

import java.util.Random;

/**
 * @program: Algorithm
 * @description: 链表节点
 * @author: Wsl
 * @create: 2018-10-22 11:05
 **/
public class Node{
    Integer value;
    Node next;
    public Node(Integer value){
        this.value=value;
    }
    public Node(Integer value,Node next){
        this.value=value;
        this.next=next;
    }
    public Node(){
    }

    public static void print(Node head) {
        StringBuilder sb = new StringBuilder();
        Node node = head.next;
        while(node!=null){
            sb.append(node.value);
            node=node.next;
            if (node!=null) {
                sb.append("->");
            }
        }
        System.out.println(sb.toString());
    }

    public Node makeLinkedList(Node head, Integer num){
        Random random = new Random();
        Node result = head;
        for (int i = 1; i <=num; i++) {
            Node node = new Node(random.nextInt(10));
            head.next=node;
            head=node;
        }
        return result;
    }

}
