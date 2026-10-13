package br.unijorge.letramento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal do Cidadania em Rede.
 *
 * Fica no pacote raiz de propósito: o Spring procura componentes (telas,
 * serviços) neste pacote e em todos os subpacotes. Não mova este arquivo.
 */
@SpringBootApplication
public class LetramentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LetramentoApplication.class, args);
    }
}
