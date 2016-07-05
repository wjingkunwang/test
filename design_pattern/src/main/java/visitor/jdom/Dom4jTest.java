package visitor.jdom;

import java.io.File;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.VisitorSupport;
import org.dom4j.io.SAXReader;

/**
 * Created by wjk on 16/7/4.
 */
public class Dom4jTest {


    public class MyVisitor extends VisitorSupport {

        public void visit(Attribute node) {
            System.out.println("属性 : " + node.getName() + " = " + node.getValue());
        }

        public void visit(Element node) {
            if (node.isTextOnly()) {
                System.out.println("节点: " + node.getName() + " = " + node.getText());
            } else {
                System.out.println("节点：" + node.getName());
            }
        }
    }


    public static void main(String[] args) throws Exception {

        SAXReader saxReader = new SAXReader();
        File file = new File("/Users/wjk/myproject/test/design_pattern/src/main/resources/dom4j.xml");
        try {
            Document doc = saxReader.read(file);
            doc.accept(new Dom4jTest().new MyVisitor());
        } catch (DocumentException de) {
            de.printStackTrace();
        }

    }

}
