package cc.yhscy.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * Created by yhsec on 2023/1/28 16:12
 */
public class XmlDemo1 {
    //src的路径叫做类路径
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        //把xml文件加载到内存中称为一个document对象；
        /*
        为了防止模块名改动，低耦合，不适用此方法
         */
//        Document document = saxReader.read(new File("day14-xml-app/src/books.xml"));

        //建议使用,getResourceAsStream中的/是直接去src下寻找文件
        InputStream is = XmlDemo1.class.getResourceAsStream("/books.xml");
        Document document = saxReader.read(is);

        //3.获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());

        //4.拿下根元素下的子元素
//        List<Element> sonEles = root.elements();
        List<Element> sonEles = root.elements("book"); //也可以拿指定元素
        for (Element sonEle : sonEles){
            System.out.println(sonEle.getName());
        }

        //5.拿指定的元素
        Element el = root.element("book");  //默认是拿第一个
        System.out.println(el.getName());
        Element sonEl = el.element("sale"); //还可以拿下一级
        System.out.println("元素的内容是" + sonEl.getText());

        //6.元素的文本
        System.out.println(el.elementText("author"));

        //s属性
        Attribute elAtti = el.attribute("id");
        System.out.println("--->" + elAtti.getValue());

        //也可以直接拿属性值
        System.out.println(el.attributeValue("desc"));







    }

}
