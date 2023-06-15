package org.comstudy.ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx {
   private Socket socket;
   private DataInputStream dataInputStream;
   private DataOutputStream dataOutputStream;
   
   public ClientSocketEx() {
      try {
         socket = new Socket("127.0.0.1", 8000);
         System.out.println(">>>> ������ ���� ��.");
         
         dataInputStream = new DataInputStream(socket.getInputStream());
         dataOutputStream = new DataOutputStream(socket.getOutputStream());
         
         dataOutputStream.writeUTF("Hello socket server!");
         System.out.println(dataInputStream.readUTF());
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         // ���� �Ϸ� �� ��� ���� ��Ʈ�� close.
         try {
            if(dataInputStream!=null) dataInputStream.close();
            if(dataOutputStream!=null) dataOutputStream.close();
            if(socket!=null) socket.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

   public static void main(String[] args) {
      new ClientSocketEx();
   }

}