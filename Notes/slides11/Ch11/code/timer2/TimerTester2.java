import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
   This program uses a timer to move a rectangle once per second.
*/
public class TimerTester2
{
   public static void main(String[] args)
   {
      final Rectangle box = new Rectangle(5, 10, 20, 30);

      class Mover implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            box.translate(1, 1);
            System.out.println(box);
         }
      }

      ActionListener listener = new Mover();

      final int DELAY = 100; // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, listener);
      t.start();

      JOptionPane.showMessageDialog(null, "Quit?");
      System.out.println("Last box position: " + box);
      System.exit(0);
   }
}
