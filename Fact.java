public class Fact {
    public static void main(String[] args) {
        long fact = 1;
        int i = 1;
        while (i<=10) {
            fact *= i;
            System.out.println("The Factorial Of" + i +" is" + fact);i++;
        }
    }
}
