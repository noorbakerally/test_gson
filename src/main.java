import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws JsonSyntaxException 
	 */
	public static void main(String[] args) throws JsonSyntaxException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
        Gson gson = new Gson();  
        String content = new Scanner (new File("files/person.txt")).useDelimiter("\\Z").next();
        Person me = gson.fromJson(content, Person.class);
        System.out.println("Name: "+me.name);
        System.out.println("Contact Numbers:");
        for (String contactNumber:me.contactNumber){
        	System.out.println("      "+contactNumber);
        }
        
		
		
		
	}

}
