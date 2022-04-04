package com.company;

public class Rectangle extends  Figure{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        super.setPerimetr(calculate_perimetr());
    }

    @Override
    public int calculate_area() {
        int areaRectagle;
        areaRectagle = (width+length) * 2;
        return areaRectagle;
    }

    @Override
    public int calculate_perimetr() {
        int perimetrReatagle;
        perimetrReatagle = width+length + width + length;
        return perimetrReatagle;
    }

    @Override
    public String info() {

        return
                "\nLength: " + length  + Figure.unit +
                        "\nwidth: " + width + Figure.unit +
                        "\nPerimetr: " + getPerimetr()  +
                        "\nArea: " + calculate_area() ;
    }
}
