import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Contect_Main {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "D:\\OneDrive\\Desktop\\סמסטר ה\\תכנות מונחה עצמים\\exsis files class\\contact.txt";

		Contect c1 = new Contect("050-7865432", "Kobi", Contect.associationGroup.femliy);
		
		c1.save(fileName);
		
		Contect c2 = new Contect("050-7865432", "yolo", Contect.associationGroup.frinds);
		
		Contect c3 = new Contect("050-7865432", "momo", Contect.associationGroup.other);
		
		Contect con [] = {c1,c2,c3};
		
		File f = new File(fileName);

		PrintWriter pw = new PrintWriter(f);
		
		for(Contect c: con) {
			
			c.save(pw);
		}
		
		pw.close();
		
		
	}

}
