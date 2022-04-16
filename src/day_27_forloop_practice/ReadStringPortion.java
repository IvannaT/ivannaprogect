package day_27_forloop_practice;

public class ReadStringPortion {
    public static void main(String[] args) {
        //using substring print 3 first letters
        String list = "cat,car,cat,red_car,black cat,java,selenium";
        for(int i = 0; i < list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car")) {
                System.out.println("cat or car found");
            }
                }
                for(int i = 0; i < list.length()-2; i++){
                    String part = list.substring(i,  i+3);
                    System.out.println("part " + part);
                    if(part.equals("cat") || part.equals("car")){
                        System.out.println("cat or car found");
                    }
                }
        }
        //System.out.println(list.substring(i ,i+3));
       // i++;
    }


