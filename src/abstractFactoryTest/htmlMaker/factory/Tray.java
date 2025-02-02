package abstractFactoryTest.htmlMaker.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{
    protected List<Item> tray = new ArrayList<>();

    public Tray(String Caption) {
        super(Caption);
    }

    public void addItem(Item item) {
        tray.add(item);
    }

}
