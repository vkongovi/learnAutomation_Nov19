package Day7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileIO {
    public static void main(String[] arg){
        String path ="C:\\Users\\vinnu\\OneDrive\\Desktop\\";
        String file_name ="hackathon.txt";
        try {
            FileReader reader = new FileReader(path+file_name);
            BufferedReader bf = new BufferedReader(reader);
            String line;
            String str_line[] = new String[256];
            int i=0;
            while ((line=bf.readLine())!=null){
                str_line[i]=line;//reading into an array of String - first element - first line
               // System.out.println(line);
                i=i+1;
            }
            System.out.println(i+" lines");
            int j=(i-1);
            //to print in reverser order on the console
            while(j>=0){
               System.out.println(str_line[j]);
               j=j-1;

            }
            bf.close();
        }

        catch (IOException e){
            System.out.println(e.getMessage());

        }

    }
}
