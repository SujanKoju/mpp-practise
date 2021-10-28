package com.example.mpp.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kojusujan1111@gmail.com 27/10/21
 * <p>
 * <p>
 * * When implementing Comparable, you can compare the Laptops (and sort list of Laptopss) based only on what is written in compareTo (based on brand , and if same brand then consider ram , then price)
 * *
 * * Suppose that you want sometimes to sort a list of Laptop based on brand, another time based on Ram, and
 * third time based on price -> in this case you can't use Comparable -> the solution is to use Comparator
 * so implement comparator of each case
 */

public class LaptopWithComparable implements Comparable<LaptopWithComparable> {
    public String brand;
    public int ram;
    public int price;

    public LaptopWithComparable(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public int compareTo(LaptopWithComparable laptop) {
        int result = this.brand.compareTo(laptop.brand);
        if (result == 0) {  // Same brand
            result = this.ram - laptop.ram;
            if (result == 0) // Same brand and same ram
            {
                result = this.price - laptop.price;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "LaptopWithComparable{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<LaptopWithComparable> laptopList = new ArrayList<>();
        LaptopWithComparable dell = new LaptopWithComparable("Apple", 2, 100000);
        LaptopWithComparable apple = new LaptopWithComparable("Apple", 2, 250000);
        LaptopWithComparable acer = new LaptopWithComparable("Apple", 2, 150000);

        laptopList.add(dell);
        laptopList.add(apple);
        laptopList.add(acer);

        Collections.sort(laptopList);

        laptopList.forEach(laptop -> System.out.println(laptop.toString()));

    }
}


