import java.util.Scanner;

//import javax.swing.DefaultRowSorter;

public class Discount_installment {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double interest,years,duration_months,face_value,total_interest,customer_money,monthly_payment,compound_interest;
        double main_interest,monthly,customerMoney;
        int determine;
        
        
        while(true){

            System.out.print("        welcome....... \n to continue press 1 or 2 to quit\n>> ");
            determine = sc.nextInt();

            if (determine ==2){
                System.out.println("You quit the program.");
                break;
            }


            else{
                System.out.print("How much do you need?\n >> ");
                face_value = sc.nextDouble();
                System.out.print("What's the interest rate.\n >> ");
                interest = sc.nextDouble();
                main_interest = interest/100;
                System.out.print("Enter the duration in months.\n>> ");
                duration_months = sc.nextDouble();
                years = duration_months/12; 

            //computation
            
                compound_interest = face_value * main_interest;
                total_interest = compound_interest * years;
                customer_money = face_value - total_interest;
                monthly_payment = face_value/duration_months;
                monthly = Math.round(monthly_payment);
                customerMoney = Math.round(customer_money);

                System.out.println("Face value is $" + customerMoney);
                System.out.println("The amount to pay every month is $" + monthly);



           
            //System.out.println(face_falue);
            //System.out.println(interest);
            //System.out.println(duration_months);
            //System.out.println(years);

            }
            
        }
        

        
    }
}
