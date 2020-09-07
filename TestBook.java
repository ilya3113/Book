package ru.mirea.kapatsin.Lab1.Book;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("War and peace",1900.99 ,2000 );
        System.out.println(d1);
        d1.PurchaseInformation();

    }
}
