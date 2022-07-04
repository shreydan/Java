import java.awt.*;
import java.awt.event.*;

public class NumToText extends Frame implements ActionListener {

    int width = 800;
    int height = 400;

    private Label infoLabel;
    private Label outputLabel;

    private TextField numField;
    private Button convertBtn;

    private String[] numArray = {
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };

    public NumToText() {

        infoLabel = new Label("enter digit 0-9", 1);
        infoLabel.setBounds(
            0,
            height/2 - 35,
            width,
            50
        );
        infoLabel.setFont(new Font("SansSerif", Font.PLAIN, 48));

        convertBtn = new Button("Convert");
        convertBtn.setBounds(
            300,
            200 + 35,
            200,
            50
        );
        convertBtn.setFont(new Font("SansSerif", Font.PLAIN, 24));


        numField = new TextField(1);
        numField.setBounds(
            180,
            200 + 35,
            100,
            50
        );
        numField.setFont(new Font("SansSerif", Font.PLAIN, 48));

        outputLabel = new Label();
        outputLabel.setBounds(
            520,
            200 + 35,
            200,
            50
        );
        outputLabel.setFont(new Font("SansSerif", Font.PLAIN, 48));

        add(infoLabel);
        add(numField);
        add(convertBtn);
        add(outputLabel);

        convertBtn.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
        });    

        setSize(width,height);
        setTitle("number to text");
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        
        String val = numField.getText();
        int digit;
        try {
            digit = Integer.parseInt(String.valueOf(val.charAt(0)));
            outputLabel.setText(numArray[digit]);
        }
        catch(Exception ex) {
            outputLabel.setText("invalid");
        }
    }

    public static void main(String ar[]) {
        NumToText obj = new NumToText();
    }
}