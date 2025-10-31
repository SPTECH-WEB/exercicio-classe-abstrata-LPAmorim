package school.sptech;

public class Retangulo extends Figura {
    private Double base;
    private Double altura;

    public Retangulo(){}

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public Double getBase() {
        return base;
    }

    public Retangulo setBase(Double base) {
        this.base = base;
        return this;
    }

    public Double getAltura() {
        return altura;
    }

    public Retangulo setAltura(Double altura) {
        this.altura = altura;
        return this;
    }
}
