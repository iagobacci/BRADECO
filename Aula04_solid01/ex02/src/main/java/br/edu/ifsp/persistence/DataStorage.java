package br.edu.ifsp.persistence;

// Outra parte do subsistema de persistência.
public class DataStorage {
    public void save(Object data) {
        System.out.println("  - Salvando dados: " + data.toString());
    }
}