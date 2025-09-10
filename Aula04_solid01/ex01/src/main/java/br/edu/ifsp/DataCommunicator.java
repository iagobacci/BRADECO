package br.edu.ifsp;

// Interface para Comunicação de Dados
public interface DataCommunicator {
    void send(char c);
    char recv();
}