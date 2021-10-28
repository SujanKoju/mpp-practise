package com.example.mpp.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author kojusujan1111@gmail.com 27/10/21
 * <p>
 * Watch this for comparable Vs comparator
 * https://www.youtube.com/watch?v=oAp4GYprVHM
 */

public class LaptopWithComparator {
    public String brand;
    public int ram;
    public int price;

    public LaptopWithComparator(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public static void main(String[] args) {
        LaptopWithComparator dell = new LaptopWithComparator("Dell", 2, 100000);
        LaptopWithComparator apple = new LaptopWithComparator("Apple", 4, 250000);
        LaptopWithComparator acer = new LaptopWithComparator("Acer", 1, 150000);

        List<LaptopWithComparator> laptopList = new ArrayList<>();
        laptopList.add(dell);
        laptopList.add(apple);
        laptopList.add(acer);

        laptopList.sort(Comparator.comparing(laptopWithComparator -> laptopWithComparator.brand));
        laptopList.forEach(laptop -> System.out.println(laptop.toString()));

    }

    @Override
    public String toString() {
        return "LaptopWithComparator{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
