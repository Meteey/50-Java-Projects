package CurrencyRates;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class backend {
    public JsonObject ConnectAndGet(){
        String url_str = "https://api.exchangerate.host/latest";
        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonObject = root.getAsJsonObject();

            return jsonObject.getAsJsonObject("rates");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
