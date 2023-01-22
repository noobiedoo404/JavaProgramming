package FileHandling;

import com.sun.security.jgss.GSSUtil;

import java.io.*;

public class CreateWriteReadDelete {
    public static void main(String[] args) throws IOException {
        CreateFile();
        WriteFile();
        ReadFile();
        WriteFile();
        ReadFile();
        DeleteFile();
    }

    static void CreateFile() throws IOException {
        File file = new File("dummy2.txt");
        if (file.createNewFile()) {
            System.out.println(file.getName() + " created!");
        } else {
            System.out.println(file.getName() + " already exists.");
        }
    }

    static void WriteFile() throws IOException {
        FileWriter writer = new FileWriter("dummy2.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        writer.write(br.readLine());
        writer.close();

    }

    static void ReadFile() throws IOException {
        File file = new File("dummy2.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }

    static void DeleteFile() {
//        File file=new File("dummy2.txt");
//        System.out.println(file.delete());
        try {

            // Get the file
            File f = new File("dummy2.txt");

            // delete file
            if (f.exists()) {
                System.out.println("file exists");
                if (f.delete()) {
                    System.out.println("file deleted!");
                } else {
                    System.out.println("couldn't delete the file");
                }
            } else
                System.out.println("File not there");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

