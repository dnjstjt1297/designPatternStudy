package 복습.adaptor;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties("/Users/kim-wonseok/프로그래밍/intelliJ-workspace/designPatternStudy/src/복습/adaptor/");
        fileIO.readFile("file.txt");
        fileIO.setValue("width","1024");
        fileIO.setValue("height","512");
        fileIO.setValue("depth","32");
        System.out.println("width: "+fileIO.getValue("width"));
        System.out.println("height: "+fileIO.getValue("height"));
        System.out.println("depth: "+ fileIO.getValue("depth"));
        fileIO.writeFile("newFile.txt");
        System.out.println("newfile.txt is created");


    }
}
