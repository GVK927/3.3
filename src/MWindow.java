import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MWindow extends JFrame {
    public MWindow(){
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setPreferredSize(new Dimension(800, 600));
        JPanel panel = new JPanel();
        getContentPane().add(new JPanel(){
            @Override
            protected void paintComponent (Graphics g) {
                super.paintComponent(g);
                for(int i = 0; i<=getWidth(); i+=50){
                    for(int j = 0; j<=getHeight(); j+=50){
                        try{
                            g.drawImage(ImageIO.read(new File("grass.png")), i, j, null);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        panel.setLayout(null);

        pack();
        setVisible(true);
    }
}
