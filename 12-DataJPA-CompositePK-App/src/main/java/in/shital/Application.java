
package in.shital;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shital.entity.Account;
import in.shital.entity.AccountPK;
import in.shital.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		AccountRepo bean=ctxt.getBean(AccountRepo.class);
		
		
		//setting composite key values
		AccountPK pk=new AccountPK();
		pk.setAccNum(15454323212l);
		pk.setAccType("Savings");
	
		//setting entity data
		Account acc=new Account();
		acc.setHolderName("Shital");
		acc.setBranch("Pune");
		acc.setAccountPk(pk);   //setting pk obj
		
		bean.save(acc);    //setting the entity obj
		
		System.out.println("Record saved..........");
		
		
		//************************Retriving using findById method*****************
		/*
		AccountPK pk=new AccountPK();
		pk.setAccNum(15454323212l);
		pk.setAccType("Savings");
		
		Optional<Account> findById=bean.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		*/
	}

}

//you can specify more than two primary keys in composite primary key
//you will have to implement serializable interface by compositePK class which is marker interface
//marker interface is used to give special instructions to JVM

//Spring profiles=================>dev,sit,uat,pilot,prod