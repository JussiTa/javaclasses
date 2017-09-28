import java.io.*;

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;





public class readFromFileByStream{

     public static void main (String[] args){

        Path file = Paths.get("TextFile.txt");

	try{
           InputStream in = Files.newInputStream(file);
	   BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	   String line = null;

	   while((line= reader.readLine())!=null)
	      System.out.println(line);

	}catch(IOException e){

	   System.err.println(e);

        }




     }

}
