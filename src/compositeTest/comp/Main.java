package compositeTest.comp;

public class Main {
    public static void main(String[] args) {
        System.out.println("making root entries...");
        Directory root = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        root.add(bindir);
        root.add(tmpdir);
        root.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        root.printList();
        System.out.println();

        Directory lee = new Directory("lee");
        Directory kim = new Directory("kim");
        Directory park = new Directory("park");

        usrdir.add(lee);
        usrdir.add(kim);
        usrdir.add(park);

        lee.add(new File("diary.html", 100));
        lee.add(new File("composite.java", 200));
        kim.add(new File("memo.tex", 300));
        park.add(new File("game.doc", 400));
        park.add(new File("junk.mail",500));
        root.printList();

    }
}
