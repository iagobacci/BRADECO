package br.edu.ifsp;

// Implementação que usa as interfaces com responsabilidade única
public class MyModem implements ConnectionManager, DataCommunicator {
    @Override
    public void dial(String pno) {
        System.out.println("Discar para: " + pno);
    }

    @Override
    public void hangup() {
        System.out.println("Desligar a chamada.");
    }

    @Override
    public void send(char c) {
        System.out.println("Enviar dados: " + c);
    }

    @Override
    public char recv() {
        System.out.println("Receber dados.");
        return 'a'; // Exemplo de retorno
    }
}