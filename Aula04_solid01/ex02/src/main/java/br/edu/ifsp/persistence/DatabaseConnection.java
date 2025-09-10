package br.edu.ifsp.persistence;

// Uma parte do subsistema de persistência.
public class DatabaseConnection {
    public void connect() {
        System.out.println("  - Conectando ao banco de dados...");
    }

    public void disconnect() {
        System.out.println("  - Desconectando do banco de dados.");
    }
}