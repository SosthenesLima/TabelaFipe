package br.com.lima.TabelaFipe.service;

public class ConverteDados implements IConverteDados {

    private ObjectMapper mapper = new ConverteDados();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        return null;
    }
}
