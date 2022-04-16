package day_41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayLIst {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add("lada");
        myCars.add(2,"yugo");

        System.out.println(myCars.toString());
        String allCarsInStr = myCars.toString();
        System.out.println("allCarsInStr ="+ allCarsInStr);

        //change index 0(toyota)  to lamborghini, replace
        myCars.set(0,"lamborghini");
        System.out.println("updated list (after set)  =" +myCars.toString());

        //change 4 to honda
        myCars.set(1,"honda");
        System.out.println("after set honda = " +myCars.toString());

        //find index number of ford
        System.out.println("index of ford = " +myCars.indexOf("ford"));

        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change mokvish to jiguli
        myCars.set(moskvichIndex,"jiguli");
        System.out.println("after set jiguli = "+ myCars);

        //replace ford with traban int fordINdex = myCars.indexOf("ford");
        myCars.set(myCars.indexOf("ford"),"trabant");
        System.out.println("after set to trabant" +myCars);
        //lada to buggati
        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
        }else{
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti= " +myCars);

       for(int i = 0; i < myCars.size(); i++){
           if(myCars.get(i).equals("lamborghini")){
             myCars.set(i,"prius");
           }else if(myCars.get(i).equals("toyota")){
               myCars.set(i,"lexus");
           }else if(myCars.get(i).equals("trabat")){
               myCars.set(i,"audi");
           }

       }
        System.out.println("after loop = " +myCars);









    }
}
