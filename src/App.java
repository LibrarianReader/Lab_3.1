import javax.swing.*;

public class App {
    public static void main(String[] args) {
        EmploeeAddForm emploeeAddForm = new EmploeeAddForm();
        JFrame frame = new JFrame("EmploeeFormTest");
        frame.setContentPane(emploeeAddForm.getEmploeeAddPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
