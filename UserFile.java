package sample;

import java.io.File;
import java.io.FileWriter;

public class UserFile {
    File file;

    public void writeFile(String s){

        try{
            file=new File("UserData.txt");

            if(!file.exists()) {

                file.createNewFile();

                FileWriter writeFile=new FileWriter(file);

                writeFile.write("User1 abc1 123\n");
                writeFile.write("User2 abc2 456\n");
                writeFile.write("User3 abc3 789\n");
                writeFile.close();
            }

            else{
                FileWriter appendFile=new FileWriter(file, true);
                appendFile.write(s);
                appendFile.close();
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }

    }

}

