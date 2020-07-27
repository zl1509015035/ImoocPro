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

    public void  showData(){

    }

    public static void main(String[] args) {
        DataManage dm = new DataManage();
        int[] a = dm.insertData();
        for (int n : a) {
            System.out.println(n+"  ");
        }
    }
}
