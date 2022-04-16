package day14_multi_branch_if_statements;

public class YesOrNO_practice {
    public static void main(String[] args) {




        System.out.println("Are you sure you want to delete this class?");
        char selection = 'n';
        boolean answer;
        String result ;
        if(selection== 'y'){
            System.out.println("Your file will be deleted");
            answer = true;
            result ="deleted";
        }else{
            System.out.println("File deletion canceled");
            answer = false;
            result = "not deleted";

        }
        System.out.println("Did file get deleted ?- " + answer);
        System.out.println("Did file get deleted ?- " + result );
    }
}
