package day07_unary_operators_casting;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.021;
        double stateTax, federaTax,totalTax,salaryAfterTax;

        stateTax= salary * stateTaxRate;
        federaTax = salary * federalTaxRate;
        totalTax =  stateTax + federaTax;
        salaryAfterTax = salary - totalTax;
         String taxreport = "State tax rate :" + stateTaxRate + ", Federal tax Rate " +federalTaxRate + "salary : $" + salary + "\nTax amount: "+
                 stateTax+  " for state tax is " + federaTax + " for federal tax, coming to a total of "  + totalTax + "\nAfter tax your salary is " + salaryAfterTax;
        System.out.println(taxreport);
    }
}
