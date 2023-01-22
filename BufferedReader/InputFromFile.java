package BufferedReader;

import java.io.*;

/*BufferedReader reads text from a character-input stream,buffering characters to provide
 efficient reading of characters, arrays, and lines.
the buffer size may be specified, or the default size may be used.

Constructor
BufferedReader(Reader in)
Creates a buffering character-input stream that uses a default-sized input buffer.
BufferedReader(Reader in, int size)
creates a buffering character-input stream that uses an input buffer of the specified size.*/


//taking input from file
public class InputFromFile {

    //if you want to use BufferedReader in a function, you need to throw Exception
    public static void main(String[] args) throws IOException {

        //creation of file
        File file = new File("dummy.txt");
        FileWriter writer = new FileWriter(file);

        //to check whether the file is created or already exists.
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        //for reading value from the console to write in the file
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        //writing in the file
        System.out.println("write the content in the file");
        writer.write(br.readLine());
        writer.close();

        //reading from the file
        FileReader fr = new FileReader(file);
        BufferedReader brFileReader = new BufferedReader(fr);
        String line = "";
        System.out.println("content of the file is: ");
        while ((line = brFileReader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
