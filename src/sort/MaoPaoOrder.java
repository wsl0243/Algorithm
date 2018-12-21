package sort;

/**
 * @program: Algorithm
 * @description: 每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换
 * @author: Wsl
 * @create: 2018-12-21 13:36
 **/
public class MaoPaoOrder {
    /**
     * 冒泡排序
     * @param data    要排序的数组
     * @param reverse 从大到小(false)还是从小到大(ture)
     */
    public static void sort(int[] data, boolean reverse) {
                 if (data.length == 1) {
                         return;
                     }
                 for (int i = 0; i < data.length - 1; i++) {
                         int tmp = 0;
                         for (int j = 0; j < data.length - i - 1; j++) {
                                if (reverse) {  //从小到大(ture)
                                         if (data[j] >= data[j+1]) {
                                               tmp = data[j];
                                                data[j] = data[j +1 ];
                                                data[j+1] = tmp;
                                            }
                                     } else {    //从大到小(false)
                                        if (data[j] <= data[j+1]) {
                                                tmp = data[j+1];
                                                 data[j+1] = data[j];
                                                data[j] = tmp;
                                     }
                                  }
                            }
                    }
            }
}
