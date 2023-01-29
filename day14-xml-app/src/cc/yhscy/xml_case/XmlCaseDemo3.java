package cc.yhscy.xml_case;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yhsec on 2023/1/29 23:12
 */
public class XmlCaseDemo3 {
    public static void main(String[] args) throws DocumentException {
//        1.解析Contact.xml文件
        SAXReader saxReader = new SAXReader();
        InputStream is = XmlCaseDemo3.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);

        Element root = document.getRootElement();
        System.out.println(root.getName());

        List<Element> sonEles = root.elements("contact");
        //2.准备arraylist集合封装联系人信息
        List<Contact> contactList = new ArrayList<>();

        //3.每个contact元素都是有个联系人对象
        for (Element sonEle : sonEles) {
//            System.out.println(sonEle.attributeValue("id"));
            Contact contact = new Contact();
            contact.setId(sonEle.attributeValue("id"));
            contact.setVip(Boolean.valueOf(sonEle.attributeValue("vip")));
            contact.setName(sonEle.elementText("name"));
            contact.setGender(sonEle.elementText("gender"));
            contact.setEmail(sonEle.elementText("email"));
            contactList.add(contact);


        }

        //4.遍历contactList
        for (Contact contact : contactList) {
            System.out.println(contact.toString());

        }
    }

}
