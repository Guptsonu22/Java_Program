package oops3.LearnPackage;

public class Teacher {
    public int studentsCount;

    public int teachingClass;

     private int  id;

     String degree;  // this is default or package-private

//    protected int studentsCount


    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }


}
