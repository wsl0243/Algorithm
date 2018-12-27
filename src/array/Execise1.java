package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Algorithm
 * @description: 找出数组中重复的数字
 * @author: Wsl
 * @create: 2018-12-26 15:55
 **/
public class Execise1 {
    //思想1：交换
    public static int duplication;

    public static boolean duplicate(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] >= arr.length) {
                return false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) {
                    duplication = arr[i];
                    System.out.println(arr[i]);
                    return true;
                }

                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 3, 4, 2, 5, 7 };
        int result = find(arr);
        System.out.println(result);
    }

    //思想2：哈希表
    public static int find(int[] arr){
        //创建一个哈希表
        Map<Integer,Integer> map = new HashMap<>();
        for(int x =0 ;x<arr.length;x++){
            if (map.get(arr[x])!=null){
                return arr[x];
            }else{
                map.put(arr[x],1);
            }
        }
        return 0;


    }


}
