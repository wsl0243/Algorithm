package lianbiao;

/**
 * @program: Algorithm
 * @description: 给定一个链表和一个值x，将链表划分为两部分，使得划分后小于x的节点在前，大于等于x的节点在后，在这两部分
 * 中要保持原链表中的出现顺序。
 * 如：给定链表1→4→3→2→5→2和x=3，返回1→2→2→4→3→5
 * 时间复杂度O(n) 空间复杂度O(1)
 * @author: Wsl
 * @create: 2018-10-28 15:16
 **/
//思路:从头遍历一遍链表，两指针p1 p2，小于x的放在p1后面，大于等于x的放在p2后面，最后头尾相连。
public class Exercise3 {
    public static void main(String[] args) {
        Node head = new Node();
        head = head.makeLinkedList(head, 6);
        Node.print(head);
        partition(head,2);
    }

    public static Node partition(Node head , Integer x){


        return head;
    }




}
