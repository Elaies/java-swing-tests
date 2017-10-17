import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

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

public class SwingMain extends javax.swing.JFrame
{
  private static final long serialVersionUID = -2479348283207711881L;
  
  private Toolkit t;
  private int x = 0, y = 0, width = 800, height = 600;
  
  
  //Komponenten
  private JMenuBar  menubar1;
  
  private JMenu  menubar1_menu1;
  private JMenu  menubar1_menu2;
  private JMenu  menubar1_menu3;
  
  private JMenuItem menubar1_menu1_menuitem1;
  private JMenuItem menubar1_menu1_menuitem2;
  private JMenuItem menubar1_menu1_menuitem3;
  
  private JMenuItem menubar1_menu2_menuitem1;
  private JMenuItem menubar1_menu2_menuitem2;
  private JMenuItem menubar1_menu2_menuitem3;
  
  private JMenuItem menubar1_menu3_menuitem1;
  private JMenuItem menubar1_menu3_menuitem2;
  private JMenuItem menubar1_menu3_menuitem3;
  
  private JButton  testButton;
  private JTextArea testTextArea;
  private JPanel  container;
  private JButton container_button1;
  private JButton container_button2;
  private JButton container_button3;
    
    public SwingMain()
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
    
    private void initComponents() 
    {
      this.getContentPane().setLayout(new BorderLayout(5, 5));
      
      //container
      this.container = new JPanel();
      BoxLayout box = new BoxLayout(this.container, BoxLayout.Y_AXIS);
      
      
      this.container_button1 = new JButton("Button 1");
      this.container_button2 = new JButton("Button 2");
      this.container_button3 = new JButton("Button 3");
      
      //JMenu inkl. Menus & MenuItems
      this.menubar1 = new JMenuBar();
      
      this.menubar1_menu1 = new JMenu("Menu 1");
      this.menubar1_menu2 = new JMenu("Menu 2");
      this.menubar1_menu3 = new JMenu("Menu 3");
      
      this.menubar1_menu1_menuitem1 = new JMenuItem("JMenuItem 1/1");
      this.menubar1_menu1_menuitem2 = new JMenuItem("JMenuItem 1/2");
      this.menubar1_menu1_menuitem3 = new JMenuItem("JMenuItem 1/3");
      
      this.menubar1_menu2_menuitem1 = new JMenuItem("JMenuItem 2/1");
      this.menubar1_menu2_menuitem2 = new JMenuItem("JMenuItem 2/2");
      this.menubar1_menu2_menuitem3 = new JMenuItem("JMenuItem 2/3");
      
      this.menubar1_menu3_menuitem1 = new JMenuItem("JMenuItem 3/1");
      this.menubar1_menu3_menuitem2 = new JMenuItem("JMenuItem 3/2");
      this.menubar1_menu3_menuitem3 = new JMenuItem("JMenuItem 3/3");
      
      this.menubar1_menu1.add(this.menubar1_menu1_menuitem1);
      this.menubar1_menu1.add(this.menubar1_menu1_menuitem2);
      this.menubar1_menu1.add(this.menubar1_menu1_menuitem3);
      
      this.menubar1_menu2.add(this.menubar1_menu2_menuitem1);
      this.menubar1_menu2.add(this.menubar1_menu2_menuitem2);
      this.menubar1_menu2.add(this.menubar1_menu2_menuitem3);
      
      this.menubar1_menu3.add(this.menubar1_menu3_menuitem1);
      this.menubar1_menu3.add(this.menubar1_menu3_menuitem2);
      this.menubar1_menu3.add(this.menubar1_menu3_menuitem3);
      
      this.menubar1.add(this.menubar1_menu1);
      this.menubar1.add(this.menubar1_menu2);
      this.menubar1.add(this.menubar1_menu3);
      
      this.setJMenuBar(this.menubar1);
      //Test Button
      this.testButton = new JButton("Test");
      this.testButton.setBounds(10, 10, 100, 20);
      
      this.getContentPane().add(this.testButton, BorderLayout.PAGE_START);
      
      //Test TExtArea
      this.testTextArea = new JTextArea();
      this.testTextArea.setBounds(100, 100, 200, 300);
      this.testTextArea.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
      
      this.getContentPane().add(this.testTextArea, BorderLayout.CENTER);
      
      this.container.add(this.container_button1);
      this.container.add(this.container_button2);
      this.container.add(this.container_button3);
      
      this.getContentPane().add(this.container, BorderLayout.LINE_END);
    }
    
    private void initListeners()
    {
        this.menubar1_menu1_menuitem1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Hallo Welt :)");
            }
        } );
    }
    
    public static void main(String[] args)
    {
        new SwingMain();
    }
}
