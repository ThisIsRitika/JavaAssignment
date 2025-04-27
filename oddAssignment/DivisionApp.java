import java.awt.*;
import java.awt.event.*;

public class DivisionApp extends Frame implements ActionListener {
    TextField num1Field, num2Field;
    Label resultLabel;
    Button divideButton;

    DivisionApp() {
        setTitle("Division App");

        num1Field = new TextField(10);
        num2Field = new TextField(10);
        divideButton = new Button("Divide");
        resultLabel = new Label("");

        setLayout(new FlowLayout());

        add(new Label("Number 1:"));
        add(num1Field);
        add(new Label("Number 2:"));
        add(num2Field);
        add(divideButton);
        add(resultLabel);

        divideButton.addActionListener(this);

        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 / num2;
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input!");
        } catch (ArithmeticException ex) {
            resultLabel.setText("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        new DivisionApp();
    }
}
