package pe.edu.tecsup.flashbrowser.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;



import java.net.URL;

import pe.edu.tecsup.flashbrowser.R;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent intent=getIntent();
        Uri data=intent.getData();
        URL url = null;
        try {
            url = new URL(data.getScheme(),
                    data.getHost(),
                    data.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebView web=findViewById(R.id.webView);
        web.loadUrl(url.toString());
//        web.loadUrl("https://www.tecsup.edu.pe");


    }
}