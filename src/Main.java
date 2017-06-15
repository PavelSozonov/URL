import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by pavel on 15.06.17.
 */
public class Main {
    public static void main(String[] args) {
        YandexClient client = new YandexClient();
        String response = client.query("java");
        System.out.println(response);
    }
}
