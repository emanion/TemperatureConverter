
package temperatureconverter;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author emanion
 */
public class MainGui extends JFrame implements ActionListener {
    
    private JLabel lblPrompt, lblOutput;
    private JTextField txtInput;
    private JButton btnSubmit;
    private Container container;
    private JPanel panel;
    
    public MainGui(){
        lblPrompt = new JLabel("Fahreheit Temperature: ");
        lblOutput = new JLabel("XXXXXXX");
        txtInput = new JTextField
             ("            ");
        btnSubmit = new JButton("Convert to Celcius");
        btnSubmit.addActionListener(this);
        container = this.getContentPane();
        
        panel = new JPanel();
        panel.add(lblPrompt);
        panel.add(txtInput);
        container.add(panel, BorderLayout.NORTH);
        
        container.add(lblOutput, BorderLayout.CENTER);
        container.add(btnSubmit,BorderLayout.SOUTH);
        
        //this.add(container);   -don't need to do this
        // this object is a FRAME.
        
        // set size of window, and make visible
        this.setSize(300, 200);   //in pixels
        //will set visible outside of class.
        
        //tell it how to close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String inputString = txtInput.getText();
        double fahrenheit = Double.parseDouble(inputString);
        double celcius = (((fahrenheit - 32)*5)/9);
        
        //fahrenheit = Double.valueOf(inputString);
        lblOutput.setText(NumberFormat.getInstance().format(celcius));
        
    }
    
    
}
