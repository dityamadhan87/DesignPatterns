package iteratorPattern.dinerMergerCafe;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
