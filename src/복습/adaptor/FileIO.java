package 복습.adaptor;

public interface FileIO {
    public abstract void readFile(String fileName);
    public abstract void writeFile(String fileName);
    public abstract void setValue(String key, String value);
    public abstract String getValue(String key);
}
