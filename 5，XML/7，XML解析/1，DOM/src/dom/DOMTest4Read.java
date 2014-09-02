/**
 * 
 */
package dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * DOM����XMLʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��1��24��
 */
public class DOMTest4Read {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String xmlFilePath = "files/demo.xml";
		try {
			// 1������ DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// 2������ DocumentBuilder
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 3������ Document
			Document document = builder.parse(new File(xmlFilePath));
			// 4������ NodeList
			NodeList books = document.getElementsByTagName("book");
			// 5������XML��Ϣ��ȡ
			for (int i = 0; i < books.getLength(); i++) {
				Element book = (Element)books.item(i);
				NodeList name = book.getElementsByTagName("name");
				NodeList author = book.getElementsByTagName("author");
				// ��DOM�����У�ÿһ���ڵ��е�����ʵ���϶���һ���������ı��ڵ�
				// ȡ�� name �ڵ��µĵ�һ���ӽڵ�ĵ�һ���ı��ڵ㣬��ͨ��getNodeValueȡ���˽ڵ�����
				System.out.println("name:" + name.item(0).getFirstChild().getNodeValue());
				System.out.println("author:" + author.item(0).getFirstChild().getNodeValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}