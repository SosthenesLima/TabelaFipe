/*
 By Sósthenes Oliveira Lima
 */
package br.com.lima.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);


}
