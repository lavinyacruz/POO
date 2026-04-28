public class Circulo extends Forma {
    private static final double pi=3.14;
    private double raio;

    public Circulo (double raio) {
        this.raio=raio;
    }
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio=raio;
    }
   @Override
    public double caucArea(){
        this.area=pi*raio*raio;
        System.out.println("A area do circulo eh: "+getArea());
        return this.area;
    }
}