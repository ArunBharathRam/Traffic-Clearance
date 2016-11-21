package datamodels.response;

/**
 * Created by jmprathab on 20/11/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Row {

    @SerializedName("elements")
    @Expose
    private List<Element> elements = new ArrayList<Element>();

    /**
     * No args constructor for use in serialization
     */
    public Row() {
    }

    /**
     * @param elements
     */
    public Row(List<Element> elements) {
        this.elements = elements;
    }

    /**
     * @return The elements
     */
    public List<Element> getElements() {
        return elements;
    }

    /**
     * @param elements The elements
     */
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Row{");
        sb.append("elements=").append(elements);
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
}