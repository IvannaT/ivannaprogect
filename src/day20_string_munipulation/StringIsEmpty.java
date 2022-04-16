package day20_string_munipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);
        if(jobTitle.isEmpty()){
            System.out.println("JobTitle is missing,please resend");
        }else {
            System.out.println("JobTitle looks good");
            {

            }
            if (jobTitle.length() == 0) {
                System.out.println("JobTitle is empty");
            } else {
                System.out.println("JobTitle is not empty");
            }
            System.out.println(jobTitle.equals(""));
            if("".equals(jobTitle)){
                System.out.println("JobTitle is empty");
            }else{
                System.out.println("JobTitle is not empty");

            }
            String veggie ="carrots";
            System.out.println(veggie.isEmpty());
            if(!veggie.isEmpty()){
                System.out.println("we have " + veggie);
            }
        }
    }

}
