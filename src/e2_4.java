import java.util.Scanner;

class Student {

    private static int count;/*** 班级号*/
    private String classNo;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private char sex;
    /**
     * 姓名
     */
    private String name;
    /**
     * 学号
     */
    private String stuNo;

    public Student(String stuNo, String classNo, String name, char sex, int age) {

        this.age = age;
        this.classNo = classNo;
        this.name = name;
        this.sex = sex;
        this.stuNo = stuNo;
        count++;
    }

    public static int getExsitingStudentCount() {
        return count;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return F为男,M为女
     */
    public String getSexString() {
        return sex == 'F' ? "男" : "女";
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String prop(String name, Object value, char sep) {
        return sep + name + ":" + value;
    }

    public String toString() {
        String desc = prop("学号", stuNo, '\0');
        desc += prop("班号", classNo, ',');
        desc += prop("姓名", name, ',');
        desc += prop("性别", getSexString(), ',');
        desc += prop("年龄", age, ',');
        return desc;
    }
}
class CollegeStudent extends Student{
    private String profession;
    public CollegeStudent(String stuNo, String classNo, String name, char sex, int age,String profession){
        super(stuNo, classNo, name,sex, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        String desc = prop("专业",profession,',');
        return super.toString()+ desc;
    }
}
public class e2_4 {
    public static void main(String[] args) {
        Student s1 = new Student("11111", "1", "Tom", 'F', 20);
        Student s2 = new Student("22222", "1", "Mary", 'M', 20);
        Student s3 = new CollegeStudent("33333", "1", "Tm", 'F', 10,"电光");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Scanner s = new Scanner(System.in);
        System.out.println("修改第一位学生的姓名与年龄（回车结束修改）：");
        String str1 = s.next();
        int a = s.nextInt();
        s1.setName(str1);
        s1.setAge(a);
        System.out.println("修改完成！");
        System.out.println("修改第二位学生的姓名与年龄（回车结束修改）：");
        String str2 = s.next();
        int b = s.nextInt();
        s2.setName(str2);
        s2.setAge(b);
        System.out.println("修改完成！");

        printlnSeparator();


        System.out.println("修改后信息：");
        println("姓名", s1.getName());
        println("年龄", s1.getAge());
        println("姓名", s2.getName());
        println("年龄", s2.getAge());

        printlnSeparator();

        System.out.println("年龄较大的是：");

        if (s1.getAge() > s2.getAge()) {
            System.out.println(s1);
        } else
            System.out.println(s2);
    }
    private static void printlnSeparator(){
        System.out.println("=============================");
    }

    public static void println(String prop, Object value) {
        System.out.println(prop + "：" + value);
    }
}