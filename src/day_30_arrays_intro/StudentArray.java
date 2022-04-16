package day_30_arrays_intro;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
                              //0        1        2       3          4
        String[] student1 = {"ID1234","Ivanna","Tsetnar","b-26","425-300-72-70"};
        String[] student2 = {"Id234","OLeg","Tsetnar","b-24","314-662=4773"};
        System.out.println("student data length: " + student1.length);
        if(student1.length == 5 ){
            System.out.println("Pass :data arrays has correct length");
        }else{
            System.out.println("Fail: data arrays has incorrect length");
        }
        if(student1.length == student2.length){
            System.out.println("Pass :data arrays has correct length");
        }else {
            System.out.println("Fail: data arrays has incorrect length");
        }
        System.out.println(student1[1].toUpperCase(Locale.ROOT)+" "+student1[2].toUpperCase(Locale.ROOT));
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("425"));

    }
}
