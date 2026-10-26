package org.example;

import java.time.LocalDateTime;

public class Noleggio {
    private Utente Utente;
    private Veicolo Veicolo;
    private LocalDateTime OraInizio;
    private LocalDateTime OraFine;

    public Noleggio(Utente utente, Veicolo veicolo, LocalDateTime oraInizio, LocalDateTime oraFine) {
        Utente = utente;
        Veicolo = veicolo;
        OraInizio = oraInizio;
        OraFine = oraFine;
    }
}
