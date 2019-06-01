import org.junit.Assert;
import org.junit.Test;

public class DrawBoxTests {
    @Test(expected = IndexOutOfBoundsException.class)
    public void GetBoxTest()
    {
        String[][] box = DrawBox.GetBox(5,6);
        Assert.assertEquals("┌",box[0][0]);
        Assert.assertEquals("-", box[0][4]);
        Assert.assertEquals("|\n", box[2][5]);
        Assert.assertEquals(" ", box[3][3]);
        String s = box[4][7];

    }
    @Test(expected = Exception.class)
    public void GetBoxInvalidParameterTest()
    {
        String[][] box = DrawBox.GetBox(1,1);
    }
}
