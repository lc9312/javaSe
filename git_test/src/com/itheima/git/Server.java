package com.itheima.git;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        // 找快递站
        DatagramSocket ds = new DatagramSocket(9999);
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        while (true) {
            // 建箱子
//            DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
            ds.receive(dp);

            // 从箱子取数据
            byte[] data = dp.getData();
            int len = dp.getLength();

            // 使用数据
            System.out.println(new String(data,0,len));
        }

        // 关闭资源
//        ds.close();
    }
}
