import java.lang.System;
import java.util.Scanner;
class MovieTicketBookingSystem
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    String[] movies={"Leo","Dhurandhar","F1","Sirai","LIK","Vikram","Jailer"};
    int[] screen={1,2,2,3,3,3,3};
    int[] capacity={500,350,350,200,200,200,200};
    int[] price={250,200,200,180,180,180,180};
    String[][] timing={
        {"09.00 AM","14.00 PM","18.00 PM","22.00 PM"},
        {"14.15 PM","18.15 PM"},
        {"09.15 AM","22.15 PM"},
        {"09.30 AM"},
        {"18.30 PM"},
        {"14.30 PM"},
        {"22.30 PM"}};
    boolean running = true;
    System.out.println("-------------------------------------");
    System.out.println("<-----Welcome to Sakthi Cinemas----->");
    System.out.println("-------------------------------------");
        
    while(running)
    {
        System.out.println("============MOVIES RUNNING===========");
        for(int i=0;i<movies.length;i++)
        {
            System.out.println(i+1+" . "+movies[i]);
        }
        System.out.println("-------------------------------------");
        System.out.print("Enter Your Choice--->");
        int choice=scan.nextInt();
        if(choice>movies.length)
        {
        System.out.println("Choose your choice from (1-"+movies.length+")");
        continue;
        }
        int index = choice-1;    
        System.out.println("*************MOVIE DETAILS***********");
        System.out.println("Movie Name       : "+movies[index]);
        System.out.println("Ticket Price     : "+price[index]);
        System.out.println("Screen           : "+screen[index]);
        System.out.println("Seats Available  : "+capacity[index]);
        System.out.println("Show Timings");
        for(int i=0;i<timing[index].length;i++)
        {
            System.out.println(i+1+" . "+timing[index][i]);
        }
        System.out.print("Enter show : ");
        int select= scan.nextInt();
        String selectedshow = timing[index][select-1];
        System.out.print("Enter how many seats you want (enter '0' to go back): ");
        int seat = scan.nextInt();
        if(seat==0)
        {
            continue;
        }
        else if(seat>capacity[index])
        {
            System.out.print("Only availabe seats can be selected");
            continue;
        }
        int totalprice=seat * price[index];
        capacity[index]-=seat;
        
        System.out.println("Ticket Booked!!!");
        System.out.println("=============Booking Summary=========");
        System.out.println("Movie Name      : "+movies[index]);
        System.out.println("Total Price     : "+totalprice);
        System.out.println("Screen          : "+screen[index]);
        System.out.println("Show Timing     : "+selectedshow);
        System.out.println("=====================================");
        System.out.println("1.Book another movie");
        System.out.println("2.Exit");
        System.out.print("Enter Choice");
        int end=scan.nextInt();
        if(end==2)
        {
            running=false;
        }
    }
}}
