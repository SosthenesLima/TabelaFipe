/*
  By Sósthenes Lima
  Goiânia-Go
  18/04/2025
  19/04/2025

 */

package br.com.lima.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculo(
        @JsonAlias("Valor") String valor,
        @JsonAlias("Marca") String marca,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("anoModelo") Integer ano,
        @JsonAlias("Combustivel") String tipoCombustivel
) {
}
