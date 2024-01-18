package entities;

import entities.enums.Cores;

public abstract class Forma {

    public Forma() {

    }

    public Forma(Cores cores) {
        this.cores = cores;
    }

    private Cores cores;

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public abstract Double area();
}
