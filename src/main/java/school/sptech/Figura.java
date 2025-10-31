package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public Figura() {
    }

    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espessura=" + espessura +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public Figura setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public Figura setEspessura(Integer espessura) {
        this.espessura = espessura;
        return this;
    }
}
