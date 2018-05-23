interface Person1{
    public abstract int pay1();

}
class Assistant1 implements Person1{
    int lessons1;
    public Assistant1(int lessons1){
        this.lessons1 = lessons1;
    }
    public int pay1(){
        return 800+25*lessons1;
    }
}
class Instructor1 implements Person1{
    int lessons1;
    public Instructor1(int lessons1){
        this.lessons1 = lessons1;
    }
    public int pay1(){
        return 1000+35*lessons1;
    }
}
class AssistantProfessor1 implements Person1{
    int lessons1;
    public AssistantProfessor1(int lessons1){
        this.lessons1 = lessons1;
    }
    public int pay1(){
        return 1200+40*lessons1;
    }
}
class Professor1 implements Person1{
    int lessons1;
    public Professor1(int lessons1){
        this.lessons1 = lessons1;
    }
    public int pay1(){
        return 1400+50*lessons1;
    }
}
public class e3_2_2{
    public static void main(String[] args){
        Assistant1 a = new Assistant1(5);
        Instructor1 b = new Instructor1(5);
        AssistantProfessor1 c = new AssistantProfessor1(5);
        Professor1 d = new Professor1(5);
        System.out.println("a's income is "+a.pay1());
        System.out.println("b's income is "+b.pay1());
        System.out.println("c's income is "+c.pay1());
        System.out.println("d's income is "+d.pay1());
    }
}
