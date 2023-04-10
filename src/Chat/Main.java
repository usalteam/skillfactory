package Chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {
    Socket socket;
    int socketIndex;
    static int i = -1;
    static ArrayList<Socket> sockets = new ArrayList<>();

    public Main(Socket socket){
        i++;
        this.socket = socket;
        this.socketIndex = i;
        sockets.add(i, socket);
    }
    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);

        while(true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            Socket socket = server.accept();

            System.out.println("Client connected!");
            // создаем клиента на своей стороне

            new Thread(new Main(socket)).start();
        }
    }

    public void run() {
        try {

            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
            Scanner in = new Scanner(is);
            PrintStream out = new PrintStream(os);

            // читаем из сети и пишем в сеть
            out.println("Hello user"+i+"!");
            String input = in.nextLine();
            while (!input.equals("exit")) {
                for(int z = 0; z < sockets.size(); z++) {
                    if (z == socketIndex) {

                    } else if (sockets.get(z) == null) {

                    } else {
                        OutputStream os1 = sockets.get(z).getOutputStream();
                        PrintStream out1 = new PrintStream(os1);
                        out1.println("User"+socketIndex+": " + input);
                    }
                }
                input = in.nextLine();
            }
            socket.close();
            sockets.set(this.socketIndex, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
