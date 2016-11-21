package datamodels.response;

/**
 * Created by jmprathab on 20/11/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Distance {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("value")
    @Expose
    private Long value;

    /**
     * No args constructor for use in serialization
     */
    public Distance() {
    }

    /**
     * @param text
     * @param value
     */
    public Distance(String text, Long value) {
        this.text = text;
        this.value = value;
    }

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The value
     */
    public Long getValue() {
        return value;
    }

    /**
     * @param value The value
     */
    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Distance{");
        sb.append("text='").append(text).append('\'');
        sb.append(", value=").append(value);
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }
}