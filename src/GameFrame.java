import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        // Fit snuggly to the components added to the frame
        this.pack();
        this.setVisible(true);
        // Open in center of computer
        this.setLocationRelativeTo(null);
    }
}
