package pl.mszulc;

import java.io.IOException;
import java.net.ServerSocket;

public class DictionaryTCPMultiServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        boolean listening = true;

        try {
            serverSocket = new ServerSocket(4444);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(-1);
        }

        while (listening)
            new DictionaryTCPThread(serverSocket.accept()).start();

        serverSocket.close();
    }
}
