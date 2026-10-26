package org.example;

public class Monopattino extends Veicolo{
    private int VelocitaMassima = 25;
    private double Tariffa = 0.25;

    public Monopattino() {
    }

    @Override
    double CalcolaCosto(int minuti) {
        double costo = Tariffa*minuti;
        return costo;
    }

    @Override
    double ConsumoBatteriaAlMinuto() {
        return 0.80;
    }

    public int GetPotenzaMotore(){
        return 3;
    }
}
