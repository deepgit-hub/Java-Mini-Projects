import java.lang.System;
import java.util.Scanner;
class TrafficFineSystem
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int helmet_fine=0;
        int license_fine=0;
        int under_age=0;
        int helmet_fine_amount =0;
        int license_fine_amount =0;
        for (int i = 1;i<=10;i++)
        {
            System.out.println("Rider "+i);
            System.out.print("Enter your age : ");
            int age = scan.nextInt();
            if(age<18)
            {
                under_age+=1;
                System.out.println("You are not eligible!!!");
                continue;
            }
            System.out.print("Enter 1 if NOT wearing helmet, 0 if wearing: ");
            int helmet = scan.nextInt();
            if(helmet != 0 && helmet != 1)
            {
            System.out.println("Invalid input! Enter 0 or 1.");
            i--;
            continue;
            }
            else(helmet==1)
            {
                helmet_fine+=1;
                helmet_fine_amount+=1000;
            }
            System.out.print("Enter 0 if rider has license or 1 if rider didn't: ");
            int license = scan.nextInt();
            if(license==1)
            {
                license_fine+=1;
                license_fine_amount+=2500;
            }
        }
        int total_fine = helmet_fine_amount + license_fine_amount;
        System.out.println("\n========= FINAL REPORT =========");
        System.out.println("UnderAge Riders are : " + under_age);
        System.out.println("Number of Fine for no Helmet  : " + helmet_fine);
        System.out.println("Number of Fine for no License : " + license_fine);
        System.out.println("Fine amount for no License    : " + license_fine_amount);
        System.out.println("Fine amount for no Helmet     : " + helmet_fine_amount);
        System.out.println("Total Fine Collected          : ₹"+ total_fine);

    }
}           
