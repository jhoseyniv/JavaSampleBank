package javasamples.designpattern.Behavioral.Observer;

import org.junit.jupiter.api.Test;

public class ObserverImpl {

public static void main(String args[]){



 }
        @Test
        public void observersHandleEventsFromSubject() {
                MyServer<String> server = new MyServerImp("Server");

                server.notifyClients("No listeners");

                MyClient<String> clientA= new MyClientImp("A");

                server.registerClient(clientA);
                server.notifyClients("Client A added");


                MyClient<String> clientB= new MyClientImp("B");
                server.registerClient(clientB);
                server.notifyClients( "Client B added" );


                MyClient<String> clientC= new MyClientImp("C");
                server.registerClient(clientC);
                server.notifyClients("Client C added");

                MyClient<String> clientD= new MyClientImp("D");
              server.registerClient(clientD);
               server.notifyClients("Client D added");

                MyClient<String> clientE= new MyClientImp("E");
                server.registerClient(clientE);
                server.notifyClients("Client E added");

        }
}
