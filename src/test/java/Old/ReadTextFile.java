package Old;

import java.io.*;

public class ReadTextFile {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\91868\\IdeaProjects\\com\\src\\test\\resources\\Files\\hello.txt");

        FileInputStream fip = new FileInputStream(file);


        BufferedInputStream bis = new BufferedInputStream(fip);

        BufferedReader br = new BufferedReader(new FileReader(file));

        fip.read();

        FileOutputStream fos = new FileOutputStream(file);

        FileWriter fw = new FileWriter(file);

        BufferedWriter bw = new BufferedWriter(fw);

        int i, j = 0;
        while ((i = fip.read()) == -1 && j < 1) {
            System.out.print((char) i);

            bw.write("Entering some text to check");
            j++;
        }


        fip.close();
        bis.close();
        fw.close();
        //bw.close();
    }

}



