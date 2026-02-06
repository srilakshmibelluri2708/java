package com.tnsif.intro.keywords;
abstract class Shape {

    // Abstract method
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    // Implementing abstract method
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Test {
    public static void main(String[] args) {

        Shape s = new Circle(); // reference of abstract class
        s.display();
        s.draw();
    }
}




