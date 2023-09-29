package in.shital.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="account_tbl")
@Entity
public class Account {
	
	private String holderName;
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPk;

}
