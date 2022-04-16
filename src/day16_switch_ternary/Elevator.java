package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;

        if (floorNum == 1 ){
            System.out.println("Floor 1 selected.Companies : Lobby, Verizon");
        }else if (floorNum == 2){
            System.out.println("Floor 2 selected.Companies : NASA, Google");
        }else if(floorNum == 3){
            System.out.println("Floor 3 selected.Companies : Lyft, BofA");
        }else{
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("****SWITCH STATEMENT*******");

        floorNum =1;
        switch(floorNum){
            case 1:
                System.out.println("Floor 1 selected.Companies : Lobby, Verizon");
                break;
            case 2:
                System.out.println("Floor 2 selected.Companies : NASA, Google");
                break;
            case 3:
                System.out.println("Floor 3 selected.Companies : Lyft, BofA");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }

    }
}
