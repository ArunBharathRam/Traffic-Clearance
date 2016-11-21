package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import datamodels.request.CoordinateList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * Created by jmprathab on 20/11/16.
 * Singleton Helper class which builds Coordinate class object from coordinates.json file
 */
public class GoogleDistanceServiceHelper {
    private static GoogleDistanceServiceHelper ourInstance = new GoogleDistanceServiceHelper();
    CoordinateList coordinateList;
    String googleMapsApiKey;

    private GoogleDistanceServiceHelper() {
        try {
            File coordinatesJson = new File(this.getClass().getResource("/coordinates.json").toURI());
            Gson gson = new GsonBuilder().create();
            coordinateList = gson.fromJson(new FileReader(coordinatesJson), CoordinateList.class);
            File googleMapsApiKeyProperties = new File(this.getClass().getResource("/GoogleMapsAPIKey.properties").toURI());
            Properties apiKey = new Properties();
            apiKey.load(new FileInputStream(googleMapsApiKeyProperties));
            googleMapsApiKey = apiKey.getProperty("GoogleMapsAPIKey");

        } catch (java.io.IOException e) {
            System.out.println("FileNotFoundException inside GoogleDistanceServiceHelper's Constructor : " + e.getMessage());
        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException inside GoogleDistanceServiceHelper's Constructor : " + e.getMessage());
        }
    }

    public static GoogleDistanceServiceHelper getInstance() {
        return ourInstance;
    }

    public String getGoogleMapsApiKey() {
        return googleMapsApiKey;
    }

    public CoordinateList getCoordinateList() {
        return coordinateList;
    }

    public void setCoordinateList(CoordinateList coordinateList) {
        this.coordinateList = coordinateList;
    }
}
