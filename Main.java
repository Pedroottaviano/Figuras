package Figuras;

public class Main {
    public static void main(String[] args) {       
        System.out.println("----Programa que imprime figuras geometricas----");
        Figura triangulo = new Triangulo("gris", 2.5f, 5.6f);

        Impresora<Figura> impresora = new Impresora<>(triangulo);

        impresora.imprimir();
    }
}
