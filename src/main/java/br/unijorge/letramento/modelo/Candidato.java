package br.unijorge.letramento.modelo;

import java.util.Objects;

public class Candidato {

    private final String numero;
    private final String nomeUrna;
    private final Partido partido;

    public Candidato(String numero, String nomeUrna, Partido partido) {
        Objects.requireNonNull(partido, "Todo candidato precisa de um partido");
        if (numero == null || !numero.matches("\\d+")) {
            throw new IllegalArgumentException("O número do candidato só pode ter dígitos: " + numero);
        }
        if (!numero.startsWith(partido.getNumero())) {
            throw new IllegalArgumentException(
                "O número do candidato deve começar com o número do partido (RN01): " + numero);
        }
        if (nomeUrna == null || nomeUrna.isBlank()) {
            throw new IllegalArgumentException("O nome de urna é obrigatório");
        }
        this.numero = numero;
        this.nomeUrna = nomeUrna;
        this.partido = partido;
    }

    public String getNumero() { return numero; }
    public String getNomeUrna() { return nomeUrna; }
    public Partido getPartido() { return partido; }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true;
        if (!(outro instanceof Candidato)) return false;
        Candidato candidato = (Candidato) outro;
        return numero.equals(candidato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return nomeUrna + " – " + numero + " (" + partido.getSigla() + ")";
    }
}
