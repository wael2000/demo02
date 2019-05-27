package org.enbd.poc;

import javax.jws.WebParam;
import javax.jws.WebService;
import org.enbd.poc.model.CorporateAccount;
import org.enbd.poc.model.Account;

@WebService
public interface CustomerService {	
	
	CorporateAccount getAccount(Account account);
	String getAccount1(@WebParam(name="id") String id);
}
