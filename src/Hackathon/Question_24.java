package Hackathon;

import java.io.*;

public class Question_24 {
    public static void main(String[] arg){
        String path ="C:\\Users\\vinnu\\OneDrive\\Desktop\\";
        String file_name ="hackathon.txt";
        String new_path="C:\\Vinaya\\";
        String newFilename="reversehackathon.txt";
        File file1= new File("reversehackathon.txt");
        try {
            FileReader reader = new FileReader(path+file_name);
            FileWriter writer1 = new FileWriter(new_path+file1);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedWriter bw = new BufferedWriter(writer1);
            String line;
            String str_line[] = new String[256];
            int i=0;
            while ((line=bf.readLine())!=null){
                str_line[i]=line;//reading into an array of String - first element - first line
                // System.out.println(line);
                i=i+1;
            }
            //System.out.println(i+" lines");
            int j=(i-1);
            //to print in reverser order on the console
            while(j>=0) {
               // System.out.println(str_line[j]);
                String data=str_line[j];
                writer1.write(data);
                 j=j-1;
            }
            bf.close();
        }

        catch (IOException e){
            System.out.println(e.getMessage());

        }

    }
}

