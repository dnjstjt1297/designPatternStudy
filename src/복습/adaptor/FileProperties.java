package 복습.adaptor;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    String dirpath;
    public FileProperties(String dirpath) {
        this.dirpath = dirpath;
    }

    @Override
    public void readFile(String fileName) {
        String filepath = dirpath + fileName;
        File file = new File(filepath);

        try {
            Reader reader = new FileReader(file);
            load(reader);
        } catch (FileNotFoundException e ){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile(String fileName) {
        String filepath = dirpath + fileName;
        try{
            FileWriter fileWriter = new FileWriter(filepath);
            store(fileWriter,"written by FileProperties");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
