package com.example.SpringBootDemo.entity;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private double price;

    public Book()
    {

    }

    public Book(Integer id, String name, String author, double price)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public int getId()
    {
        return id;
    }

    public String getname()
    {
        return name;
    }

    public String getauthor()
    {
        return au-thor;
    }

    public double getprice()
    {
        return price;
    }
}
