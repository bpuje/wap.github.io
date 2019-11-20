package mum.edu.cs544.ecommerce.eCommercedbservice.repository;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
