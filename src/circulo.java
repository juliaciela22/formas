public class circulo implements ICalcGeometria{
    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcPerimetro() {
        return (2 * Math.PI * this.raio);
    }

    @Override
    public double calcArea() {
        return (Math.PI* Math.pow(this.raio, 2));
    }
}
