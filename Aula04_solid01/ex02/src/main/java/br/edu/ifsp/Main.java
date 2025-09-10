package br.edu.ifsp;

public class Main {
    public static void main(String[] args) {
        // Criando a classe de negócio
        Employee employee = new Employee("João", 5000.0);
        
        // Chamando a responsabilidade de negócio diretamente
        double pay = employee.calculatePay();
        System.out.println("Pagamento calculado: " + pay);
        
        System.out.println("\n--- Usando o Facade para persistir ---");
        
        // Criando o Facade
        EmployeePersistenceFacade facade = new EmployeePersistenceFacade();
        
        // Chamando a responsabilidade de persistência através do Facade
        facade.storeEmployee(employee);
    }
}