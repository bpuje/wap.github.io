package mum.edu.cs544.ecommerce.eCommercedbservice.resource;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.Account;
import mum.edu.cs544.ecommerce.eCommercedbservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db/account")
public class AccountResource {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/saveAccount")
    public void saveAccount(@RequestBody Account account) {
        accountRepository.save(account);
    }

    @GetMapping("/getAllProducts")
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }


}
