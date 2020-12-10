package polygon;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PolygonGroup implements IPolygon {
    private List<IPolygon> polygons;

    public PolygonGroup() {
        this.polygons = new ArrayList<>();
    }
    
    public PolygonGroup(List<IPolygon> polygons) {
        this.polygons = polygons;
    }

    @Override
    public @NotNull IPolygon translate(int x, int y) {
        List<IPolygon> newPolygons = polygons;
        newPolygons.replaceAll(p -> p.translate(x, y));
        return new PolygonGroup(newPolygons);
    }

    @Override
    public @NotNull IPolygon rotate(double radians) {
        return null;
    }

    @Override
    public @NotNull IPolygon scale(double x, double y) {
        return null;
    }

    @Override
    public @NotNull Point getCenterPoint() {
        return null;
    }

    @Override
    public void paint(Graphics g) {
        for (IPolygon p : polygons) {
            p.paint(g);
        }
    }

    public void add(IPolygon p) {
        polygons.add(p);
    }
}
