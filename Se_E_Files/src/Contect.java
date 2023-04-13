import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Contect {

	private String phone;
	private String user;
	private associationGroup group;

	public enum associationGroup {
		frinds, femliy, work, other
	};

	public Contect(String tmpPhone, String tmpUser, associationGroup tmpGroup) {

		this.phone = tmpPhone;
		this.user = tmpUser;
		this.group = tmpGroup;
	}

	public void save(String fileName) throws FileNotFoundException {

		File f = new File(fileName);

		PrintWriter pw = new PrintWriter(f);

		pw.println(this.phone);
		pw.println(this.user);
		pw.println(this.group);

		pw.close();
	}

	public void save(PrintWriter pw) throws FileNotFoundException {

		pw.println(this.phone);
		pw.println(this.user);
		pw.println(this.group);
		pw.println("-----------");
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public associationGroup getGroup() {
		return group;
	}

	public void setGroup(associationGroup group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Contect [phone=" + phone + ", user=" + user + ", group=" + group + "]";
	}
	

}
