package br.unijorge.letramento;

// Arquivo TEMPORÁRIO do Encontro 1 (passo 6).
// Na aula ele é criado em src/test/java/br/unijorge/letramento/ e apagado antes do commit.
// Fica aqui só como referência para a professora.

import br.unijorge.letramento.modelo.Candidato;
import br.unijorge.letramento.modelo.Partido;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Experimento {

    public static void main(String[] args) {
        Partido pfa = new Partido("41", "PFA", "Partido do Futuro Azul");
        Candidato ana = new Candidato("41123", "Ana Ventura", pfa);
        System.out.println(ana);
        System.out.println(ana.getPartido().getNome());

        Partido outroPfa = new Partido("41", "PFA", "Partido do Futuro Azul");
        System.out.println(pfa == outroPfa);       // compara identidade
        System.out.println(pfa.equals(outroPfa));  // compara igualdade

        Set<Partido> partidos = new HashSet<>(List.of(pfa, outroPfa));
        System.out.println(partidos.size());

        try {
            new Candidato("27999", "Fulano", pfa);
        } catch (IllegalArgumentException e) {
            System.out.println("Recusado: " + e.getMessage());
        }
    }
}
