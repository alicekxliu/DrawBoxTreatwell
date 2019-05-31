import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DrawBoxTests {
    @Test
    public void DrawBoxTest() throws FileNotFoundException
    {
        String fileName = "four-three-box.txt";
        DrawBox.DrawBox(4,3, fileName);
        int height = 0;
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
            height++;
        }
        sc.close();
        Assert.assertEquals(height,4);


    }

    @Test(expected = Exception.class)
    public void DrawBoxTestInvalidParameterTests()
    {
        DrawBox.DrawBox(1,1, "file.txt");
    }
}
