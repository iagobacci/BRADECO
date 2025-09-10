package br.edu.ifsp;

import br.edu.ifsp.persistence.DataStorage;
import br.edu.ifsp.persistence.DatabaseConnection;

// O Facade, que fornece uma interface simples para o subsistema de persistência.
public class EmployeePersistenceFacade {
    private DatabaseConnection dbConnection;
    private DataStorage dataStorage;

    public EmployeePersistenceFacade() {
        this.dbConnection = new DatabaseConnection();
        this.dataStorage = new DataStorage();
    }

    // A classe cliente usa este método simples, sem saber da complexidade interna.
    public void storeEmployee(Employee employee) {
        System.out.println("Fachada: Processo de persistência iniciado.");
        
        dbConnection.connect();
        dataStorage.save(employee);
        dbConnection.disconnect();
        
        System.out.println("Fachada: Processo de persistência concluído.");
    }
}