package com.example.hybridapplication;
import android.webkit.WebSettings;
import android.app.Activity;
import com.example.hybridapplication.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView mainView = (WebView) findViewById(R.id.webviewMain);
		WebSettings setting = mainView.getSettings();
		setting.setJavaScriptEnabled(true);
		mainView.setWebViewClient(new MyCustomView());
		mainView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
		mainView.loadUrl("https://www.facebook.com");
				
	}
	private class MyCustomView extends WebViewClient{
		
		public boolean shouldOverrideUrlLoading(WebView view,String url)
		{
			view.loadUrl(url);
			return true;
		}
	}
	

	
}
