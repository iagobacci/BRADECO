package br.edu.ifsp;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void drawAllShapes(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(); // O método draw() apropriado é chamado automaticamente
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        drawAllShapes(shapes);
    }
    
    /*
    Resposta ao Exercício 3:

    1. Por que agora conseguimos adicionar o Triangle sem modificar a main?
        Porque o código agora usa um contrato, a interface Shape. O método main não se importa mais se é um Círculo, Quadrado ou Triângulo; ele só sabe que cada objeto precisa ter um método para se desenhar (draw()).
     
      2. Como isso se relaciona com o princípio Aberto/Fechado?
        O princípio diz que o seu código deve ser aberto para extensão, mas fechado para modificação.
        Aberto para extensão: Você pode criar novas formas à vontade (como um Triângulo), estendendo o projeto sem quebrar nada do que já está funcionando.
        Fechado para modificação: Você não precisa tocar no código da main para adicionar novas formas. O código dela já está pronto.
        
     */
}