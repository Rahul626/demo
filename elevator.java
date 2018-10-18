
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Elevator extends Thread
{

    static int floor = 0, choice;

    public static void main(String args[]) throws NumberFormatException, IOException, InterruptedException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        floor = ((int) (Math.random() * 10 + 1));
        System.out.println("------------------Welcome To Elevator System---------------------------");
        do {
	        System.out.println("\nThe elevator is now on floor " +floor);
	        System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
	        choice = Integer.parseInt(br.readLine());
	
	        if(floor == choice)
	        {
	            System.out.println("Enter inside the elevator");
	        }
	
	        else if(floor > choice)
	        {
	            elevatorDown();
	        }
	
	        else if(floor < choice)
	        {
	            elevatorUp();
	        }
	
	        System.out.println("\nTo which floor would you want to go (0-10) where 0 = basement");
	        choice = Integer.parseInt(br.readLine());
	        if(floor==choice) {
	        	System.out.println("You are on That floor only");
	        }
	        else if(floor > choice)
	        {
	            elevatorDown();
	        }
	
	        else if(floor < choice)
	        {
	            elevatorUp();
	        }
        }while(true);

    }

    public static void elevatorUp() throws InterruptedException
    {
        System.out.println("The elevator is on it's way up...");

        for (; choice>=floor; floor++) {
        	Thread.sleep(200);
            System.out.print(floor);
            if(choice-1>=floor) {
	            Thread.sleep(200);
	            System.out.print(" ");
	            Thread.sleep(200);
	            System.out.print("-");
	            Thread.sleep(200);
	            System.out.print("-");
	            Thread.sleep(200);
	            System.out.print(">");
	            Thread.sleep(200);
	            System.out.print(" ");
            }
        }
        floor--;
        Thread.sleep(300);
        System.out.println("\n\nThe elevator has arrived");
        Thread.sleep(300);
    }

    public static void elevatorDown() throws InterruptedException
    {
        System.out.println("The elevator is on it's way down...");
        for (; choice<=floor; floor--) {
        	Thread.sleep(200);
            System.out.print(floor);
            if(choice+1<=floor) {
	            Thread.sleep(200);
	            System.out.print(" ");
	            Thread.sleep(200);
	            System.out.print("-");
	            Thread.sleep(200);
	            System.out.print("-");
	            Thread.sleep(200);
	            System.out.print(">");
	            Thread.sleep(200);
	            System.out.print(" ");
            }
        }
        floor++;
        Thread.sleep(300);
        System.out.println("\n\nThe elevator has arrived");
        Thread.sleep(300);
    }
	}