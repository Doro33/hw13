package Q2;
public class Main {

    public static void main(String[] args) {
        String[] names = {"Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen"};
        Q2 q2= new Q2();
        System.out.println("--- --- --- --- --- --- --- --- ---");
        System.out.println(q2.groupByNumberOfCharacters(names));
        System.out.println("--- --- --- --- --- --- --- --- ---");
        System.out.println(q2.groupByWithQuantity(names));
    }
}