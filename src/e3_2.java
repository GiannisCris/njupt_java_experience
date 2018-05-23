abstract class Person{
    public int basicincome,lessons,lessonsincome;
    public Person(int lessons){
        this.lessons = lessons;
    }
    abstract int pay();
}
class Assistant extends Person{
    public Assistant(int lessons){
        super(lessons);
        basicincome = 800;
        lessonsincome = 25;
    }
    public int pay(){
        return(basicincome+lessons*lessonsincome);
    }
}
class Instructor extends Person{
    public Instructor(int lessons){
        super(lessons);
        basicincome = 1000;
        lessonsincome = 35;
    }
    public int pay(){
        return(basicincome+lessons*lessonsincome);
    }
}

class AssistantProfessor extends Person{
    public AssistantProfessor(int lessons){
        super(lessons);
        basicincome = 1200;
        lessonsincome = 40;
    }
    public int pay(){
        return(basicincome+lessons*lessonsincome);
    }
}
class Professor extends Person{
    public Professor(int lessons){
        super(lessons);
        basicincome = 1400;
        lessonsincome = 50;
    }
    public int pay(){
        return(basicincome+lessons*lessonsincome);
    }
}
public class e3_2 {
    public static void main(String[] args){
    Assistant a = new Assistant(5);
    Instructor b = new Instructor(5);
    AssistantProfessor c = new AssistantProfessor(5);
    Professor d = new Professor(5);
    System.out.println("a's income is "+a.pay());
    System.out.println("b's income is "+b.pay());
    System.out.println("c's income is "+c.pay());
    System.out.println("d's income is "+d.pay());
    }
}

