public class LeapYear {
    public static void main(String[] args) {
        int yearName = 1600;

        System.out.println(yearName);

        if (yearName%4 != 0) {
            System.out.println("Podany rok nie jest rokiem przestępnym");
        } else if (yearName%100 != 0) {
            System.out.println("Podany rok jest rokiem przestępnym");
        } else if (yearName%400 != 0) {
            System.out.println("Podany rok nie jest rokiem przestępnym");
        } else {
            System.out.println("Podany rok jest rokiem przestępnym");
        }
    }
}
