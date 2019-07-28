package com.lin.zuche;

public class zaihuo extends  che{
     double zaihuo;

    public zaihuo( int id,String name ,int money,double zaihuo) {
        this.zaihuo =  zaihuo;
        this.id=id;
        this.name=name;
        this.money=money;
    }

    @Override
    public String toString() {
        return "zaihuo{" +
                "zaihuo=" + zaihuo +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
