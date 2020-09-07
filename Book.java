package ru.mirea.kapatsin.Lab1.Book;
import java.lang.*;
public class Book {
    public String name;
    public double price;
    public double receivedSum;
    public double change;
    public Book(String n, double p, double r) {
        name = n;
        price = p;
        receivedSum = r;
        change = this.receivedSum - this.price ;
    }
    public void PurchaseInformation() {
        System.out.println(name+", price ="+price+", the person paid: "+receivedSum+",received the change in the amount of="+change);
    }
}

