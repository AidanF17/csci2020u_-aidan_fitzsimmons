package csci2020u.lab02;
import java.io.*;
import org.apache.commons.csv.*;


public class CSVDemo {
	public static void main(String[] args){
		try {
			Reader in = new FileReader("data.csv");
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader("firstname", "lastName", "SID", "Grade").parse(in);

			for (CSVRecord record: records){
				String lastName = record.get("lastname");
				String firstName = record.get("First Name");
				String grade = record.get("Grade");
				System.out.println(firstname + " " + lastname + "(" + grade + ")");
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}