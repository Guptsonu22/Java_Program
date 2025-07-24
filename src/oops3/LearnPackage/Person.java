package oops3.LearnPackage;

public class Person {

     public static int count = 0;

     public  static final int  scientificName = "Home Sapiens";

     public Person(){
         count++;
     }

     private int age ;

    private String name;

    boolean cabBeChanged = false;

     public void setAge(int age) {
         if(cabBeChanged) {
             if(age > 0){
                 this.age = age;
             }
         }
     }

     boolean canBeAccessed = false;

     public int getAge(){
         if(canBeAccessed) return age;
         return age;
     }
}
