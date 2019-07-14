package com.example.alc4.o;



import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Main1Activity extends Activity {
	WebView mywebview;
	ProgressBar pbar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		WebView mywebview = (WebView) findViewById(R.id.webView1);
		pbar =(ProgressBar) findViewById(R.id.progressBar1);
		WebSettings webSettings =mywebview.getSettings();
		webSettings.setJavaScriptEnabled(true);
		mywebview.loadUrl("http://andela.com/alc");
		mywebview.setWebViewClient(new WebViewClient());
	}
	
	/*@Override
	public void onBackPressed (){
		if(mywebview.canGoBack()){
			mywebview.goBack();	
		}else{
			Intent intent = new Intent(Main1Activity.this,com.example.alc4.o.MainActivity.class); 
			startActivity(intent);
	}}*/
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main1, menu);
		return true;
	}

}
