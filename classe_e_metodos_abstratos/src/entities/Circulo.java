package entities;

import entities.enums.Cores;

public class Circulo extends Forma {
    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Cores cores, Double raio) {
        super(cores);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return 3.14 * Math.pow(raio, 2);
    }
}
