package org.enbd.poc;
import javax.jws.WebService;
import org.enbd.poc.model.CorporateAccount;
import org.enbd.poc.model.Account;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebService(endpointInterface = "org.enbd.poc.CustomerService")
public class CustomerEndpoint implements CustomerService{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerEndpoint.class);

	List<String> sales;
	
	public CustomerEndpoint() {
		sales = new ArrayList<String>();
		sales.add("James Strachan");
		sales.add("Claus Ibsen");
		sales.add("Hiram Chirino");
		sales.add("Jeff Bride");
		sales.add("Chad Darby");
		sales.add("Rachel Cassidy");
		sales.add("Bernard Tison");
		sales.add("Nandan Joshi");
		sales.add("Rob Davies");
		sales.add("Guillaume Nodet");
		sales.add("Marc Little");
		sales.add("Mario Fusco");
		sales.add("James Hetfield");
		sales.add("Kirk Hammett");
		sales.add("Steve Perry");
		
	}
	
	@Override
	public String getAccount1(@WebParam(name="id") String id) {
		LOGGER.info("getting Account: {}", id);
		return "Hellow Worl";
	}
	
	@WebResult(name = "CorporateAccount")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public CorporateAccount getAccount(Account account) {
		LOGGER.info("Updating Account: {}", account);

		// Create new Corporate Account
		CorporateAccount ca = new CorporateAccount();
		ca.setId(genRandom());
		ca.setSalesContact(getRandomSales(sales));
		
		LOGGER.info("New CorporateAccount created: {}", ca);

		return ca;
	}

	public static int genRandom() {
		return new Random().nextInt(100);
	}

	public static String getRandomSales(List<String> list) {
		// 0-11
		int index = new Random().nextInt(list.size());
		return list.get(index);
	}
}
