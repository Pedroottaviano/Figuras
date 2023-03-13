package Figuras;

public class Main {
    public static void main(String[] args) {       

        Triangulo triangulo = new Triangulo("gris", 2.5f, 5.6f);
        System.out.println(triangulo.toString());
        System.out.println("-------------------------------");

        Cuadrado cuadrado = new Cuadrado("verde", 4.2f);
        System.out.println(cuadrado.toString());

        System.out.println("-------------------------------");

        Circunferencia circunferencia = new Circunferencia("Amarillo", 3.5f);
        System.out.println(circunferencia.toString());
    }
}
