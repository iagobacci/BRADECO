package br.edu.ifsp;

// Agora, Circle implementa a interface Shape.
public class Circle implements Shape {
    private ShapeType type = ShapeType.CIRCLE;

    @Override
    public void draw() {
        System.out.println("Desenha um círculo.");
    }

    public ShapeType getType() {
        return type;
    }
}