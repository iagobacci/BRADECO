class ModemImpl implements Connection, DataCommunication {
    @Override
    public void dial(String phoneNumber) {
        // lógica para discar
    }

    @Override
    public void hangup() {
        // lógica para encerrar chamada
    }

    @Override
    public void send(char c) {
        // lógica para enviar dado
    }

    @Override
    public char recv() {
        // lógica para receber dado
        return 'a'; // Exemplo
    }
}
/*Se a lógica de comunicação mudar, não preciso mexer na parte de conexão, e vice-versa. Também podemos testar cada parte separadamente, além de que, caso algum sistema só precise se comunicar por dados, é possivel implementar apenas uma interface, e não todas juntas. */