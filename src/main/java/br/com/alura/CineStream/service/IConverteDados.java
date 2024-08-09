package br.com.alura.CineStream.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
