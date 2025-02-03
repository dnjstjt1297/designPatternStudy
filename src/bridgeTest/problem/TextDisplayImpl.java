package bridgeTest.problem;

import java.io.*;

public class TextDisplayImpl extends DisplayImpl {
    private String divpath;
    private String filename;

    private File file;

    public TextDisplayImpl(String divpath, String filename) {
        this.divpath = divpath;
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        file = new File(divpath+"/"+filename);
        if(file.exists()) {
            System.out.println("---------------"+filename+"파일을 엽니다.----------------");
        }
    }

    @Override
    public void rawPrint() {
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("---------------"+filename+"파일을 닫습니다.---------------");
    }
}
