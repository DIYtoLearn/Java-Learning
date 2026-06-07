package NewIDEAS;
import static NewIDEAS.API_KEY.API_KEY1;
import java.io.*;
import java.util.concurrent.TimeUnit;
import okhttp3.*;

public class CricKet {
    public static void main(String []args) throws IOException {
        // 1. Increased timeout to 10 SECONDS to give the connection time to establish
        OkHttpClient client = new OkHttpClient().newBuilder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .readTimeout(3, TimeUnit.SECONDS)
                .build();

        Request request = new Request.Builder()
                .url("https://cricket-api-free-data.p.rapidapi.com/cricket-schedule-international")
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("x-rapidapi-host", "cricket-api-free-data.p.rapidapi.com")
                .addHeader("x-rapidapi-key", API_KEY1())
                .build();

        // 2. Wrap the network call in a try-with-resources block to automatically close connections
        try (Response response = client.newCall(request).execute()) {
            if (response.body() != null) {
                // 3. Changed .toString() to .string() to extract the raw JSON response text
                System.out.println(response.body().string());
            } else {
                System.out.println("Response body is null");
            }
        }
    }
}
