package com.lin.zuche;

public class zaike extends che {
    int zaikeren;

    @Override
    public String toString() {
        return "zaike{" +
                "zaikeren=" + zaikeren +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public zaike(int id, String name , int money, int zaikeren) {
        this.zaikeren = zaikeren;
        this.id=id;
        this.name=name;
        this.money=money;
    }
}
