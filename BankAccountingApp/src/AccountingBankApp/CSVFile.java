package AccountingBankApp;
import java.util.*;
import java.io.*;

public class CSVFile {

	private static String data;

	// Read DATA from a Csv File 
	public static List<String[]> ReadFileData(String filePath) {
		// initialize a list of data with LinkedList
		List<String[]> list = new LinkedList<String[]>();
		
		// BufferedReaderd Class
		try {
			BufferedReader b = new BufferedReader(new FileReader(filePath));
			try {
				while((data = b.readLine()) != null)    {   
				String list_data[] = data.split(",");
				list.add(list_data);
				}
			} catch (IOException e) {
				System.out.println("Can't Read a File!");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
		return list;
	}
	
	// add a search function for a specific client name
	public static List<String[]> SearchFile(String filePath){
		List<String[]> list = new LinkedList<String[]>();
		String d;
		try {
			BufferedReader f = new BufferedReader(new FileReader(filePath));
		   try {
			  while((d = f.readLine()) != null){
				  String[] data = d.split("\n");
				  list.add(data);
			   }
		} catch (IOException e) {
			System.out.println("Can't Read a File!");
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
		return list;
	}

}
