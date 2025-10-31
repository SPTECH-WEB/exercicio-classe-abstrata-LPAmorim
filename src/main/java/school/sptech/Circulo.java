package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo() {
    }

    @Override
    public Double calcularArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    public Double getRaio() {
        return raio;
    }

    public Circulo setRaio(Double raio) {
        this.raio = raio;
        return this;
    }

}
