package com.atguigu.a_object;

public class Test {
    public static void main(String[] args) {
        Citizen cz = new Citizen();
        cz.name = "叶枫";
        cz.idCard = "123456789";

        cz.birthday.year = 2000;
        cz.birthday.month = 8;
        cz.birthday.day = 19;
        System.out.println(cz.name + "," + cz.birthday.year + "," + cz.idCard);
    }
}
