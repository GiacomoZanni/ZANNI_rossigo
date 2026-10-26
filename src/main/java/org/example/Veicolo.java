package org.example;

abstract class Veicolo {
    private int codice;
    private int caricaBatteria = 100;
    private String stato = "";

    abstract double CalcolaCosto(int minuti);
    abstract double ConsumoBatteriaAlMinuto();
}
