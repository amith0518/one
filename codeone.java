package codeone;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class codeone {
private static BufferedReader bufferedReader;

public static void main(String[] args) throws Exception {
	
	File inputFile = new File("src/code.txt");
	FileReader fileReader = new FileReader(inputFile);
	bufferedReader = new BufferedReader(fileReader);
	String inputLine;
	List<String> lineList = new ArrayList<String>();
	List<String> lineList1 = new ArrayList<String>();
	List<String> linelist2 = new ArrayList<String>();
	List<String> linelist3 = new ArrayList<String>();
	List<String> linelist4 = new ArrayList<String>();
	List<Employee> employeeList = new ArrayList<Employee>();
	while ((inputLine = bufferedReader.readLine()) != null) {
		lineList.add(inputLine);
		System.out.println(inputLine);
		
		Employee employee=new Employee();
		String[] parts = inputLine.split(",");
		employee.Name=parts[0];
		employee.Email=parts[1];
		employee.Place=parts[2];
		
		employeeList.add(employee); 
		System.out.println(employee.Name);
		System.out.println(employee.Email);
		System.out.println(employee.Place);
		System.out.println("\n");
		
	}
	
	 for(Employee model : employeeList) {
         //System.out.println(model.Name);
         //System.out.println(model.Email);
         //System.out.println(model.Place);
         lineList1.add(model.Name);
         linelist2.add(model.Email);
         linelist3.add(model.Place);
         linelist4.add(model.Name);
         System.out.println(model.Name);
        
     }
	
	 
	 
	 
	 System.out.println("\n");
	  
	 Collections.sort(lineList1);
     //Collections.sort(linelist2);
	 //Collections.sort(linelist3);
     System.out.println(lineList1);
    System.out.println("\n");
     System.out.println("enter the email id to search");
     
	 Scanner x1=new Scanner(System.in);
String src=x1.next();
System.out.println(linelist2);

boolean res=linelist2.contains(src);
if(res==true)
	{System.out.println("present in the file");
	System.out.println("\n");
int num=(linelist2.indexOf(src));
	System.out.println("name is" +" "+linelist4.get(num));
	System.out.println("place is"+ " " +linelist3.get(num));
	}
else
	System.out.println("not present in the file");


}
}