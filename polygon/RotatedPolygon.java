package polygon;

import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class RotatedPolygon extends AbstractPolygon implements IPolygon {
    private AbstractPolygon base;
    private double radians;

    RotatedPolygon(AbstractPolygon base, double radians) {
        this.base = base;
        this.radians = radians;
    }

    @Override
    public IPolygon translate(int x, int y) {
        return null;
    }

    @Override
    public IPolygon rotate(double radians) {
        
        return new RotatedPolygon(base, 
                this.radians + radians);
    }

    @Override
    public IPolygon scale(double x, double y) {
        return null;
    }

    @Override
    public List<Point> getPoints() {
        return getPointsWithBase(base);
    }

    @Override
    protected void manipulatePoint(Point center, Point p) {
        rotatePoint(center, p, this.radians);
    }

    private static void rotatePoint(Point center, Point point, double alpha) {
        double newX = center.x + (point.x - center.x) * Math.cos(alpha) - (point.y - center.y) * Math.sin(alpha);
        double newY = center.y + (point.x - center.x) * Math.sin(alpha) + (point.y - center.y) * Math.cos(alpha);
        point.x = (int) newX;
        point.y = (int) newY;
    }

    @Override
    public Point getCenterPoint() {
        return base.getCenterPoint();
    }
}
