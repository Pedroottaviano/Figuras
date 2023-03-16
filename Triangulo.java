package Figuras;

public class Triangulo extends Figura {
    private Float base;
    private Float altura;

    public Triangulo() { 
    }

    public Triangulo(String color, Float base, Float altura) {
        super(color, 3);
        this.base = base;
        this.altura = altura;
    }

    public Float getBase() {
        return this.base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return this.altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float calcularArea() {
        return (base*altura)/2;
    }
}
