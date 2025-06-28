package iteratorPattern.dinerMergeri;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
