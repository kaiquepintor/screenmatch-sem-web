package br.com.alura.screenmatch.service;

import java.lang.reflect.Type;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
