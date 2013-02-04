package pl.mszulc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DictionaryTCPThread extends Thread {
    private Socket socket = null;

    public DictionaryTCPThread(Socket socket) {
        super("DictionaryTCPThread");
        this.socket = socket;
    }

    public void run() {

        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String inputLine, outputLine = null;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                out.println(inputLine + "<--- wiadomosc z servera");
            }
            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


