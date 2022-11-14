package com.wallet.app.contoller;

import com.wallet.app.dao.WalletDao;
import com.wallet.app.dao.WalletDaoImpl;
import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;
import com.wallet.app.service.WalletService;
import com.wallet.app.service.WalletServiceImpl;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args){

        WalletService walletService = new WalletServiceImpl();

        WalletDao wc = new WalletDaoImpl();

        try {
            System.out.println("Adding new Account");
            Wallet x,y,z;
            x=new Wallet(11, "Ford1", 100.0, "123");
            y =new Wallet(12, "Ford2", 1000.0, "1234");
            z=new Wallet(15,"Ford3",12000.0,"1234");
            System.out.println(walletService.registerWallet(x));
            System.out.println(walletService.registerWallet(y));
            System.out.println(walletService.registerWallet(z));
            System.out.println("Login Account");
            System.out.println(walletService.login(11,"123"));
            System.out.println("Show Account Balance");
            System.out.println(walletService.showWalletBalance(11));
            //System.out.println(ws.showWalletBalance(12));
            System.out.println("Add Account Balance");
            System.out.println(walletService.addFundsToWallet(11,900.0));
            System.out.println("Amount Transfer");
            System.out.println(walletService.fundTransfer(11,12,500.0));
            System.out.println("delete Account");
            System.out.println(walletService.unRegisterWallet(11,"123"));
            System.out.println(walletService.unRegisterWallet(15,"1234"));

            Scanner sc = new Scanner(System.in);
            System.out.println("1.fundtransfer Exp 2.deleexp 3.loginexp");
            int a=sc.nextInt();
            switch (a){
                case 1:
                    //Exception for fundTransfer
                    System.out.println("Exception for fundTransfer");
                    walletService.fundTransfer(10,111,500.0);
                    break;
                case 2:
                    //Exception for delete password wrong
                    System.out.println("Exception for password wrong while deleting");
                    System.out.println(walletService.unRegisterWallet(111,"34"));
                    break;
                case 3:

                    //Exception for delete password wrong
                    System.out.println("Exception for password wrong while Login");
                    System.out.println(walletService.unRegisterWallet(111,"1234"));
                    break;



            }

        } catch (Exception  a) {

            //System.out.println("Password-mis-matches");
            a.printStackTrace();
        }

    }

}
