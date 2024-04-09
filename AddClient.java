import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// import java.net.*;
// import java.io.*;
// import java.util.*;

public class AddClient {
    public static void main(String[] args) throws IOException {

        Socket s1 = new Socket("localhost", 8080);

        Scanner in = new Scanner(s1.getInputStream());
        PrintWriter outs = new PrintWriter(s1.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);
        String msg = in.nextLine();
        System.out.println(msg);
        int a = sc.nextInt();
        outs.println(a);
        msg = in.nextLine();
        System.out.println(msg);
        int b = sc.nextInt();
        outs.println(b);
        msg = in.nextLine();
        System.out.println(msg);

        in.close();
        outs.close();
        s1.close();
    }
}