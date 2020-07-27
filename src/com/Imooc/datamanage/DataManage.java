package com.Imooc.datamanage;

import java.util.Scanner;

public class DataManage {
    /**
     * 从键盘接受数据
     *
     * @return 接收数据的数据
     * @author zhul
     */

    public int[] insertData() {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        //少接受一个数据，为在指定位置处插入数据做准备
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据:");
            try{
                a[i] = sc.nextInt();
            }catch (java.util.InputMismatchException e){
                System.out.println("输入的数据格式有误，不能有非数字！");
                sc.next();
            }
        }
        return a;
    }

    /**
     *  显示数组中元素的内容
     *  a：数组
     *  length：要显示数组元素的个数
     * @param
     */
    public void showData(int[]a ,int length){
        for (int i = 0; i < length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    /**
     *  从键盘接收一个数据，插入到数组的指定位置处
     * @param a 要插入数据的位置
     * @param n 要插入的数据
     * @param k 要插入的位置
     */
    public void insertAtArray(int[] a, int n , int k){
        //从最后一个数据开始移动，避免数据覆盖
        for(int i =a.length-1;i>k;i--){
            a[i]=a[i-1];
        }
        a[k] = n;
    }

    public void divThree(int[] a){
        String str="";
        int count = 0;
        for (int n : a) {
            if (n % 3 == 0){

            }
        }
    }

/*    public static void main(String[] args) {
        DataManage dm = new DataManage();
        int[] a = dm.insertData();
        dm.showData(a, a.length - 1);
        dm.showData(a, a.length);
    }*/

        public static void main(String[] args) {
            DataManage dm = new DataManage();
            int[] a = dm.insertData();
            for (int n : a) {
                System.out.println(n+"  ");
            }

        }
}
