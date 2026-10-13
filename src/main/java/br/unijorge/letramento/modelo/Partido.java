package br.unijorge.letramento.modelo;

import java.util.Objects;

public class Partido {

    private final String numero;
    private final String sigla;
    private final String nome;

    public Partido(String numero, String sigla, String nome) {
        if (numero == null || !numero.matches("\\d{2}")) {
            throw new IllegalArgumentException("O número do partido deve ter exatamente 2 dígitos: " + numero);
        }
        if (sigla == null || sigla.isBlank()) {
            throw new IllegalArgumentException("A sigla do partido é obrigatória");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do partido é obrigatório");
        }
        this.numero = numero;
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNumero() { return numero; }
    public String getSigla() { return sigla; }
    public String getNome() { return nome; }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true;
        if (!(outro instanceof Partido)) return false;
        Partido partido = (Partido) outro;
        return numero.equals(partido.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return sigla + " (" + numero + ")";
    }
}
