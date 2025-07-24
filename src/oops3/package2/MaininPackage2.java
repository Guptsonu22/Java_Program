package oops3.package2;

import oops3.LearnPackage.Teacher;

public class MaininPackage2 extends Teacher {

    public static void main(String[] args) {
        Teacher obj = new Teacher();
//        obj.id = 123;
        obj.teachingClass = 4;
//        obj.degree = "PHD";

         MaininPackage2 maininPackage2 = new MaininPackage2();
        maininPackage2.studentsCount = 100;  // ✅ will now work

    }
}
