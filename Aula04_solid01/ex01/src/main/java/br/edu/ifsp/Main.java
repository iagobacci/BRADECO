package br.edu.ifsp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executando a refatoração do Modem...");

        MyModem modem = new MyModem();

        // Usando as funcionalidades de Gerenciamento de Conexão
        System.out.println("\nTestando o ConnectionManager:");
        modem.dial("1234-5678");
        modem.hangup();

        // Usando as funcionalidades de Comunicação de Dados
        System.out.println("\nTestando o DataCommunicator:");
        modem.send('X');
        char receivedData = modem.recv();
        System.out.println("Dados recebidos: " + receivedData);
    }
}