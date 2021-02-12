package com.company.core;

public enum Procedencia {
    NACIONAL(250000), INTERNACIONAL(350000);

    private final int recargo;

    Procedencia(int recargo) {
        this.recargo = recargo;
    }

    public int getRecargo() {
        return recargo;
    }
}