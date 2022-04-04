package com.company;

public class Square extends Figure{

    private  int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.setPerimetr(calculate_perimetr());
    }

    @Override
    public int calculate_area() {
        return sideLength * sideLength;

    }

    @Override
    public int calculate_perimetr() {
        return sideLength * 4;
    }

    @Override
    public String info() {
        return
               "\nSquare side length: " + sideLength  + Figure.unit +
                       "\nPerimetr: " + getPerimetr()  +
                        "\nArea: " + calculate_area() ;

    }

}
