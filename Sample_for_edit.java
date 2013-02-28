import javax.swing.*;

public class Sample_for_edit{

    public static void main( String[] args ) {

        String name;

        name = JOptionPane.showInputDialog(null, "What is your name?");

        JOptionPane.showMessageDialog(null, "Nice to meet you, " + name + ".");

        String sAge;

        sAge = JOptionPane.showInputDialog(null, "How old are you?");
        int iAge = Integer.parseInt(sAge);
        if (iAge < 21) {
        JOptionPane.showMessageDialog(null, "Sorry, no minors in the bar!");
        }
        else {
        JOptionPane.showMessageDialog(null, "Bottoms up!");
        }
    }
}
