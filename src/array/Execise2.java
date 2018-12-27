package array;

import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: 二维数组的查找：每一行左往右递增，每一列上往下递增。
 * @author: Wsl
 * @create: 2018-12-27 13:09
 **/
public class Execise2 {

    public static int[] find(int[][] arr,int key){
        int columns = arr[0].length-1;//列标
        int rows = arr.length-1;
        int row = 0;//初始行标
        while(columns>=0&&row<=rows){
            if (key==arr[row][columns]){
                return new int[]{row,columns};
            }
            if (key>arr[row][columns]){
                row++;
            }else{
                columns--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8}};
        String s = Arrays.toString(find(arr, 2));
        System.out.println(s);

    }


}
