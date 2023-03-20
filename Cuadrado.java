package Figuras;

public class Cuadrado extends Figura implements InterfaceFigura {
    
    private Float lado;

    public Cuadrado() { 
    }

    public Cuadrado(String color, Float lado) {
        super(color, 4);
        this.lado = lado;
    }

    public Float getLado() {
        return this.lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }

    public Float calcularArea(){
        return lado*lado;
    }

    @Override
    public Float cacluloDeArea() {
        return lado*lado;
    }

}
