package com.wallet.WalletManagement.controller;

import com.wallet.WalletManagement.entity.WalletEntry;
import com.wallet.WalletManagement.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wallet-management/")
public class WalletController {

    @Autowired
    WalletService walletService;

    @RequestMapping(value = "/addMoney", method = RequestMethod.POST)
    ResponseEntity<Object> addMoneyToWallet(@RequestBody(required = true) WalletEntry walletEntry) throws Exception {
        WalletEntry addedWalletEntry = walletService.addMoneyToWallet(walletEntry);
        return new ResponseEntity<>(addedWalletEntry, HttpStatus.OK);
    }
}
