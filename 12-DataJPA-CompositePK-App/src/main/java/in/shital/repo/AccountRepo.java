package in.shital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.Account;
import in.shital.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK>{

}
