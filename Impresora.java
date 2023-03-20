package Figuras;

public class Impresora <T extends Figura> {
    
    public Impresora(){
    }

    public void imprimir(T figuraAImprimir){
        System.out.println("{" +
        " La figura es un '" + figuraAImprimir.getClass().getName().substring(8) + "'" +
        ", de color '" + figuraAImprimir.getColor() + "'" +
        " y area '" +  figuraAImprimir.calcularArea() + "'" +
        " }");
    }
    
}
