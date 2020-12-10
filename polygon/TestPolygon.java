package polygon;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPolygon {
    public void dummy() {
        java.util.List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));

        IPolygon p = new ScaledPolygon(
                new RotatedPolygon(
                        new BasePolygon(points), 
                        1),
                2, 4);
        IPolygon p2 = new BasePolygon(points)
                .rotate(1)
                .scale(2 ,4);
        IPolygon p3 = new PolygonGroup(Arrays.asList(p, p2));
        IPolygon p4 = new PolygonGroup(Arrays.asList(p, p3));
        
    }
}
