package com.lin.zuche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rent {

    private static pika pika;
    private static pika pika1;
    private static zaihuo zaihuo;
    private static zaihuo zaihuo1;
    private static zaihuo zaihuo2;
    private static zaike zaike;
    private static zaike zaike1;
    private static zaike zaike2;
    private static List<che> ches =new ArrayList<>(); //存放车的数据
    private static int[] mount;//租用数量
    private static int[] day;//租用天数

    public static void main(String[] args) {
        init();//初始化加载数据
        zhanshi();//展示数据
        shuru();//用户输入
        result();//计算并返回结果
        System.out.println("输入回车结束租车");
        Scanner in=new Scanner(System.in);
        in.nextLine();

    }

    //数据有点乱 多多包涵
      public  static void init(){
          zaike = new zaike(1, "小轿车", 40, 4);ches.add(zaike);
          zaike1 = new zaike(2, "面包车", 65, 7);ches.add(zaike1);
          zaike2 = new zaike(3, "大巴车", 80, 20);ches.add(zaike2);
          zaihuo2 = new zaihuo(4, "厢式车", 80, 4.5);ches.add(zaihuo2);
          zaihuo = new zaihuo(5, "低栏车", 30, 1.5);ches.add(zaihuo);
          zaihuo1 = new zaihuo(6, "高栏车", 47, 2.5);ches.add(zaihuo1);
          pika = new pika(7, "日式皮卡车", 60, 5, 1);ches.add(pika);
          pika1 = new pika(8, "美式皮卡车", 60, 2, 3);ches.add(pika1);
      }

    public  static void zhanshi(){
        for (che che: ches
             ) {
            System.out.println(che);
        }
    }

    public  static void shuru(){
        Scanner in=new Scanner(System.in);
        mount = new  int[9];//租用数量
        day = new  int[9];//租用天数
        for (int i=1;i<=8;i++) {
            System.out.println("请输入" + ches.get(i-1).name+ "的租用数量");
            int j = in.nextInt();
            if(j<0){
                System.out.println("输入车辆数不能小于0 ,重新输入");//车辆输入错误
                j=in.nextInt();
            }
            else {
                System.out.println("请输入租用序号为"+i+"的车的天数");
                int n=in.nextInt();
                if(n<0){
                    System.out.println("输入天数不能小于0 ,重新输入");//天数输入错误
                    n=in.nextInt();
                }else {
                    day[i]=n;
                }
            }
            mount[i]=j;
        }
    }

    public  static void result(){
        int sum=0;
        int summount=0;
        for (int i = 0; i <8 ; i++) {
            if(mount[i+1]>0){
                summount=mount[i+1]+summount;
                int tem=mount[i+1]*day[i+1]*ches.get(i).money;
                sum=tem+sum;
            }
        }
        System.out.println("总体费用 "+sum);
        System.out.println("租用车辆总数"+summount);
//        各个车辆的租用数目
        System.out.println("各个车辆的租用数目");
        for (int i = 0; i <8 ; i++) {
            if(mount[i+1]>0&&day[i+1]>0){
                System.out.println(ches.get(i).name +":  "+mount[i+1]+"辆");
            }
            System.out.println();
        }
    }
}
