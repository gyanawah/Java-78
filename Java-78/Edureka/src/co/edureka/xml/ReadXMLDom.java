package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLDom {
	private static final Logger logger = Logger.getLogger(ReadXMLDom.class);
	
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder(); // DOM Parser
		
		BasicConfigurator.configure();
		
		File file = new File("src/co/edureka/xml/staff.xml");
		if(file.exists()) {
			Document doc = parser.parse(file);
			Element rootElement = doc.getDocumentElement();
			//System.out.println("Root Element = "+ rootElement.getNodeName());
			logger.info("Root Element = "+ rootElement.getNodeName());
			
			NodeList staffs = doc.getElementsByTagName("staff");
			logger.debug("No of Staffs = " + staffs.getLength());
					
		     for(int i=0;i<staffs.getLength();i++)
		     {
		       logger.warn("-------------------------------------");
		       Node staff=staffs.item(i);
		       
		       if(staff.getNodeType()==Node.ELEMENT_NODE)
		       {
		    	   Element stf=(Element)staff;
		    	   System.out.println("Staff ID : "+stf.getAttribute("id"));
		    	   
		    	   logger.error("First Name : "+stf.getElementsByTagName("firstname").item(0).getTextContent());
		    	   logger.info("Last Name : "+stf.getElementsByTagName("lastname").item(0).getTextContent());
		    	   logger.info("Nick Name : "+stf.getElementsByTagName("nickname").item(0).getTextContent());
		    	   System.out.println("Salary : "+stf.getElementsByTagName("salary").item(0).getTextContent());		    	   
		       }
		     }     			
		}else {
			System.out.println("XML document is not available....");
		}
	}
}
