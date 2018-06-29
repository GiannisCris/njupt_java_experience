import java.awt.*;
import    javax.swing.*      ;//导入swing组件所在包中的所有类
public class WelcomeFrameDemo   extends JFrame     { //自定义一个窗体类
    private JLabel lblname;
    private JTextField tfname;
    private JButton btnOK;

    public WelcomeFrameDemo(){
        super  ("Welcome Frame"); //访问父类的构造方法
        setLayout(new FlowLayout());

        lblname = new JLabel("Please input your name:");
        lblname.setFont(new Font("Arial",Font.PLAIN,20));
        getContentPane().add(lblname); //添加组件lblname到内容面板中

        tfname = new JTextField(15);
        tfname.setFont(new Font("Arial",Font.PLAIN,20));
        getContentPane().add (tfname); //添加组件tfname到内容面板中

        btnOK = new JButton("OK");
        btnOK.setFont(new Font("Arial",Font.PLAIN,20));
        getContentPane().add  (btnOK); //添加组件btnOK到内容面板中,this,不写也可,上同
    }
}
