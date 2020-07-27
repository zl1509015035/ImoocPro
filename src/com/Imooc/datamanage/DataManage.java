package com.Imooc.datamanage;

import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataManage {
    /**
     * 从键盘接受数据
     *
     * @return 接收数据
     * @author zhul
     */

    public float[] initScore(int x) {
        float[] f = new float[x];
        Scanner sc = new Scanner(System.in);
        //少接受一个数据，为在指定位置处插入数据做准备
        for (int i = 0; i < f.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据:");
            try{
                f[i] = sc.nextFloat();
            }catch (java.util.InputMismatchException e){
                System.out.println("输入的数据格式有误，不能有非数字！");
                sc.next();
            }
        }
        return f;
    }

    /**
     *  显示数组中元素的内容
     *  a：数组
     *  length：要显示数组元素的个数
     * @param
     */
    public void displayAllScore(float[] f ,int length){
        for (int i = 0; i < length; i++) {
            System.out.print(f[i]+"  ");
        }
        System.out.println();
    }

    /**
     *  从键盘接收一个数据，插入到数组的指定位置处
     * @param f 要插入数据的位置
     * @param n 要插入的数据
     * @param k 要插入的位置
     */
    public void update(float[] f, int n , int k){
        f[k]=n;
    }


    public float average(float[] f){
        float sum = 0;
        for(int i=0;i<f.length;i++){
             sum+=f[i];
         }
         int n=f.length;
         float result = sum/n;
        return result;
    }

    public int count(float[] f){
        int count=0;
        for(int i=0;i<f.length;i++){
            if(f[i]>85){
                count++;
            }
        }
        return  count;
    }

    public void displayMenu(){
        System.out.println("********************************");
        System.out.println("        1--初始化数学成绩");
        System.out.println("        2--求成绩的平均值");
        System.out.println("        3--统计成绩大于85分的人数");
        System.out.println("        4--修改指定位置处的成绩");
        System.out.println("        5--打印输出所有成绩");
        System.out.println("        0--退出");
        System.out.println("********************************");


    }

    public static void main(String[] args) {
        Boolean b = true;
        DataManage dm = new DataManage();
        Scanner sc = new Scanner(System.in);
        float[] a =null;
        int input=0;
        int n=0,k=0,x=0;
        while(b){
            dm.displayMenu();
            System.out.println("请输入对应的数字进行操作:");
            input = sc.nextInt();
            if(input==0){
                System.out.println("退出程序！");
                break;
            }
            switch (input){
                case 1:
                    //插入数据
                    System.out.println("请输入要存储的数学成绩的数量");
                    try {
                        x = sc.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("输出格式错误，请重新输入");
                        sc.next();
                        break;
                    }
                    a=dm.initScore(x);
                    //显示数据
                    System.out.println("数组元素为:");
                    dm.displayAllScore(a,a.length);
                    break;
                case 2:
                    if(a!=null){
                        System.out.print("数学平均成绩为:");
                        System.out.println(dm.average(a));
                    }else{
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                case 3:
                    if(a!=null){
                        System.out.print("成绩大于85分的人数为:");
                        System.out.println(dm.count(a)+"人！");
                    }else {
                        System.out.println("还未在数组中插入数据，请重新选择操作");
                    }
                    break;
                case 4:
                //在指定位置处修改数据
                if(a!=null){
                    System.out.print("修改前的数据为:");
                    dm.displayAllScore(a,a.length);
                    System.out.println("请输入要插入数据的位置");

                    try {
                        k = sc.nextInt();
                        if(k>a.length){
                            System.out.println("您输入的位置有误，请重新输入");
                            sc.next();
                            break;
                        }
                        System.out.println("请输入要插入的数据:");
                        n = sc.nextInt();
                    }catch(InputMismatchException e) {
                        System.out.println("输入的数据格式有误，不能有非数字");
                        sc.next();
                        break;
                    }
                    dm.update(a,n,k);
                    System.out.print("修改成功！修改后的成绩为:");
                    dm.displayAllScore(a,a.length);
                }else{
                    System.out.println("还未在数组中插入数据，请重新选择！");
                    sc.next();
                    continue;
                }
                break;
                case 5:
                    if(a!=null){
                        dm.displayAllScore(a,a.length);
                    }else {
                        System.out.println("还未在数组中插入数据，请重新选择！");

                    }
                    break;
                case 0:
                    b=false;
                    break;
                default:
                    break;
            }
        }
    }

/*    public static void main(String[] args) {
        DataManage dm = new DataManage();
        int[] a = dm.insertData();
        dm.showData(a, a.length - 1);
        dm.showData(a, a.length);
    }*/

/*        public static void main(String[] args) {
            DataManage dm = new DataManage();
//            int[] a = dm.insertData();
            int[] a ={23,15,75,68,32,48,27,45,99};
            dm.showData(a, a.length - 1);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要插入的数据:" );
            int n = sc.nextInt();
            System.out.println("请输入要插入的位置:");
            int k = sc.nextInt();
            dm.insertAtArray(a,n,k);
            dm.showData(a,a.length);
            dm.divThree(a);

        }*/

}
