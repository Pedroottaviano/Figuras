package Figuras;

public class Main {
    public static void main(String[] args) {       
        System.out.println("----Programa que imprime figuras geometricas----");
        Figura triangulo = new Triangulo("gris", 2.5f, 5.6f);
        System.out.println(triangulo.toString());
        System.out.println("-------------------------------");

        Figura segundoTriangulo = new Triangulo("violeta", 2.5f, 6f);
        System.out.println(triangulo.toString());
        System.out.println("-------------------------------");

        Figura cuadrado = new Cuadrado("verde", 4.2f);
        System.out.println(cuadrado.toString());
        
        Figura SegundoCuadrado = new Cuadrado("rojo", 4.2f);
        System.out.println(cuadrado.toString());

        System.out.println("-------------------------------");

        Figura circunferencia = new Circunferencia("Amarillo", 3.5f);
        System.out.println(circunferencia.toString());

        Figura segundaCircunferencia = new Circunferencia("Blanco", 5f);
        System.out.println(circunferencia.toString());
    }
}
