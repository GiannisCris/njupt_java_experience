
import javax.swing.JFrame;
public class WelcomeFrameTest {
    public static void main(String[] args){
        ////创建WelcomeFrameDemo类的对象，名为demo
        WelcomeFrameDemo demo=new WelcomeFrameDemo();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setSize(600,300);
        demo.setVisible(true);
    }
}