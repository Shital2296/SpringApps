package in.shital.config;

import org.springframework.batch.item.ItemProcessor;

import in.shital.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		// logic to process data
		return null;
	}

}
