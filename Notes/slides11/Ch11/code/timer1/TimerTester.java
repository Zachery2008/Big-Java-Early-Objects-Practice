import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
   This program tests the Timer class.
*/
public class TimerTester
{
   public static void main(String[] args)
   {
      class CountDown implements ActionListener
      {
         public CountDown(int initialCount)
         {
            count = initialCount;
         }

         public void actionPerformed(ActionEvent event)
         {
            if (count >= 0)
               System.out.println(count);
            if (count == 0)
               System.out.println("Liftoff!");
            count--;
         }

         private int count;
      }

      CountDown listener = new CountDown(10);

      final int DELAY = 1000; // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, listener);
      t.start();

      JOptionPane.showMessageDialog(null, "Quit?");
      System.exit(0);
   }
}
