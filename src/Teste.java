public class Teste {
    public static void main(String[] args) {
        Quadrado quad=new Quadrado(10,10);
        Retangulo ret= new Retangulo(10,30);
        Circulo circ=new Circulo(3.14,2);
        System.out.println("Área do Quadrado = "+quad.calcularArea());
        System.out.println("Área do Retangulo = "+ret.calcularArea());
        System.out.println("Área do Circulo = "+circ.calcularArea());
    }

}
