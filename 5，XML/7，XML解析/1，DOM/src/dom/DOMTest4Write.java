/**
 * 
 */
package dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * DOM���XMLʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��1��24��
 */
public class DOMTest4Write {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String xmlFilePath = "files/output.xml";
		try {
			// 1������ DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// 2������ DocumentBuilder
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 3�������յ� Document
			Document document = builder.newDocument();
			// 4���������������ڵ�
			Element books = document.createElement("books");
			Element book = document.createElement("book");
			Element name = document.createElement("name");
			Element author = document.createElement("author");
			// 5�����ýڵ���ı�����
			name.appendChild(document.createTextNode("Thinking in Java"));
			author.appendChild(document.createTextNode("Eckl Bruce"));
			// 6����֯�����ڵ�Ĺ�ϵ
			book.appendChild(name);
			book.appendChild(author);
			books.appendChild(book);
			// 7�������ڵ�󶨵� Document ������
			document.appendChild(books);
			// 8�������Ӳ��
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312");// ���ñ��뷽ʽ
			
			transformer.transform(new DOMSource(document), new StreamResult(new File(xmlFilePath)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}