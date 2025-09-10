package br.edu.ifsp;

// Interface para Gerenciamento de Conexão
public interface ConnectionManager {
    void dial(String pno);
    void hangup();
}