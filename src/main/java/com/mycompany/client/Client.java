/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.client;

import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class Client {
    private static String Address = "localhost";
    //private static String Address = "192.168.1.13";
    private static int PORT = 1234;
    
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(Address, PORT);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
