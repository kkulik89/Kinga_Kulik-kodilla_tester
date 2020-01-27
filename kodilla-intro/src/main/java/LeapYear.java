public class LeapYear {
    public static void main(String[] args) {
        leapYear(2027);
    }

    static void leapYear(int leapYear) {
        if (leapYear % 4 == 0 ) {
            System.out.println(" przestępny");
        } else if (leapYear % 100 == 0){
            System.out.println("Przestepny");
        } else  {
            System.out.println("Nie przestępny");
        }
    }
}