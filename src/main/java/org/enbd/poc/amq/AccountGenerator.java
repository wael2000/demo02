package org.enbd.poc.amq;

import java.io.InputStream;

import org.apache.camel.CamelContext;
import org.springframework.stereotype.Component;

@Component
public class AccountGenerator {

    public InputStream generateAccounts(CamelContext camelContext) {
        String name = "data/accountsData.xml";
        return camelContext.getClassResolver().loadResourceAsStream(name);
    }

}

