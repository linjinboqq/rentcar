package com.lin.zuche;

public class pika extends  che{
    int zaikeren;
    int zaihuo;
    public pika( int id,String name ,int money,int zaikeren,int zaihuo) {
        this.zaikeren = zaikeren;
        this.zaihuo=zaihuo;
        this.id=id;
        this.name=name;
        this.money=money;
    }

    @Override
    public String toString() {
        return "pika{" +
                "zaikeren=" + zaikeren +
                ", zaihuo=" + zaihuo +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
