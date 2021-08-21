import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
   This program tests random access. You can access existing
   accounts and deposit money, or create new accounts. The
   accounts are saved in a random access file.
*/
public class BankDataTester
{  
   public static void main(String[] args)
         throws IOException
   {  
      Scanner in = new Scanner(System.in);
      BankData data = new BankData();
      try
      {  
         data.open("bank.dat");

         boolean done = false;
         while (!done)
         {  
            System.out.print("Account number: ");
            int accountNumber = in.nextInt();
            System.out.print("Amount to deposit: ");
            double amount = in.nextDouble();

            int position = data.find(accountNumber);
            BankAccount account;
            if (position >= 0)
            {
               account = data.read(position);
               account.deposit(amount);
               System.out.println("new balance=" 
                     + account.getBalance());
            }
            else // Add account
            {  
               account = new BankAccount(accountNumber,
                     amount);
               position = data.size();
               System.out.println("adding new account");
            }
            data.write(position, account);

            System.out.print("Done? (Y/N) ");
            String input = in.next();
            if (input.equalsIgnoreCase("Y")) done = true;
         }      
      }
      finally
      {
         data.close();
      }
   }
}












