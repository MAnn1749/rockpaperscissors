import java.util.Scanner;
public class newrockgame{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = 0;
        int i=0, j = 0;//i is for person, j is for computer
        double rand = 0;
        String answer, choice;
        while (n<5 && i <3 && j < 3){
            rand = Math.random();
            if (rand<0.3333){
                answer = "rock";
            } else if(rand<0.6666){
                answer = "paper";
            } else {
                answer = "scissors";
            }
            System.out.println("Please enter your choice");
            choice = scn.nextLine().intern();
            System.out.println("Computer: " + answer);
            if(answer == choice){
                System.out.println("tie");
            } else if(answer == "rock"&& choice == "paper"){
                i = i + 1;
            } else if(answer == "paper" && choice == "scissors"){
                i = i + 1;
            } else if(answer == "scissors" && choice == "rock"){
                i = i + 1;
            } else {
                j = j + 1;
            }
            System.out.println("You: " + i + " Computer: "+ j);
        }
        if(i>j){
            System.out.println("U win!");
        } else{
            System.out.println("Computer wins!");
        }
    }
}