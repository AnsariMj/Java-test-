import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//import java.net.*;
//import java.io.*;
//import java.util.*;

public class AddServer {

    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket(8080);
        Socket s1 = s.accept();

        Scanner in = new Scanner(s1.getInputStream());
        PrintWriter outs = new PrintWriter(s1.getOutputStream(), true);
        Scanner ss = null, rs = null;

        outs.println("Enter First Number");
        int a = in.nextInt();
        outs.println("Enter Second Number");
        int b = in.nextInt();
        int r = a + b;
        outs.println("Sum=" + r);

        outs.close();
        in.close();
        s1.close();

    }

}