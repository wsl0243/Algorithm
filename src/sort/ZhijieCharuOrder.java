package sort;

/**
 * @program: Algorithm
 * @description: 在要排序的一组数中，假设前面(n-1)[n>=2]个数已经是排好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
 * @author: Wsl
 * @create: 2018-12-21 14:13
 **/
public class ZhijieCharuOrder {
    public static void main(String[] args) {
        sort(new int[]{2,1,7,5,3,4,8},true);
    }
    /**
     *  插入排序
     * @param data  要排序的数组
     * @param reverse 从大到小(false)还是从小到大(ture)
     */
    public static void sort(int[] data, boolean reverse) {
        if (data.length == 1) {
            return;
        }
        int tmp = 0;
        for (int i = 1; i < data.length; i++) {
            tmp = data[i];
            int n = i - 1;
            for (; n >= 0; n--) {
                if (reverse) {   //从小到大排序
                    if (data[n] >= tmp) {
                        data[n + 1] = data[n];  //将大于当前值的数后移一个位置
                    } else {
                        break;
                    }
                } else {    //从大到小排序
                    if (data[n] <= tmp) {
                        data[n + 1] = data[n];  //将小于当前值的数后移一个位置
                    } else {
                        break;
                    }
                }
            }
            data[n+1] = tmp;
        }
    }
}
