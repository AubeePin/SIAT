package org.comstudy.ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx {
   // ServerSocket <----> Socket ���� ��� ����
   private ServerSocket serverSocket;
   private Socket clientSocket;
   
   private DataInputStream dataInputStream;
   private DataOutputStream dataOutputStream;
   
   public ServerSocketEx() {
      // 1. ���� ���� �غ�(����)
      // 2. ������ �Ǹ� Ŭ���̾�Ʈ ���� ��ȯ(accept)
      try {
         serverSocket = new ServerSocket(8000);
         System.out.println("���� ���� ��� �� ...");
         clientSocket = serverSocket.accept();
         System.out.println(">>>> ũ���̾�Ʈ ���� �� : " + clientSocket.getLocalAddress());
      
         dataInputStream = new DataInputStream(clientSocket.getInputStream());
         dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
         
         String msg = dataInputStream.readUTF();
         System.out.println(">>>> Ŭ���̾�Ʈ�� ���� �޼���: " + msg);
         dataOutputStream.writeUTF(msg);
         System.out.println(">>>> Ŭ���̾�Ʈ�� �޼��� ������ �Ϸ�!");
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         // ���� �Ϸ� �� ��� ���� ��Ʈ�� close.
         try {
            if(dataInputStream!=null) dataInputStream.close();
            if(dataOutputStream!=null) dataOutputStream.close();
            if(clientSocket!=null) clientSocket.close();
            if(serverSocket!=null) serverSocket.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

   public static void main(String[] args) {
      new ServerSocketEx();
   }
}