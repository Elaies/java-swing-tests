import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*; 

//import java.awt.Dimension;
//import java.awt.Toolkit;
//import javax.swing.JFrame;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;;
//import javax.swing.JOptionPane;
//import javax.swing.JButton;
//import javax.swing.JTextArea;
//import java.awt.Color;
//import javax.swing.BorderLayout;
//import javax.swing.BoxLayout;
//import javax.swing.JDialog;
//import javax.swing.JPanel;


public class SwingCardLayout extends JFrame
{
    private static final long serialVersionID = -8983853899359627026L;
    
    private Toolkit t;
    private int x = 0, y = 0, width = 800, height = 600;
    
    //Komponenten
    private JPanel  masterContainer;
    private JComboBox comboBox;
    
    
    private JPanel  container1;
    private JPanel  container2;
    private JPanel  container3;
    private JPanel  container4;
    
    private JButton  container1_button;
    private JTextField container2_textfield;
    private javax.swing.JToggleButton container3_toggle;
    private JTextArea container4_textarea;
    
    public SwingCardLayout()
    {
        t =Toolkit.getDefaultToolkit();
        
        Dimension d = t.getScreenSize();
        x = (int) ((d.getWidth() - width) / 2);
        y = (int) ((d.getHeight() - height) / 2);
        
        setTitle("Swing Test");
        setBounds(x, y, width, height);
        

    
        //Anwendung schließt,wenn Eigenschaft gesetzt
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        this.initComponents();
        this.initListeners();
        
        setVisible(true);
    }
    
    private void initListeners()
    {
        this.comboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.print("Item ist jz" + e.getItem().toString());
                    CardLayout cl = (CardLayout) masterContainer.getLayout();
                    cl.show(masterContainer, e.getItem().toString());
            }
        });
    }
    
    private void initComponents()
    {
        this.getContentPane().setLayout(new BorderLayout());
        
        this.masterContainer = new JPanel(new CardLayout());
        this.comboBox = new JComboBox(new String[]{"Container1", "Container2", "Container3", "Container4"});
        
        this.comboBox.setEditable(false);
        
        this.container1 = new JPanel();
        this.container2 = new JPanel();
        this.container3 = new JPanel();
        this.container4 = new JPanel();
        
        this.container1_button = new JButton("Test Button");
        this.container2_textfield = new JTextField("asd");
        this.container3_toggle = new JToggleButton("toggle me!");
        this.container4_textarea = new JTextArea();
        
        this.container1.add(this.container1_button);
        this.container2.add(this.container2_textfield);
        this.container3.add(this.container3_toggle);
        this.container4.add(this.container4_textarea);
        
        this.masterContainer.add(container1, "Container 1");
        this.masterContainer.add(container2, "Container 2");
        this.masterContainer.add(container3, "Container 3");
        this.masterContainer.add(container4, "Container 4");
        
        
        this.getContentPane().add(this.comboBox, BorderLayout.PAGE_START);
        this.getContentPane().add(this.masterContainer, BorderLayout.CENTER);
    }
    
    public static void main(String[] args)
    {
        new SwingCardLayout();
    }
}
