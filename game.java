import java.util.Random;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class game{
    public static void main(String[] args) {

        guess();
    }
    public static void guess() {
        Random rand = new Random();
        int answer = rand.nextInt(0,100);
        boolean correct = false;
        int count = 0; //Keeps track of guess
        while (correct != true){ //Game loop 
            String numb = JOptionPane.showInputDialog("Guess a number between 0 and 100");
            int input = Integer.valueOf(numb);
            if (input == answer){ //If answer is correct
                correct = true;
            }else if (input < answer){ //If answer is too low
                JOptionPane.showMessageDialog(null, numb + " is incorrect and is too low");
                count++;
            }else if (input > answer){ //If answer is too high
             JOptionPane.showMessageDialog(null, numb + " is incorrect and is too high");
                count++;
            } 
         }
        JOptionPane.showMessageDialog(null, "CONGRATS! " + answer + " is correct. Guesses: " + count++);
    }
        
    
}