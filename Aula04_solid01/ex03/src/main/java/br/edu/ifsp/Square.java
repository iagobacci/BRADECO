package br.edu.ifsp;

// Square também implementa a interface Shape.
public class Square implements Shape {
    private ShapeType type = ShapeType.SQUARE;

    @Override
    public void draw() {
        System.out.println("Desenha um quadrado.");
    }

    public ShapeType getType() {
        return type;
    }
}