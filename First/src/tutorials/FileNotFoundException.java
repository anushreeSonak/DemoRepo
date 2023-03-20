package tutorials;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException
{

	public static void main(String args[]) throws IOException 
	{		
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file); 
	}
}

