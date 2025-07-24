package LeansString;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Sonu";
        String sameName = "sonu";
        String newName = new String("Sonu");

        System.out.println(name);
        System.out.println(newName);
//        System.out.println("Sonu Kumar");
//
//        if (name == sameName) {
//            System.out.println("Both are same");
//        }
//
//        if (name == newName) {
//            System.out.println("Both are same");
//        } else {
//            System.out.println("Both are  not same");
//        }

        if(name.equals(newName)) {
            System.out.println("name and newName have same values");
        }
    }

}