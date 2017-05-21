/*
	* File:   EchoServer.java
	* Desc:   Opens socket on port 8081 for multiple clients and echos text sent to server
	* Author: Wesley Tomlinson
	* Class:  IT360 / M2A1
*/

import java.io.*;
import java.net.*;
import java.lang.Thread;

public class EchoServer
{
    public static void main (String[] args)
    {
        try
        {
            ServerSocket server = new ServerSocket(8081);
            while (true)
            {
                Socket client = server.accept();
                EchoHandler handler = new EchoHandler(client);
                handler.start();
            }
        }
        catch (Exception err)
        {
            System.err.println("Caught exception:" + err);
        }
    }
}

class EchoHandler extends Thread
{
    Socket client;
    EchoHandler (Socket client) {this.client = client;}

    public void run ()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            writer.println("[type 'iQuit' to disconnect]");

            while (true)
            {
                String line = reader.readLine();
                String lowLine = line.toLowerCase();
                if (lowLine.trim().equals("iquit"))
                {
                    writer.println("Later!");
                    break;
                }
                writer.println("[You said...] " + line);
                // to disconnect after a single write-back, break here
            }
        }
        catch (Exception err)
        {
            System.err.println("Caught exception: client disconnected");
        }
        finally
        {
            try
            {
                client.close();
            }
            catch (Exception err )
            {
                ;
            }
        }
    }
}