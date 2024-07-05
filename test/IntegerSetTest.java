import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest {
    IntegerSet set1 = new IntegerSet();
    IntegerSet set2 = new IntegerSet();

    @Test
    void union() {
        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);
        set2.insertElement(30);
        set2.insertElement(40);
        set2.insertElement(50);
        var unionSet = IntegerSet.union(set1, set2);
        assertEquals("10 20 30 40 50", unionSet.toSetString());
    }

    @Test
    void interseccion() {
        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);
        set2.insertElement(30);
        set2.insertElement(40);
        set2.insertElement(50);
       var interseccionSet = IntegerSet.interseccion(set1, set2);
       assertEquals("30", interseccionSet.toSetString());
    }

    @Test
    void insertElement() {
        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);
        assertEquals("10 20 30", set1.toSetString());
    }

    @Test
    void deleteElement() {
        set2.insertElement(30);
        set2.insertElement(40);
        set2.insertElement(50);
        set2.deleteElement(50);
        assertEquals("30 40", set2.toSetString());

    }

    @Test
    void toSetString() {
        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);
        assertEquals("10 20 30", set1.toSetString());
    }

    @Test
    void equalTo() {
        assertFalse(set1.equals(set2));
    }
}