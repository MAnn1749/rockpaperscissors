import java.util.Scanner;
public class rockgamenew{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double n = 0;
        int i = 0; //computer
        int j = 0; //person
        String value;
        boolean isRock =false, isPaper=false, isScissors=false;
        label:
        while(i<3 && j<3){
            n = Math.random();
            if (n<0.333333){
            value = "rock";
        } else if(n<0.666666){
            value = "paper";
        } else {
            value = "scissors";
        }
            System.out.println("Please select between rock, paper or scissors:");
            String choice = scn.nextLine().intern();
            System.out.println("Computer's choice: "+ value);
            if (value == choice){
                System.out.println("Computer: " + i + " you: "+ j);
                continue label;
            }
            switch(choice){    //choice is for person
                case "rock":
                isRock = true;
                break;
                case "paper":
                isPaper = true;
                break;
                case "scissors":
                isScissors = true;
                break;
                default:
                System.out.println("please select an appropriate response");
                continue label;
            }
            if(isRock == true && value == "scissors"){
                j = j +1;
            } else if(isPaper == true && value == "rock"){
                j = j + 1;
            } else if (isScissors == true && value == "paper"){
                j = j +1;
            
            } else {
                i = i+1;
            }
            System.out.println("Computer's score: " + i + " your score: "+ j);
            


    
        }
        if (i>j){
            System.out.println("Computer wins");
        } else{System.out.println ("You win"); }
        

    }
}