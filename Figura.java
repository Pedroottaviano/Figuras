package Figuras;

public class Figura {

    private String color;
    private Integer numLados;

    public Figura(String color, Integer numLados) {
        this.color = color;
        this.numLados = numLados; 
    }

    public Figura(String color){
        this.color = color;
    } 

    public Figura(){
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
  
    public void setNumLados(Integer numLados) {
        this.numLados = numLados;
    }

    public Integer getNumLados() {
        return numLados;
    } 

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", numLados='" + getNumLados() + "'" +
            "}";
    }

    public String esTriangulo() {
        if(this.numLados == 3) {
            return "La figura es un triangulo";
        } else {
            return "La figura NO es un triangulo";
        }
    }
}
