package school.sptech;

public class Quadrado extends Figura {
    private Double lado;
    private Figura figura;

    public Quadrado() {

    }

    @Override
    public Double calcularArea(){
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", figura=" + figura +
                '}';
    }

    public Double getLado() {
        return lado;
    }

    public Quadrado setLado(Double lado) {
        this.lado = lado;
        return this;
    }

    public Figura getFigura() {
        return figura;
    }

    public Quadrado setFigura(Figura figura) {
        this.figura = figura;
        return this;
    }
}
