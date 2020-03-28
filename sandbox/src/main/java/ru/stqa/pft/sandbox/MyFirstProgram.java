package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
    	Square s = new Square(5);
    	Rectangle r = new Rectangle(2,8);
		System.out.println("s1 = " + s.area());
		System.out.println("s2 = " + r.area());
    }
}

