/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_2;

/**
 *
 * @author User
 */
    public class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(5.0, "blue", true);
            Rectangle rectangle = new Rectangle(4.0, 6.0, "green", false);
            Square square = new Square(3.0, "yellow", true);
            
            System.out.println(circle.toString());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());

            System.out.println(rectangle.toString());
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());

            System.out.println(square.toString());
            System.out.println("Area: " + square.getArea());
            System.out.println("Perimeter: " + square.getPerimeter());
        }
    }
    
