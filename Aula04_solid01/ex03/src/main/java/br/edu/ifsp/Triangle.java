package br.edu.ifsp;

// A nova classe Triangle também implementa a interface Shape.
public class Triangle implements Shape {
    private ShapeType type = ShapeType.SQUARE; // O ShapeType poderia ser expandido

    @Override
    public void draw() {
        System.out.println("Desenha um triângulo.");
    }

    public ShapeType getType() {
        return type;
    }
}