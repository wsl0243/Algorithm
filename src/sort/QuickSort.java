package sort;

/**
 * @program: Algorithm
 * @description: 选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部
 * @author: Wsl
 * @create: 2018-12-21 14:24
 **/
public class QuickSort {
    /**
     * 快速排序
     * @param data
     * @param left
     * @param right
     * @param reverse 从大到小(false)还是从小到大(ture)
     */
    public static void sort(int[] data, int left, int right, boolean reverse) {
        if (left >= right) {
            return;
        }
        int index = getIndex(data, left, right, reverse);
        sort(data, left, index - 1, reverse);
        sort(data, index + 1, right, reverse);
    }

    /**
     * 将待排序片段调整顺序,获得"中间数据"的正确索引
     * @param data
     * @param left
     * @param right
     * @param reverse 从大到小(false)还是从小到大(ture)
     * @return
     */
    public static int getIndex(int[] data, int left, int right, boolean reverse) {
        int cur = data[left];
        int i = left;
        int j = right;
        while (i < j) {
            if (reverse) {  //从小到大
                while (data[j] > cur && i < j) {
                    --j;
                }
                data[i] = data[j];
                while (data[i] <= cur && i < j) {
                    ++i;
                }
                data[j]=data[i];
            } else {    //从大到小
                while (data[j] < cur && i < j) {
                    --j;
                }
                data[i]=data[j];
                while (data[i] >= cur && i < j) {
                    ++i;
                }
                data[j]=data[i];
            }
        }
        data[i] = cur;
        return i;
    }
}
