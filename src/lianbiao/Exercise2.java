package lianbiao;

/**
 * @program: Algorithm
 * @description: 链表的部分翻转
 * 给定一个链表，翻转该链表从m到n的位置，要求直接反转，空间复杂度为O(1)
 * 如：给定1->2->3->4->5,m=2,n=4，返回1->4->3->2->5
 *  1<=m<=n<=链表长度
 * @author: Wsl
 * @create: 2018-10-22 11:02
 **/
//思路：找到m的前一个节点，后面采用头插法，每次插到m的前面。
public class Exercise2 {

    public static void main(String[] args) {
        Node head = new Node();
        head.makeLinkedList(head,5);
        Node.print(head);
        Node.print(reverse(head,2,5));

    }
    public static Node reverse(Node head,Integer m,Integer n){
        //遍历到m的前一个节点处，保存下来
        Node nodePre = head;//前一个节点
        for (int i = 0; i <m-1; i++) {
            nodePre=head.next;
        }
        Node node = nodePre.next;//第一个翻转的节点
        Node nodeNex = node.next;
        for (int i = 0; i <n-m ; i++) {
            node.next=nodeNex.next;
            nodeNex.next=nodePre.next;
            nodePre.next=nodeNex;
            nodeNex=node.next;
        }
        return head;
    }
}
