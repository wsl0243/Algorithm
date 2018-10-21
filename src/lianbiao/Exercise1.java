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
    static class Node{
        private Integer value;
        private Node next;
        public Node(Integer value){
            this.value=value;
        }
        public Node(Integer value,Node next){
            this.value=value;
            this.next=next;
        }
        public Node(){
            this.value=value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
            Node head1 = new Node();
            Node node3 = new Node(8);
            Node node2 = new Node(6,node3);
            Node node1 = new Node(7,node2);
            head1.next=node1;
            Node head2 = new Node();
            Node node6 = new Node(5);
            Node node5 = new Node(4,node6);
            Node node4 = new Node(3,node5);
            head2.next=node4;
            Node sum = sum(head1, head2, new Node());
            System.out.println(sum);

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
                    if(node1==null){
                        value1=0;
                    }
                    if (node1==null){
                        value2=0;
                    }else {
                        value1 = node1.value;
                        value2 = node2.value;
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
