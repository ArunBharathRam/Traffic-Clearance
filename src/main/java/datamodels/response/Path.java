package datamodels.response;

/**
 * Created by jmprathab on 20/11/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Path {

    @SerializedName("destination_addresses")
    @Expose
    private List<String> destinationAddresses = new ArrayList<String>();
    @SerializedName("origin_addresses")
    @Expose
    private List<String> originAddresses = new ArrayList<String>();
    @SerializedName("rows")
    @Expose
    private List<Row> rows = new ArrayList<Row>();
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     */
    public Path() {
    }

    /**
     * @param destinationAddresses
     * @param status
     * @param originAddresses
     * @param rows
     */
    public Path(List<String> destinationAddresses, List<String> originAddresses, List<Row> rows, String status) {
        this.destinationAddresses = destinationAddresses;
        this.originAddresses = originAddresses;
        this.rows = rows;
        this.status = status;
    }

    /**
     * @return The destinationAddresses
     */
    public List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    /**
     * @param destinationAddresses The destination_addresses
     */
    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }

    /**
     * @return The originAddresses
     */
    public List<String> getOriginAddresses() {
        return originAddresses;
    }

    /**
     * @param originAddresses The origin_addresses
     */
    public void setOriginAddresses(List<String> originAddresses) {
        this.originAddresses = originAddresses;
    }

    /**
     * @return The rows
     */
    public List<Row> getRows() {
        return rows;
    }

    /**
     * @param rows The rows
     */
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Path{");
        sb.append("destinationAddresses=").append(destinationAddresses);
        sb.append(", originAddresses=").append(originAddresses);
        sb.append(", rows=").append(rows);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
}
