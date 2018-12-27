package lianbiao;

/**
 * @program: Algorithm
 * @description: 从尾到头打印链表
 * @author: Wsl
 * @create: 2018-12-27 14:47
 **/
public class Execise4 {

    static class ListNode{
        int value;
        ListNode next;
    }

    public static void print(ListNode node){
        if (node.next!=null){

            print(node.next);


        }
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.value=1;
        ListNode node2 = new ListNode();
        node2.value=2;
        ListNode node3 = new ListNode();
        node3.value=3;
        node1.next=node2;
        node2.next=node3;
        print(node1);


    }
}
