package day_30_arrays_intro;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 34, 554, 566, 77, 7777, 799, 55, 3,6787};
      for (int eachNum : data) {
          System.out.print(eachNum);
        }
        System.out.println();
      for(int n : data){
          System.out.print(n + " ");
        }
        System.out.println();

      for(int i  = 0; i < data.length; i++ ){
          System.out.println(data[i]);
      }
        System.out.println("last value : " +data[data.length-1]);
      for (int index = data.length -1; index >= 0; index-- ){
          System.out.print(data[index] + " ");
      }
    }
}