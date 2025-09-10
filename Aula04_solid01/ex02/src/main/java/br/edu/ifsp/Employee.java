package br.edu.ifsp;

// A classe Employee agora tem APENAS sua responsabilidade de negócio.
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Método de negócio
    public double calculatePay() {
        System.out.println("Calculando pagamento para " + name + "...");
        return salary * 1.1; // Exemplo de regra de negócio
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}