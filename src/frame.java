import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;

public class frame {
    private static int numclicks = 0;  //记录次数
    private static JFrame frame = new JFrame("统计点击按钮的次数");
    private static JButton button = new JButton();
    private static JLabel label = new JLabel();
    //生成显示点击次数的标签；JLable
    //生成按钮；JButton
    private static JPanel pane = new JPanel();  //容器

    public static void main(String[] args) {
        pane.setBorder(BorderFactory.createEmptyBorder(60,60,20,60));
        pane.setLayout(new GridLayout(0,1));  //设置布局
        pane.add(button);
        pane.add(label);
        frame.getContentPane().add(pane,BorderLayout.CENTER);
        //button.setMnemonic(KeyEvent.VK_I);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numclicks++;
                label.setText("按钮单击次数："+numclicks);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);//调用函数使JFrame可视；
    }
}
