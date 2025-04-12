/*
  By Sósthenes Oliveira Lima
  Palmas-To 2025
 */

package br.com.lima.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos) {

}
