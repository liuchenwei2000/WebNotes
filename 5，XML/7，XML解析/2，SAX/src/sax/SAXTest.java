/**
 * 
 */
package sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAX����XMLʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��1��24��
 */
public class SAXTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String xmlFilePath = "files/demo.xml";
		try {
			// 1������ SAXParserFactory
			SAXParserFactory factory = SAXParserFactory.newInstance();
			// 2����������� SAXParser
			SAXParser parser = factory.newSAXParser();
			// 3��ʹ�� DefaultHandler ����XML
			parser.parse(new File(xmlFilePath), new MySAX());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static class MySAX extends DefaultHandler {

		@Override
		public void startDocument() throws SAXException {
			System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
		}

		@Override
		public void endDocument() throws SAXException {
			System.out.println("\n �ĵ���ȡ����");
		}

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			System.out.print("<" + qName);
			if (attributes != null) {
				for (int i = 0; i < attributes.getLength(); i++) {
					System.out.print(" " + attributes.getQName(i) + "=\""
							+ attributes.getValue(i) + "\"");
				}
			}
			System.out.print(">");
		}

		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			System.out.print("<" + qName + ">");
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			System.out.print(new String(ch, start, length));
		}
	}
}
