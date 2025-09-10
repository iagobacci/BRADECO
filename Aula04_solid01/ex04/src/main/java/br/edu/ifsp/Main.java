package br.edu.ifsp;

import java.util.Arrays;
import java.util.List;

public class Main {
    // O método agora aceita uma lista de formas E uma estratégia de desenho.
    public static void drawAllShapes(List<Shape> shapes, ShapeDrawStrategy strategy) {
        strategy.drawShapes(shapes);
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Triangle(), new Circle(), new Square());
        
        System.out.println("--- Desenhando com a estratégia de ordem específica ---");
        ShapeDrawStrategy specificStrategy = new SpecificOrderDrawStrategy();
        drawAllShapes(shapes, specificStrategy);
    }
    
    /*
    Resposta ao Exercício 4:
     
    A) É possível adicionar ordem ao código do exercício anterior sem alterar o código-fonte pré-existente?
     
        Sim, é totalmente possível! Não precisamos mexer no código que já funciona. A ideia é adicionar uma nova camada que cuida da ordem de desenho, sem que o código principal precise saber de nada disso.
    B) Explique a sua solução que atende OCP
    
    A solução segue o Princípio do Aberto/Fechado porque a podemos adicionar quantas estratégias de ordem quisermos (aberto para extensão) sem precisar alterar o código do método drawAllShapes (fechado para modificação). Agora podemos trocar quando quisermos o comportamento de ordenação.
     */
}