package day_35_void_method_param;

public class Counters {
    public static void main(String[] args) {
      countUntil(5);
      countUntil(8);
      int num = 999;
      countUntil(num);
      printAge(1988);
      int birthYear = 2001;
      printAge(birthYear);

      String word = "wooden spoon";
      countUntil(word.length());
    }
    public static void countUntil(int num){
        for (int i = 0; i <= num ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2022 - year;
            System.out.println("Birth year :" +year+". Age :" +age);

        }
    }

