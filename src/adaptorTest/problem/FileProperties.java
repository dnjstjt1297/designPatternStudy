package adaptorTest.problem;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class FileProperties  extends Properties implements FileIO {
    String dirPath = "/Users/kim-wonseok/프로그래밍/intelliJ-workspace/designPatternStudy/src/adaptorTest/problem/";

    @Override
    public void readFromFile(String filename) {
        String filePath = dirPath+filename;
        File file = new File(filePath);
        try{
            FileReader fileReader = new FileReader(file);
            load(fileReader);
        } catch(FileNotFoundException e){
            System.out.println("파일 읽기 실패");
        } catch (IOException e) {
            System.out.println("파일 로드 실패");
        }
    }

    @Override
    public void writeToFile(String filename){
        String newFilePath = dirPath+filename;
        try {
            FileWriter fileWriter = new FileWriter(newFilePath);
            store(fileWriter, "written by FileProperties");
        }catch(IOException e){
            System.out.println("파일 쓰기 실패");
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
