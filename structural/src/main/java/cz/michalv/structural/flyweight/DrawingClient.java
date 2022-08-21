package cz.michalv.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * In our example, the client code is not forced to create object using Flyweight factory, but we can force that to make sure client code uses flyweight pattern implementation but its a complete design decision for particular application.
 * Flyweight pattern introduces complexity and if number of shared objects are huge then there is a trade of between memory and time, so we need to use it judiciously based on our requirements.
 * Flyweight pattern implementation is not useful when the number of intrinsic properties of Object is huge, making implementation of Factory class complex.
 */
public class DrawingClient extends JFrame {

    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType[] shapes = { ShapeFactory.ShapeType.LINE, ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL };
    private static final Color[] colors = { Color.RED, Color.GREEN, Color.YELLOW };

    private final Random randomGen = new Random();

    public DrawingClient(int width, int height) {
        this.WIDTH=width;
        this.HEIGHT=height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(event -> {
            Graphics g = panel.getGraphics();
            for (int i = 0; i < 20; ++i) {
                Shape shape = ShapeFactory.getShape(getRandomShape());
                shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
                        getRandomHeight(), getRandomColor());
            }
        });
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[randomGen.nextInt(3)];
    }

    private int getRandomX() {
        return randomGen.nextInt() * WIDTH;
    }

    private int getRandomY() {
        return randomGen.nextInt() * HEIGHT;
    }

    private int getRandomWidth() {
        return randomGen.nextInt() * (WIDTH / 10);
    }

    private int getRandomHeight() {
        return randomGen.nextInt() * (HEIGHT / 10);
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        DrawingClient drawing = new DrawingClient(500,600);
    }
}
