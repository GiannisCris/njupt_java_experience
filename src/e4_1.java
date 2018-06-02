import javax.swing.*;
import java.awt.*;

public class e4_1 {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(e4_1::caculateGUI);
    }
    private static void caculateGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setTitle("caculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("caculator");
        frame.setLayout(new GridLayout(5,2));

        //add menubar
        JMenuBar jMenuBar = new JMenuBar();
        JMenu operationMenu = new JMenu("operation");
        JMenu helpMenu = new JMenu("help");
        jMenuBar.add(operationMenu);
        jMenuBar.add(helpMenu);

        //add exit actionlistener
        JMenuItem operationExitMI = new JMenuItem("Exit");
        operationMenu.add(operationExitMI);
        operationExitMI.addActionListener(e -> System.exit(0));

        // add information actionlistener
        JMenuItem helpInformationMI = new JMenuItem("Information");
        helpMenu.add(helpInformationMI);
        helpInformationMI.addActionListener(e -> JOptionPane.showOptionDialog(null,
                  "program name:  caculator \n"
                         + "information :  trash\n"
                        + " created by  :  ChrisTree\n"
                          +"\n"
                        +"fuck the world\n"+"i love zhangyan forever\n",
                "caculator information", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, null, null));

        //set menubar
        frame.setJMenuBar(jMenuBar);
        frame.setSize(200, 100);
        frame.setVisible(true);


        //add label
        frame.add(new JLabel("1st num"));
        frame.add(new JLabel("2nd num"));

        //creat and add textfield
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        frame.add(textField1);
        frame.add(textField2);


        //add result_label and result_textarea
        frame.add(new JLabel("result"));
        JTextArea jTextArea = new JTextArea();
        frame.add(jTextArea);


        //creat buttons
        JButton jButton1 = new JButton("+");
        JButton jButton2 = new JButton("-");
        JButton jButton3 = new JButton("*");
        JButton jButton4 = new JButton("/");


        //buttonActions
        frame.add(jButton1);
        jButton1.addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            jTextArea.setText(Integer.toString(a+b));
        });

        frame.add(jButton2);
        jButton2.addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            jTextArea.setText(Integer.toString(a-b));
        });

        frame.add(jButton3);
        jButton3.addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            jTextArea.setText(Integer.toString(a*b));
        });

        frame.add(jButton4);
        jButton4.addActionListener(e -> {
            double a = Double.parseDouble(textField1.getText());
            double b = Double.parseDouble(textField2.getText());
            jTextArea.setText(Double.toString(a/b));
        });

        int frameWidth = 400;
        int frameHeight = 800;
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds((int)screenSize.getWidth() - frameWidth,0,frameWidth,frameHeight);
        frame.setVisible(true);

    }

}

