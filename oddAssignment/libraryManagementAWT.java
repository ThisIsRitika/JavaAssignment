import java.awt.*;
import java.awt.event.*;

public class libraryManagementAWT extends Frame implements ActionListener {
    TextField bookNameField, authorField;
    Button addButton, clearButton;
    Label messageLabel;

    libraryManagementAWT() {
        setTitle("Library Management");

        Label bookLabel = new Label("Book Name:");
        bookNameField = new TextField(20);

        Label authorLabel = new Label("Author:");
        authorField = new TextField(20);

        addButton = new Button("Add Book");
        clearButton = new Button("Clear");
        messageLabel = new Label("");

        addButton.addActionListener(this);
        clearButton.addActionListener(this);

        setLayout(new GridLayout(5, 2, 10, 10));

        add(bookLabel);
        add(bookNameField);
        add(authorLabel);
        add(authorField);
        add(addButton);
        add(clearButton);
        add(messageLabel);

        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            messageLabel.setText("Book added: " + bookNameField.getText());
        } else if (e.getSource() == clearButton) {
            bookNameField.setText("");
            authorField.setText("");
            messageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new libraryManagementAWT();
    }
}
