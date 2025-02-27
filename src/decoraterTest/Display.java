package decoraterTest;

public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);

    public void show(){
        for(int row = 0; row < getRows(); row++){
            System.out.println(getRowText(row));
        }
    }
}
