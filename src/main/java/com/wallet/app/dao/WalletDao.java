package com.wallet.app.dao;

import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;

public interface WalletDao {
    //crud
    Wallet addWallet(Wallet newWallet) throws WalletException;
    Wallet getWalletById(Integer walletId) throws WalletException;
    Wallet updateWallet(Wallet updateWallet) throws WalletException;
    Wallet deleteWalletById(Integer walletId) throws WalletException;


}
