package HomeWork12;

import HomeWork11.Human;
import HomeWork11.Main;

import java.time.LocalDate;

public class Main1 {

    public static String resultAllCarsDatails(Car[] car) {
        for (int i = 0; i < Main1.car.length; i++)
            System.out.println(Main1.car[i].toString());

        return null;
    }

    public static Car[] car = new Car[5];

    public static void main(String[] args) {

        Car e = new Car(" Lada. ", " Grande. ", 1.7, " желтого цвета. ", LocalDate.now().getYear(), " Россия. ");
        Car e1 = new Car(" Audi. ", " A8 50 L TDI. ", 3.0, " черный цвета. ", 2020, " Германия. ");
        Car e2 = new Car(" BMW. ", " Z8. ", 3.0, " черного цвета. ", 2021, " Германия. ");
        Car e3 = new Car(" Kia. ", " Sportage 4 поколение. ", 2.4, " красный цвета. ", 2018, " Южной Корее. ");
        Car e4 = new Car(" Hyundai. ", " Avante. ", 1.6, " оранжевого цвета. ", 2016, " Южной Корее. ");
        car[0] = e;
        car[1] = e1;
        car[2] = e2;
        car[3] = e3;
        car[4] = e4;

        System.out.println(resultAllCarsDatails(car));

    }
}