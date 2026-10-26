package org.example;

public class Utente {
    private String Id;
    private String Nome;
    private String CodFiscale;
    private String Email;
    private double Credito;

    public Utente(String id, String nome, String codFiscale, String email, double credito) {
        Id = id;
        Nome = nome;
        CodFiscale = codFiscale;
        Email = email;
        Credito = credito;
    }
}
