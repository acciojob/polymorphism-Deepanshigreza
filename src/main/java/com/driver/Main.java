package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String args[]){
        Product p=new Product();
        p.product(3,5);
        p.product(6,9,8);
        p.product(8.0,9.0);
    }

}