package oops4;

public class LearnAnonymousClass {

    public static void main(String[] args) {

        //  Anonymous class from abstract class or normal class
        OuterClass obj = new OuterClass() {
            @Override
            public void outerMethod() {
                System.out.println("Outer method overridden anonymously");
            }

            void sing() {
                System.out.println("Singing method inside anonymous class");
            }
        };
        obj.outerMethod();


        // Anonymous class from interface
        SuperInterface obj2 = new SuperInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("Interface method implemented anonymously");
            }
        };
        obj2.interfaceMethod();

        //  Lambda for functional interface
        SuperInterface obj3 = () -> System.out.println("Using lambda for functional interface");
        obj3.interfaceMethod();

        // Lambda for walkAble
        walkAble walker = steps -> steps * 2;
        System.out.println("Walked steps: " + walker.walks(10));
    }
}

//  Define class properly
class OuterClass {
    public void outerMethod() {
        System.out.println("Original outer method");
    }
}

//  Functional Interface
@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}

//  Only one declaration needed
@FunctionalInterface
interface walkAble {
    int walks(int steps);
}
