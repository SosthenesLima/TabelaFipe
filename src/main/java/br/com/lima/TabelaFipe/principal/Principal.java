/*
 Autor: By Sósthenes Oliveira Lima
 Palmas-TO, 09 de Dezembro de 2024
 */
package br.com.lima.TabelaFipe.principal;

import br.com.lima.TabelaFipe.model.Dados;
import br.com.lima.TabelaFipe.service.ConsumoApi;
import br.com.lima.TabelaFipe.service.ConverteDados;

import java.awt.*;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    private  Scanner leitura = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu() {
        var menu = """
                
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar: 
                
                
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);

        System.out.println(json);
        var marcas = conversor.obterLista(json, Dados.class);
        marcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

    }
}
