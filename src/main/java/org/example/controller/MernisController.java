package org.example.controller;

import org.example.abstractt.ICustomerCheckService;
import org.example.entities.Customer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class MernisController implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return customer.getNationalityId()=="46165855550";
    }
}

