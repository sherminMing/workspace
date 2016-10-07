import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Per implements Cloneable,Serializable{
	int id;
	String name;
	Address address;
	public Per(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public String toString() {

		return "["+" ��ţ� "+this.id+" ���� : "+this.name+" ��ַ: "+this.address+"]";
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Address implements Serializable{
	String addressString;
	public Address(String addString) {
		this.addressString=addString;
	}
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return this.addressString;
	}
}
public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		/*Per per2;
		per2=(Per) per1.clone();
		
		per2.name="���";
		System.out.println("per1="+per1);
		System.out.println("per2="+per2);*/
		Address address=new Address("����ɽ");
		Per per1=new Per(110,"��ʥ",address);
		writeObj(per1);
		Per per2=readObj();
		per2.address=new Address("����ׯ");
		per2.name="�˽�";
		per2.id=112;
		System.out.println("per1  "+per1);
		System.out.println("per2   "
				+ ""+per2);
	}
	public static void writeObj(Per p) throws IOException{
		FileOutputStream fileOutputStream=new FileOutputStream("F:\\users.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(p);
		objectOutputStream.close();
	}
	public static Per  readObj() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream =new FileInputStream("F:\\users.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Per per=(Per) objectInputStream.readObject();
		objectInputStream.close();
		return per;
	}

}
