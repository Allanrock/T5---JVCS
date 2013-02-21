/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.conexoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Modelo de servidor que se comunica por sockets.
 * @author andrea
 */
class CriaServer {

    ServerSocket serverSocket = null;
    Socket clientSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;

    /**
     * Inicia o servidor, criando socket para escuta na porta port.
     * @param port
     * @throws IOException
     */
    void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    /**
     * Aceita (aguarda) conexao de cliente e cria streams para comunicacao.
     * @throws IOException
     */
    void acceptConnection() throws IOException {
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(
                clientSocket.getInputStream()));
        out.println("welcome"); // welcome client
        if (out.checkError()) {
            throw (new IOException());
        }
    }

    /**
     * Recebe mensagem do cliente.
     * @return mensagem do cliente
     * @throws IOException
     */
    String receiveString() throws IOException {
        return in.readLine();
    }

    /**
     * Faz stop no servidor, fechando streams e sockets.
     * @throws IOException
     */
    void stop() throws IOException {
        if (in != null) in.close();
        if (out != null) out.close();
        if (clientSocket != null) clientSocket.close();
        if (serverSocket != null) serverSocket.close();
    }
}
