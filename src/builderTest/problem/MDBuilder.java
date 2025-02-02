package builderTest.problem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MDBuilder implements Builder {
    private String fileName = "undefined.md";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        fileName = title+".md";
        sb.append("# ");
        sb.append(title);
        sb.append("\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("__");
        sb.append(str);
        sb.append("__\n\n");
    }

    @Override
    public void makeItem(String[] items) {
        for(String s : items) {
            sb.append("- ");
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        try{
            Writer writer = new FileWriter(fileName);
            writer.append(sb.toString());
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getFileResult() {
        return sb.toString();
    }
}
