package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner lean = new Scanner(System.in);

        System.out.println("Ingresa el número de la opción que deseas realizar:");
        System.out.println("1-Area Circulo");
        System.out.println("2-Area Cuadrado");
        System.out.println("3-Area Triangulo");
        System.out.println("4-Area Rectangulo");
        int option = lean.nextInt();

        switch (option){
            case 1:
                System.out.println("Dame el radio del circulo:");
                double ratio = lean.nextDouble();
                double circleArea = Math.PI * Math.pow(ratio,2);
                System.out.println("El area del circulo es: "+circleArea);
                break;
            case 2:
                System.out.println("Dame el valor del lado del cuadrado:");
                double side = lean.nextDouble();
                double squareArea = side * side;
                System.out.println("El area del cuadrado es: "+squareArea);
                break;
            case 3:
                System.out.println("Dame el valor de la base del triangulo:");
                double base = lean.nextDouble();
                System.out.println("Dame el valor de la altura del triangulo:");
                double height = lean.nextDouble();

                double triangleArea = (base * height)/2;

                System.out.println("El area del tringulo es: "+triangleArea);
                break;
            case 4:
                System.out.println("Dame el valor de la base del rectangulo:");
                double baseRectangle = lean.nextDouble();
                System.out.println("Dame el valor de la altura del rectangulo:");
                double heightRectangle = lean.nextDouble();

                double rectangleArea = baseRectangle * heightRectangle;

                System.out.println("El area del rectangulo es: "+rectangleArea);
                break;
            default:
                System.out.println("Elige bien");
                break;
        }
    }
}