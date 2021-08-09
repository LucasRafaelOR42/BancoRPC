package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoServiceIF extends Remote {

    Conta getConta(int index) throws RemoteException;
    int quantidadeContas() throws RemoteException;
    void cadastrarConta(String conta) throws RemoteException;
    void adicionarConta(Conta c) throws RemoteException;
}
