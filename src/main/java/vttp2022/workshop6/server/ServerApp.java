package vttp2022.workshop6.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerApp {

  public static void main(String[] args) throws IOException {

    System.out.println("Server App");

    int port = 3001;
    if(args.length > 0)
      port = Integer.parseInt(args[0]);

    String cookieFile = args[1];

    ExecutorService threadPool = Executors.newFixedThreadPool(2);

    ServerSocket server = new ServerSocket(port);

    while(true){
      System.out.println("Waiting for client connection");
      Socket sock = server.accept();
      System.out.println("Connected ...");
      CookieClientHandler thr = new CookieClientHandler(sock, cookieFile);
      threadPool.submit(thr);
      System.out.println("Submitted to threadpool");
    }
  }
  
}
