package com.driver;

public class Main {
    public static void main(String[] args) {

        Product p=new Product();

        int a=p.product(5,6);
        int b=p.product(5,6,7);
        double c=p.product(5.0,6.0);
}

}
class Product{

    public int product(int x, int y) {
        return  x*y;
    }

    public int product(int x, int y, int z) {

        return x*y*z;
    }

    public double product(double x, double y) {
        return x*y;
    }
}