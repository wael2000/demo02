package org.enbd.poc;

//import java.util.List;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class RestProcessor implements Processor {
	 public void process(Exchange exchange) throws Exception {
		 //List soaList = exchange.getIn().getBody(List.class);
		 exchange.getOut().setBody("{message:'Hello World'}");
	 }
}
