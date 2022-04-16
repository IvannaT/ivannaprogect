package day15_logical_operotors_If_switch_ternary;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShiping = true;
        String itemName = "Wooden spoon";
        if (onSale && freeShiping) {
            System.out.println("Adding to cart " + itemName);
        }else{
            System.out.println("Continue shopping  for good deals on" + itemName);
        }
        if (freeShiping && freeShiping && itemName.equals("Wooden spoon") ) {
            System.out.println("Add to cart " + itemName);
            } else {
                System.out.println("Continue shopping  for good deals on");
            }

        }
    }
