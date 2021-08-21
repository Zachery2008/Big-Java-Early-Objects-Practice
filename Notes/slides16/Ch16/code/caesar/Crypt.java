import java.io.IOException;

/**
   A program to run the Caesar cipher encryptor with
   command line arguments.
*/
public class Crypt
{  
   public static void main(String[] args)
   {  
      boolean decrypt = false;
      int key = DEFAULT_KEY;
      String inFile = null;
      String outFile = null;

      if (args.length < 2 || args.length > 4) usage();

      try
      {  
         for (int i = 0; i < args.length; i++)
         {  
            if (args[i].charAt(0) == '-')
            {  
               // It is a command line option
               char option = args[i].charAt(1);
               if (option == 'd')
                  decrypt = true;
               else if (option == 'k')
                  key = Integer.parseInt(args[i].substring(2));
            }
            else
            {  
               // It is a file name
               if (inFile == null)
                  inFile = args[i];
               else if (outFile == null)
                  outFile = args[i];
               else usage();
            }
         }
         if (decrypt) key = -key;
         Encryptor crypt = new Encryptor(key);
         crypt.encryptFile(inFile, outFile);
      }
      catch (IOException exception)
      {  
         System.out.println("Error processing file: " + exception);
      }
   }

   /**
      Prints a message describing proper usage and exits.
   */
   public static void usage()
   {  
      System.out.println
            ("Usage: java Crypt [-d] [-kn] infile outfile");
      System.exit(1);
   }

   public static final int DEFAULT_KEY = 3;
}
