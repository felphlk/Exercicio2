public class Quadrado implements AreaCalculavel {
    private double lado;
    private double segLado;
    public Quadrado(double lado,double segLado){
        this.lado=lado;
        this.segLado=segLado;
    }
    public double calcularArea() {
        return lado*segLado;
    }



}
