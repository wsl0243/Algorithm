package lianbiao;

/**
 * @program: Algorithm
 * @description:
 * 给定两个链表，分别表示两个非负整数。它们的数字逆序存储在链表中，且每个节点只存储
 * 一个数字，计算两个数的和，并且返回和的链表头指针。
 * 输入：2->4->3,5->6->4
 * 输出：7->0->8
 * @author: Wsl
 * @create: 2018-10-21 17:10
 **/
public class Exercise1 {

    public static void main(String[] args) {
           Node head1= new Node();
           head1.makeLinkedList(head1,3);
           Node head2= new Node();
           head1.makeLinkedList(head2,3);
           Node.print(head1);
           Node.print(head2);
           Node sum = sum(head1, head2, new Node());
           Node.print(sum);

    }
    //思路：从头遍历两个链表，对应的位置相加，定义一个进位变量，如果有进位，保存在变量中，最后得到一个新链表
    public static Node sum(Node node1,Node node2,Node node3){
            Integer a=0;//保存进位
            Node result = node3;
        if(node1.next!=null&&node2.next!=null){
                node1=node1.next;
                node2=node2.next;
                while(node1!=null||node2!=null||a!=0){
                    Integer value1=null;
                    Integer value2=null;
                    if(node1==null&&node2==null){
                        value1 = 0;
                        value2 = 0;
                    }else {
                        if (node1 == null) {
                            value1 = 0;
                            value2 = node2.value;
                        }
                        if (node2 == null) {
                            value2 = 0;
                            value1 = node1.value;

                        }
                        if (node1 != null && node2 != null) {
                            value1 = node1.value;
                            value2 = node2.value;
                        }
                    }
                    Integer sum=value1+value2+a;//加上进位
                    if(sum>=10){
                        a=sum/10;
                        sum=sum%10;
                    }else{
                        a=0;
                    }
                    node3.next=new Node(sum);
                    if (node1!=null) node1=node1.next;
                    if (node2!=null)node2=node2.next;
                    node3=node3.next;
                }
            }
        return result;
    }




}
