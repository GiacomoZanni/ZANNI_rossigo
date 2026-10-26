package org.example;

public class Bici extends Veicolo{
    private int Nmarce = 6;
    private double Tariffa = 0.15;

    public Bici() {
    }

    @Override
    double CalcolaCosto(int minuti) {
        double costo = Tariffa*minuti;
        return costo;
    }

    @Override
    double ConsumoBatteriaAlMinuto() {
        return 0.50;
    }

    public int GetPolliciaggioRuota(){
        return 20;
    }
}
