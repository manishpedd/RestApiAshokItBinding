package com.RestApiAashokItBindings.Claas;
//
//import java.io.File;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//
//public class XmlToJavaObject {
//	public static void main(String[] args) throws JAXBException {
//
//		JAXBContext context = JAXBContext.newInstance(Customer.class);
//		
//		Unmarshaller Unmarshaller = context.createUnmarshaller();
//
//		Object unmarshal = Unmarshaller.unmarshal(new File("customer.xml"));
//
//		System.out.println(unmarshal);
//
//	}
//}