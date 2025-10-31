package school.sptech;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    public Triangulo() {

    }

    @Override
    public Double calcularArea() {
        return (base * altura)/2.0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public Double getBase() {
        return base;
    }

    public Triangulo setBase(Double base) {
        this.base = base;
        return this;
    }

    public Double getAltura() {
        return altura;
    }

    public Triangulo setAltura(Double altura) {
        this.altura = altura;
        return this;
    }
}
