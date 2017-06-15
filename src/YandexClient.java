import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by pavel on 15.06.17.
 */
public class YandexClient {
    private final String queryTemplate = "https://yandex.ru/search/?text=";

    public String query(String query) {
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(queryTemplate + query);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}
