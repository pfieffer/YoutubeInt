package np.com.ravi.youtubeint;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ravi on 11/16/17.
 */

public class Utility {
    public static String getProperty(String key,Context context) throws IOException {
        Properties properties = new Properties();;
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("youtube.properties");
        properties.load(inputStream);
        return properties.getProperty(key);
    }
}
