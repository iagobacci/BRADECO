package br.edu.ifsp;

import java.util.ArrayList;
import java.util.List;

// Uma estratégia que desenha as formas em uma ordem predefinida.
public class SpecificOrderDrawStrategy implements ShapeDrawStrategy {

    // Define a ordem desejada das classes.
    private static final List<Class<? extends Shape>> DRAW_ORDER = List.of(
        Circle.class,
        Square.class,
        Triangle.class
    );

    @Override
    public void drawShapes(List<Shape> shapes) {
        // Cria uma lista para manter as formas na ordem correta.
        List<Shape> orderedShapes = new ArrayList<>();
        
        // Percorre a ordem de desenho desejada
        for (Class<? extends Shape> shapeClass : DRAW_ORDER) {
            // Adiciona todas as formas do tipo atual à lista ordenada
            for (Shape shape : shapes) {
                if (shapeClass.isInstance(shape)) {
                    orderedShapes.add(shape);
                }
            }
        }
        
        // Desenha as formas na nova ordem.
        for (Shape s : orderedShapes) {
            s.draw();
        }
    }
}