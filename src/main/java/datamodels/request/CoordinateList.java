package datamodels.request;

import java.util.Arrays;

/**
 * Created by jmprathab on 21/11/16.
 */
public class CoordinateList {
    Coordinate[] coordinates;

    public CoordinateList(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoordinateList{");
        sb.append("coordinates=").append(Arrays.toString(coordinates));
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
}
