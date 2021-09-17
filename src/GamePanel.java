import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static int UNIT_SIZE = 25;

    GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        System.out.println("Repainted panel");
        g.setColor(Color.WHITE);
        for(int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) {
            g.drawLine(i*UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == '+') {
                if (UNIT_SIZE < SCREEN_HEIGHT) {
                    UNIT_SIZE += 5;
                    System.out.println("UNIT_SIZE is now " + UNIT_SIZE);
                }
            }

            if(e.getKeyChar() == '-') {
                if (UNIT_SIZE > 5 ) {
                    UNIT_SIZE -= 5;
                    System.out.println("UNIT_SIZE is now " + UNIT_SIZE);
                }
            }
            repaint();
        }
    }
}
