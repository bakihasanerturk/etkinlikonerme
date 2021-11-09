package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temperature;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Hava Sıcaklığını Giriniz : ");
        temperature = input.nextInt();

        if (temperature<5){
            System.out.println("Bugün kayak yapmak için güzel bir gün");
        }else if (temperature>=5 && temperature<=15){
            System.out.println("Bugün sinemaya gitmek için güzel bir gün");
        }else if (temperature>15 && temperature<=25){
            System.out.println("Bugün piknik yapmak için güzel bir gün");
        }else{
            System.out.println("Bugün yüzmek için güzel bir gün");
        }
    }
}
