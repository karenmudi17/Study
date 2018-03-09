package test.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistEqualsTests {

    @Test
    public void testArea() {
        Point p1 = new Point(1, 7);
        Point p2 = new Point(4, 3);
        Assert.assertEquals(p1.dist(p2), 5.0);
        }
    }
