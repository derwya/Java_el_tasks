package com.alex;

public class TaskTen {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 3, 10, 30);
        Rectangle rectangle1 = new Rectangle(10, 10, 200, rectangle);
        System.out.printf("%.2f, %.2f, %.2f, %.2f", rectangle1.left, rectangle1.top, rectangle1.width, rectangle1.height);
    }
}

class Rectangle {
    double left = 0, top = 0, width = 0, height = 0;

    public Rectangle() {
    }

    public Rectangle(double width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double left, double top, double width) {
        this(width);
        this.left = left;
        this.top = top;
    }

    public Rectangle(double left, double top, double width, double height) {
        this(width, height);
        this.left = left;
        this.top = top;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.left, rectangle.top, rectangle.width, rectangle.height);
    }

    public Rectangle(double scale, Rectangle rectangle) {
        this(rectangle.left, rectangle.top, rectangle.width * scale / 100, rectangle.height * scale / 100);
    }


    public Rectangle(double left, double top, Rectangle rectangle) {
        this(left, top, rectangle.width, rectangle.height);
    }

    public Rectangle(double left, double top, double scale, Rectangle rectangle) {
        this(left, top, rectangle.width * scale / 100, rectangle.height * scale / 100);
    }


}