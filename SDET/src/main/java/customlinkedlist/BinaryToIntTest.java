package customlinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class BinaryToIntTest {
    @Test
    public void testData(){
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(0);
        list.addNode(1);
        Assert.assertEquals(5,list.binaryListToInt());

    }
}
