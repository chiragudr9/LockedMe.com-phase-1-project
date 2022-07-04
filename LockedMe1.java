
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe1 {
	static final String projectPath="D:\\Company Locker Pvt Ltd\\LockedMeFiles";

	public static void main(String[] args) {
	 try (Scanner obj = new Scanner(System.in)) {
		int ch;
     do {
		displayMenu();
		System.out.println("Enter your choice");
		ch=Integer.parseInt(obj.nextLine());
		
		switch(ch)
		{
		  case 1:getAllFiles();
		          break;
		  case 2:AddFiles();
		          break;
		  case 3:deleteFile();
		           break;
		  case 4:searchFile();
		           break;
		  case 5:System.exit(0);
		           break;
		 default :System.out.println("Invalid option");   
		           break; 
		}
	
	   }
	      while(ch>0);
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}     
	
		public static void  displayMenu() {
			System.out.println("*********************************************************");
			System.out.println("");
			System.out.println("\t\t\tWelcome to company Lockers - LockedMe.com");
			System.out.println("\t\t\tDeveloper name: Chirag Sharma");
			System.out.println("*********************************************************");
			System.out.println("1.\tDisplay all the files");
			System.out.println("2.\tAdd files to existing direcory");
			System.out.println("3.\tDelete a file");
			System.out.println("4.\tSearch a file");
			System.out.println("5.\tExit");
			System.out.println("*********************************************************");
		}
 public static void getAllFiles() {
	File[] listOfFiles = new File(projectPath).listFiles();
      if(listOfFiles.length==0)
	 System.out.println("NO files exist in the directory");
	  else {
	    for(File l:listOfFiles)
				  {
					  System.out.println(l.getName());
				  }
			  }
		}	
		public static void AddFiles() {
			try {
				Scanner obj=new Scanner(System.in);
				  String FileName;
				  int linesCount;
				  System.out.println("Enter file name");
				    FileName=obj.nextLine();
                  
				  System.out.println("Enter how many lines you want to add in the file");
				       linesCount=Integer.parseInt(obj.nextLine()); 
				 FileWriter fw=new FileWriter(projectPath+"\\"+FileName);
				   for(int i=1;i<=linesCount;i++) {
					   System.out.println("Enter file content line");
					   fw.write(obj.nextLine()+"\n");
				   }
				     System.out.println("File created successfully");
				     fw.close();
			}
			catch(Exception e){
				System.out.println("some error occured");
			}
		}
		public static void deleteFile() { 
			Scanner obj=new Scanner(System.in);
			
			try {
			   String FileName;
			  System.out.println("Enter file name to be deleted");
			      FileName=obj.nextLine();
			  File fl=new File(projectPath+"\\"+FileName);   
			     if (fl.exists()) {
			    	   fl.delete();
			    	   System.out.println("File deleted successfully");
			     }
			     else {
			    	 System.out.println("File not found");
			     }
			      
			}
			catch(Exception ex) {
				   System.out.println("some error ocured");
			}
			     
		}
		public static void searchFile() {
	         Scanner obj =new Scanner(System.in);
	       try {
	    	   String FileName;
				  System.out.println("Enter file name to search");
				      FileName=obj.nextLine();
				  File fl=new File(projectPath+"\\"+FileName);   
				     if (fl.exists()) {
				    	   
				    	   System.out.println("File is available");
				     }
				     else {
				    	 System.out.println("File is not available");
				     }
		     }  
	       catch(Exception ex) {
	    	   System.out.println("some error occured");
	       }
		}
		}			 
