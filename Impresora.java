package Figuras;

public class Impresora <T extends Figura> {
    
    private T figuraAImprimir;

    public Impresora(T figuraAImprimir){
        this.figuraAImprimir = figuraAImprimir;
    }

    public void imprimir(){
        System.out.println("{" +
        " color='" + figuraAImprimir.getColor() + "'" +
        ", area='" + figuraAImprimir.calcularArea() + "'" +
        ", figura='" + figuraAImprimir.getClass().getName() + "'" +
        "}");
    }
    
}
