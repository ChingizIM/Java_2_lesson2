package com.company;

public abstract class Figure {
    public static String unit = "cm";
    private  int perimetr;

    public int getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(int perimetr) {
        this.perimetr = perimetr;
    }

    public Figure() {

    }
    public abstract int calculate_area();
    public abstract int calculate_perimetr();
    public abstract String info();
}
