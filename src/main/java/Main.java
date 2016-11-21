import datamodels.request.Coordinate;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofitservices.GoogleDistanceService;
import utilities.GoogleDistanceServiceHelper;

/**
 * Created by jmprathab on 20/11/16.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Retrofit retrofit = new Retrofit.Builder().
                addCallAdapterFactory(RxJavaCallAdapterFactory.create()).
                addConverterFactory(GsonConverterFactory.create()).
                baseUrl(GoogleDistanceService.GOOGLE_DISTANCE_SERVICE_URL).
                build();

        GoogleDistanceService service = retrofit.create(GoogleDistanceService.class);

        Coordinate[] list = GoogleDistanceServiceHelper.getInstance().getCoordinateList().getCoordinates();

        for (int i = 0; i < list.length - 1; i++) {
            Coordinate first = list[i];
            Coordinate second = list[i + 1];

            service.getPathData(first.getLatitude() + "," + first.getLongitude(),
                    second.getLatitude() + "," + second.getLongitude(),
                    GoogleDistanceServiceHelper.getInstance().getGoogleMapsApiKey())
                    //.observeOn(Schedulers.newThread())
                    //.subscribeOn(Schedulers.io())
                    .subscribe(path -> System.out.println(path.toString()));


        }
    }
}
