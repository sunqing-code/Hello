<?xml version="1.0"?>
<config>
<brandName>HisenseTv</brandName>
</config>
import java.xml.parsers.*;       //����������
import org.w3c.dom.*;            //����������
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtilTv{   
	public static String getBrandName() {       //����̱귽��
		try {
			DocumentBuilderFactory dFactory =DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc=builder.parse(new File("configTv.xml"));
			NodList n1=doc.getElementsByTagName("brandName");
			Node classNode=n1.item(0).getFirstChild();
			String brandName=classNode.getNodeValue().trim();
			return brandName;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
public class Main{             //������
	public static void main(String args[]) {
		Tv tv;          //����TV��Ķ���
		String brandName =XMLUtilTv.getBrandName();   //����getBrandName()������õ��ӻ��̱�
		tv=TvFactory.produceTv(brandName);
		tv.play();
		}
}
public abstract class Tv{        //����������TV
	public abstract void play();
}
public class HaierTv extends Tv{    //����HaierTV��̳���TV�����ಢʵ��play��������
	public void play() {
		System.out.println("This is HaierTv.");
	}
}
public class HisenseTv extends Tv{        //����HisenseTv��̳���TV�����ಢʵ��play��������
	public void play() {
		System.out.println("This is HisenseTv.");
	}
}
public class TvFactory {              //TV����
	public static Tv produceTv(String brand) {
		if(brand.contentEquals("HaierTv"))
			return new HaierTv();
		if(brand.contentEquals("HisenseTv"))
			return new HisenseTv();
		return null;
	}
}