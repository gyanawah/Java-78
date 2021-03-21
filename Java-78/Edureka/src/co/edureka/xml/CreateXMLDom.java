package co.edureka.xml;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLDom {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder(); // DOM Parser

		Document doc = parser.newDocument();

		Element rootElement = doc.createElement("students");
		doc.appendChild(rootElement);

		Element studElement = doc.createElement("student");
		rootElement.appendChild(studElement);

		Element studNameElement = doc.createElement("name");
		studElement.appendChild(studNameElement);
		Element studEmailElement = doc.createElement("email");
		studElement.appendChild(studEmailElement);
		Element studAddressElement = doc.createElement("address");
		studElement.appendChild(studAddressElement);

		Text studName = doc.createTextNode("Sunil Joseph");
		Text studEmail = doc.createTextNode("sunil@edureka.co");
		Text studAddress = doc.createTextNode("Hyderabad");

		studNameElement.appendChild(studName);
		studEmailElement.appendChild(studEmail);
		studAddressElement.appendChild(studAddress);

		TransformerFactory tfactory = TransformerFactory.newInstance();
		Transformer t = tfactory.newTransformer();

		FileOutputStream fos = new FileOutputStream("E:/students.xml");
		t.transform(new DOMSource(doc), new StreamResult(fos));

		System.out.println("XML file generated..");
	}

}
