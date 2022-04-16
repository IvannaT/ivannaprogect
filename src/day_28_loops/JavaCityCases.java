package day_28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for(int day = 1; day <= 30; day++){
            if (totalCases % 7 == 0) {//sundays more cases
                totalCases += 500;
            }else
            totalCases += 200;
            System.out.println("Day " + day+ " | total cases :  " + totalCases);
        }
        System.out.println("JavaCITY 11/21 total cases " + totalCases);
    }
}
