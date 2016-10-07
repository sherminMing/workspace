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

		return "["+" 编号： "+this.id+" 姓名 : "+this.name+" 地址: "+this.address+"]";
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
		// TODO 自动生成的方法存根
		return this.addressString;
	}
}
public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		/*Per per2;
		per2=(Per) per1.clone();
		
		per2.name="猢狲";
		System.out.println("per1="+per1);
		System.out.println("per2="+per2);*/
		Address address=new Address("花果山");
		Per per1=new Per(110,"大圣",address);
		writeObj(per1);
		Per per2=readObj();
		per2.address=new Address("高老庄");
		per2.name="八戒";
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
