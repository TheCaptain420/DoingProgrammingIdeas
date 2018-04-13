import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingAnimation extends JPanel implements ActionListener {

    //Timer er lig med Sleep bare for JPanel
    Timer tm = new Timer(10,this); // this er ligemed Actionlistener op linje 6;D
    //x = hvor den starter, vel er hvor hurtigt den kører.
    int x =0 , velx=2;



    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillRect(x,x,30,30);

        tm.start();//Starter timer

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x<0||x>570){
            velx = -velx;
        }
        x=x+velx;



        //går op og repainter rect hver 5 ms.
        repaint();
    }

    public static void main(String[] args) {
        MovingAnimation t = new MovingAnimation();

        JFrame jf = new JFrame();
        jf.setTitle("Hello");
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(t);


    }
}
