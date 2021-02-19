import java.lang.Math;
public class Circulo implements AreaCalculavel {
    private double pi;
    private double r;
    public Circulo(double pi,double r){
        this.pi=pi;
        this.r=r;
    }
    public double calcularArea() {
        return pi*(Math.pow(r,2));
    }
}
