package com.company;

public class Main {

    public static void main(String[] args) {
	Figure[] figure = {
            new Square(10),
            new Square(23),
        new Rectangle(7,8),
        new Rectangle(8,9),
        new Rectangle(13,58)};
        for (Figure value : figure) {
            System.out.println(value.info());
        }
    }
}


