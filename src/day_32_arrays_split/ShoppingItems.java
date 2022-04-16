package day_32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        //                 0         1          2         3          4            5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "Iphone 13 case"};
        double[] prices = {99.9, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};
        System.out.println("----Find the index of Gloves in items array------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves find at index " + i);
                break;
                //System.out.println(i + " - " + items[i]);
            }
        }
        System.out.println("------Set boolean to true if first 'Ipad' is found-------");
        boolean ipadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("Ipad")) {
                ipadExists = true;
                break;
            }
        }
        System.out.println("ipadExists = " + ipadExists);
        if (ipadExists) {
            System.out.println("WE bought the Ipad");
        } else {
            System.out.println("We forgot the Ipad");
        }
        System.out.println("-----Print a report of each shopping item-----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] +" - $" +prices[i]+" - #" +itemIDS[i]);
          }
        System.out.println("---Loop for 'Jacket in items and all details------");
        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Jacket")) {
               // break;
                System.out.println(items[i] + "- $" + prices[i] + " - #" + itemIDS[i]);
                break;
            }
          }
        }
     }


