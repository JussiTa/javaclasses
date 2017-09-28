import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;




public class readFromFile{

     public static void main (String [] args){

	Path file = Paths.get("TextFile.txt");
	

	try{
	   BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8);	

	   String line;

	   while((line = reader.readLine()) !=null){
		System.out.println(line);

	   }

	   }catch (IOException e){

	      System.err.format("IOException %s%n",e);	
	   }

	
     
         

     }


}
  
