import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
   This program demonstrates how to use a socket to communicate
   with a web server. Supply the name of the host and the
   resource on the command-line, for example
   java WebGet java.sun.com index.html
*/
public class WebGet
{
   public static void main(String[] args) throws IOException
   {
      // Get command-line arguments

      String host;
      String resource;

      if (args.length == 2)
      {
         host = args[0];
         resource = args[1];
      }
      else
      {
         System.out.println("Getting / from java.sun.com");
         host = "java.sun.com";
         resource = "/";
      }

      // Open socket

      final int HTTP_PORT = 80;
      Socket s = new Socket(host, HTTP_PORT);

      // Get streams
      
      InputStream instream = s.getInputStream();
      OutputStream outstream = s.getOutputStream();

      // Turn streams into scanners and writers

      Scanner in = new Scanner(instream);
      PrintWriter out = new PrintWriter(outstream);      

      // Send command

      String command = "GET " + resource + " HTTP/1.0\n\n";
      out.print(command);
      out.flush();

      // Read server response

      while (in.hasNextLine())
      {
         String input = in.nextLine();
         System.out.println(input);
      }

      // Always close the socket at the end

      s.close();      
   }
}
