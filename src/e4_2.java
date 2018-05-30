import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class e4_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                constructGUI();
            }
        });
    }

    private static void constructGUI() {

        //creat a frame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setTitle("caculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("caculator");
        frame.setLayout(new GridLayout(2,2));


        //add menubar
        JMenuBar jMenuBar = new JMenuBar();
        JMenu operationMenu = new JMenu("operation");
        JMenu helpMenu = new JMenu("help");
        jMenuBar.add(operationMenu);
        jMenuBar.add(helpMenu);

        //add exit actionlistener
        JMenuItem operationExitMI = new JMenuItem("Exit");
        operationMenu.add(operationExitMI);
        operationExitMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // add information actionlistener
        JMenuItem helpInformationMI = new JMenuItem("Information");
        helpMenu.add(helpInformationMI);
        helpInformationMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showOptionDialog(null,
                        "program name:  caculator \n"
                                + "information :  trash\n"
                                + " created by  :  ChrisTree\n"
                                +"\n"
                                +"fuck the world\n"+"i love zhangyan forever\n",
                        "caculator information", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, null, null);
            }
        });

        //set menubar
        frame.setJMenuBar(jMenuBar);
        frame.setSize(200, 100);
        frame.setVisible(true);

        //add txetfield
        JTextField jTextField1 = new JTextField();
        JTextField jTextField2 = new JTextField();
        frame.add(jTextField1);
        frame.add(jTextField2);

        //add a result textarea
        JTextArea jTextArea = new JTextArea();
        frame.add(jTextArea);


        //add abutton
        JButton jButton = new JButton("计算");
        frame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(jTextField1.getText());
                int b = Integer.parseInt(jTextField2.getText());
                jTextArea.append("a + b = " + String.valueOf(a + b)+"\n");
                jTextArea.append("a - b = " + String.valueOf(a - b)+"\n");
                jTextArea.append("a * b = " + String.valueOf(a * b)+"\n");
                jTextArea.append("a / b = " + String.valueOf(a / b)+"\n");

            }
        });
        int frameWidth = 400;
        int frameHeight = 400;
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds((int)screenSize.getWidth() - frameWidth,0,frameWidth,frameHeight);
        frame.setVisible(true);
    }
}
