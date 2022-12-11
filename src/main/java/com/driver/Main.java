package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String args[]){
        Product P=new Product();
        System.out.println(P.product(3,5));
        System.out.println(P.product(6,9,8));
        System.out.println(P.product(8.0,9.0));
    }

}