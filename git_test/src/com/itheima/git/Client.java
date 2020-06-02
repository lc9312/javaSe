package com.itheima.git;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * UPD发送端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        InetAddress localHost = Inet4Address.getLocalHost();
        int port = 9999;

        while (true) {
            // 输入要传输的数据
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }

            // 打包,填写地址等信息
            byte[] bytes = str.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,localHost,port);

            // 发送包裹
            ds.send(dp);
        }

        // 释放资源
        ds.close();
    }
}
