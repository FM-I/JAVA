package com.education.ztu;


import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Random;

public class Main3 {



    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(new Product("Product 1", "Category 1", rnd.nextInt(10000)));
        list.add(new Product("Product 2", "Category 1", rnd.nextInt(10000)));
        list.add(new Product("Product 3", "Category 1", rnd.nextInt(10000)));
        list.add(new Product("Product 4", "Category 2", rnd.nextInt(10000)));
        list.add(new Product("Product 5", "Category 2", rnd.nextInt(10000)));
        list.add(new Product("Product 6", "Category 3", rnd.nextInt(10000)));
        list.add(new Product("Product 7", "Category 1", rnd.nextInt(10000)));
        list.add(new Product("Product 8", "Category 4", rnd.nextInt(10000)));
        list.add(new Product("Product 9", "Category 2", rnd.nextInt(10000)));
        list.add(new Product("Product 10", "Category 3", rnd.nextInt(10000)));

        Formatter f = new Formatter();

        String separator = "===============================================================%n";
        Date date = new Date();

        f.format("Дата та час покупки: %1$25td.%1$tm.%1$tY %1$tH:%1$tM:%1$tS %n", date);
        f.format(separator);
        f.format("%1s %2$10s %3$20s %4$20s %n", "№", "Товар", "Категорія", "Ціна");
        f.format(separator);

        int index = 1;
        double sum = 0;
        for (Product p :
                list) {
            f.format("%-5s %2$-18s %3$-24s %4$d₴ %n", index + ".", p.name, p.category, p.price);
            ++index;
            sum += p.price;
        }

        f.format(separator);
        f.format("%-49s %.2f₴", "Разом:", sum);
        System.out.println(f.out());

    }

}
