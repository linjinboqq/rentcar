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
    private static List<che> ches =new ArrayList<>(); //��ų�������
    private static int[] mount;//��������
    private static int[] day;//��������

    public static void main(String[] args) {
        init();//��ʼ����������
        zhanshi();//չʾ����
        shuru();//�û�����
        result();//���㲢���ؽ��
        System.out.println("����س������⳵");
        Scanner in=new Scanner(System.in);
        in.nextLine();

    }

    //�����е��� ������
      public  static void init(){
          zaike = new zaike(1, "С�γ�", 40, 4);ches.add(zaike);
          zaike1 = new zaike(2, "�����", 65, 7);ches.add(zaike1);
          zaike2 = new zaike(3, "��ͳ�", 80, 20);ches.add(zaike2);
          zaihuo2 = new zaihuo(4, "��ʽ��", 80, 4.5);ches.add(zaihuo2);
          zaihuo = new zaihuo(5, "������", 30, 1.5);ches.add(zaihuo);
          zaihuo1 = new zaihuo(6, "������", 47, 2.5);ches.add(zaihuo1);
          pika = new pika(7, "��ʽƤ����", 60, 5, 1);ches.add(pika);
          pika1 = new pika(8, "��ʽƤ����", 60, 2, 3);ches.add(pika1);
      }

    public  static void zhanshi(){
        for (che che: ches
             ) {
            System.out.println(che);
        }
    }

    public  static void shuru(){
        Scanner in=new Scanner(System.in);
        mount = new  int[9];//��������
        day = new  int[9];//��������
        for (int i=1;i<=8;i++) {
            System.out.println("������" + ches.get(i-1).name+ "����������");
            int j = in.nextInt();
            if(j<0){
                System.out.println("���복��������С��0 ,��������");//�����������
                j=in.nextInt();
            }
            else {
                System.out.println("�������������Ϊ"+i+"�ĳ�������");
                int n=in.nextInt();
                if(n<0){
                    System.out.println("������������С��0 ,��������");//�����������
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
        System.out.println("������� "+sum);
        System.out.println("���ó�������"+summount);
//        ����������������Ŀ
        System.out.println("����������������Ŀ");
        for (int i = 0; i <8 ; i++) {
            if(mount[i+1]>0&&day[i+1]>0){
                System.out.println(ches.get(i).name +":  "+mount[i+1]+"��");
            }
            System.out.println();
        }
    }
}
