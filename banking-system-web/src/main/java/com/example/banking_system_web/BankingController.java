package com.example.banking_system_web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BankingController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("account", bankAccountService.getCurrentAccount());
        return "index"; // Render the Thymeleaf template
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        bankAccountService.deposit(amount);
        return "redirect:/"; // Redirect to home to show updated balance
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam double amount) {
        try {
            bankAccountService.withdraw(amount);
        } catch (IllegalArgumentException e) {
            // Handle insufficient funds
        }
        return "redirect:/";
    }

    @PostMapping("/switchAccount")
    public String switchAccount(@RequestParam String accountNumber) {
        bankAccountService.switchAccount(accountNumber);
        return "redirect:/";
    }
}

