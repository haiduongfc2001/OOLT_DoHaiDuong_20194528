package AimsProject.hust.soict.hedspi.garbage;

import java.io.*;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E://Java/text.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer s = new StringBuffer();
        while (br.ready()) {
            s.append(br.readLine());
        }
        System.out.println(System.currentTimeMillis() - start);
        br.close();
        isr.close();
        fis.close();
    }
}
