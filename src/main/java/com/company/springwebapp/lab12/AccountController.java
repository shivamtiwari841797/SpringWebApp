package com.company.springwebapp.lab12;

import com.company.springwebapp.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/deposit")
    public String deposit(@RequestParam("accountnumber") String accountNumber, @RequestParam int amount) {
        String msg = "";
        try {
            accountService.deposit(accountNumber, amount);
            msg = "Amount deposited!!!";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }
    @PostMapping("/withdraw")
    public String withdraw(@RequestParam("accountnumber") String accountNumber, @RequestParam int amount) {
        String msg = "";
        try {
            accountService.withdraw(accountNumber, amount);
            msg = "Amount withdrawn!!!";
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

}
