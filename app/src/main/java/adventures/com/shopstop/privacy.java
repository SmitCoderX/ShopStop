package adventures.com.shopstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class privacy extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        webView=(WebView)findViewById(R.id.webview);
        webView.loadUrl("https://www.kookyinfomedia.com");
    }
}
