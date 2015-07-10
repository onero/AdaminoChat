package adamino.com.adaminochat;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Adam on 08-07-2015.
 */
public class AdaminoChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "NRcddbXDTKlUz08bH1D987PAp94Pz4BGFNqCYx8c", "Ldyng0JrBUweRdUkc5rMc2CkQwNNWD8KMD16D4UK");

    }


}
