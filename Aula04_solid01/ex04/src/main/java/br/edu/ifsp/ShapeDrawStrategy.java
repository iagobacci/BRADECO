package br.edu.ifsp;

import java.util.List;

// Interface para a estratégia de ordenação.
// Permite que o método drawAllShapes receba diferentes comportamentos.
public interface ShapeDrawStrategy {
    void drawShapes(List<Shape> shapes);
}