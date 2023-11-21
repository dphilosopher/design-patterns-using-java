package com.example.design.patterns.creational.abstractFactory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;

public class AbstractFactoryDemo {
    public static void main(String []args) throws Exception {
//        String xml = "<document><body><stock>TSLA</stock></body></document>";
//        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
//        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
//
//        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
//        Document doc = factory.parse(bais);
//
//        doc.getDocumentElement().normalize();
//        System.out.println("Root element: " + doc.getDocumentElement().getLastChild());
//
//        System.out.println(abstractFactory.getClass());
//        System.out.println(factory.getClass());

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(640);
        CreditCard card = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card.getClass());

        System.out.println("-------------------------------------------------------------------------------------");

        CreditCardFactory abstractFactory1 = CreditCardFactory.getCreditCardFactory(800);
        CreditCard card1 = abstractFactory1.getCreditCard(CardType.PLATINUM);

        System.out.println(card1.getClass());
    }
}
