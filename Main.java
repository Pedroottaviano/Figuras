package Figuras;

public class Main {
    public static void main(String[] args) {       
        System.out.println("----Programa que imprime figuras geometricas----");
        Figura triangulo = new Triangulo("gris", 2.5f, 5.6f);
        Figura circunferencia = new Circunferencia("Celeste", 5.2f);
        Figura cuadrado = new Cuadrado("verde", 2.2f);

        Impresora<Figura> impresora = new Impresora<>();

        impresora.imprimir(triangulo);
        impresora.imprimir(cuadrado);
        impresora.imprimir(circunferencia);
    }
}
