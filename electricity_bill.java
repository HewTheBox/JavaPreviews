import java.util.Scanner;


public class electricity_bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double amount,previous,current,halve;
        double two_percent = 0.02;
        halve = 0.5;
        double percent,bill;
        double compute_1,compute_2,first_halve,final_amount;
        
       
        System.out.println("Portal to calculate electricity bill.");
        System.out.print("What's your name?\n>> ");
        name = sc.nextLine();
       
        System.out.print("Enter your previous electricity bill\n>> ");
        previous = sc.nextDouble();
        
        System.out.print("Enter your current electricity bill\n>> ");
        current = sc.nextDouble();
        amount = (previous + current) * halve;
        
        System.out.println(amount);
      
                // DOMESTIC

        if (amount<=100){
            

            if (amount<=60){
                compute_1 = amount *0.3;
                percent = (compute_1 * two_percent) + compute_1;
                bill = previous + current;
           

                System.out.println("Customer name: "+ name);
                System.out.println("Quantity of electricity consumed: " + bill+ "kwh");
                System.out.println("Category: Domestic consumer");
                System.out.println("Total bill: $" + percent);
            }
            else if(amount >60){
                compute_1 = amount -60;
                first_halve = 60 * 0.3;
                compute_2 = compute_1 * 0.5;
                final_amount = first_halve + compute_2;
                percent = (compute_1 * two_percent)+ final_amount;
                bill = previous + current;
           
            
                System.out.println("Customer name: "+ name);
                System.out.println("Quantity of electricity consumed: " + bill+ "kwh");
                System.out.println("Category: Domestic consumer");
                System.out.println("Total bill: $" + percent);


            }

       }

             // INDUSTRIAL

       else if (amount>100 && amount<200){
         

            if (amount<=120){
                compute_1 = amount *0.5;
                percent = (compute_1 * two_percent) + compute_1;
                bill = previous + current;
            

                System.out.println("Customer name: "+ name);
                System.out.println("Quantity of electricity consumed: " + bill+ "kwh");
                System.out.println("Category: Industrial consumer");
                System.out.println("Total bill: $" + percent);
            }
            else if(amount >120){
                compute_1 = amount -120;
                first_halve = 120 * 0.5;
                compute_2 = compute_1 * 0.75;
                final_amount = first_halve + compute_2;
                percent = (final_amount * two_percent) + final_amount;
                bill = previous + current;
          

                System.out.println("Customer name: "+ name);
                System.out.println("Quantity of electricity consumed: " + bill+ "kwh");
                System.out.println("Category: Industrial consumer");
                System.out.println("Total bill: $" + percent);

     
            }

       }
      
            //COMMERCIAL

       else if (amount>200){

            if (amount<=201){
                compute_1 = amount *0.9;
                percent = (compute_1 *two_percent) + compute_1;
                bill = previous + current;

                System.out.println("Customer name: "+ name);
                System.out.println("Quantity of electricity consumed: " + bill+ "kwh");
                System.out.println("Category: Commercial consumer");
                System.out.println("Total bill: $" + percent);
            }
       
            else if(amount >201){
                compute_1 = amount -201;
                first_halve = 201 * 0.9;
                compute_2 = compute_1 * 1.5;
                final_amount = first_halve + compute_2;
                percent = (final_amount * two_percent) + final_amount;
                bill = previous+current;

           

                System.out.println("Customer name: "+ name);
                System.out.println("Quantity of electricity consumed: " + bill + "kwh");
                System.out.println("Category: Commercial consumer");
                System.out.println("Total bill: $" + percent);


            }
       }
    }
}