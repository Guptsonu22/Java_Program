package methods;

public class LearnMethods {
    public static void main(String[] args) {

//        for (String arg: args){
//            System.out.println(arg);
//        }

//        System.out.println(1);
//        System.out.println(2);
//         greet ();
//        System.out.println(3);
//        System.out.println(4);


        int averageFromFunction = average(4,6,  false);
//        System.out.println(avg);
        int doubleofAvg = averageFromFunction *2;
        System.out.println("hello");
        System.out.println(doubleofAvg);
//        System.out.println(averageFromFunction);
//        average(2 ,7,  true);
    }

    static void greet () {
        System.out.println(5);
        System.out.println("Hello World");
        System.out.println(6);

    }

    public static int  average (int a, int b,  boolean shouldAverage){
        if(shouldAverage == false) {
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("returning the avg");
        return avg;
//        System.out.println("The average is " +avg);
    }

    static int minimum(int a, int b){
//        if(a < b) return a;
        return a<b ? a:b;
    }

}
