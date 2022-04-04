package com.company;

public class Main {

    public static void main(String[] args) {
	Figure[] figure = {
            new Square(10),
            new Square(23)};
        for (int i = 0; i < figure.length; i++) {
            System.out.println(figure[i].info());
                    }
        Rectangle rectangle = new Rectangle(7,8);
        Rectangle rectangle1 = new Rectangle(8,9);
        Rectangle rectangle2 = new Rectangle(13,58);
        System.out.println(rectangle.info());
        System.out.println(rectangle1.info());
        System.out.println(rectangle2.info());
    }
}


