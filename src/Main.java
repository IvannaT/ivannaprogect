import day_41_arraylist.ArrayAsList;

import java.util.*;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            List<Integer> numsOne = new ArrayList<>();
            numsOne.addAll(Arrays.asList(4,1,8,-42,2,10));
            List<Integer> numTwo = new ArrayList<>();

            for (int each: numsOne) {
                switch (each){
                    case 1:
                        numTwo.add(1);
                    case 5:
                        numTwo.add(50);
                        break;
                    case 4:
                        break;
                    case 8:
                        numTwo.remove(0);
                     break;
                    case 10:
                    case -42:
                        numTwo.add(1,0);
                        break;
                    case 55:
                        numTwo.add(105);
                        break;
                    case 2:
                        numTwo.add(20_000);
                        break;
                    default:
                        numTwo.add(null);
                }
            }
            System.out.println(numTwo);
        }
    }
