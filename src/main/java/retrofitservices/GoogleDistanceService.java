package retrofitservices;

import datamodels.response.Path;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jmprathab on 20/11/16.
 */
public interface GoogleDistanceService {

    String GOOGLE_DISTANCE_SERVICE_URL = "https://maps.googleapis.com/maps/api/distancematrix/";

    @GET("json?")
    Observable<Path> getPathData(@Query("origins") String origins, @Query("destinations") String destinations, @Query("key") String googleMapsApiKey);
}
