package net.mandaria.tippytipperlibrary.tasks;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import android.content.Context;
import android.os.AsyncTask;

public class SendExceptionEmailTask extends AsyncTask<Void, Void, Void>
{
	private static String TAG = "TippyTipper";
	private Context _context;
	private String _stacktrace;
	private String _debug; 
	private String _application;

	private Exception ex;

	public SendExceptionEmailTask(Context context, String stacktrace, String debug, String application)
	{
		_context = context;
		_stacktrace = stacktrace;
		_debug = debug;
		_application = application;

	}

	// Posts debug info to website, which then sends a debug email to developer
	@Override
	protected Void doInBackground(Void... unused)
	{
		String url = "http://www.bryandenny.com/software/BugReport.aspx";
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("stacktrace", _stacktrace));
		nvps.add(new BasicNameValuePair("debug", _debug));
		nvps.add(new BasicNameValuePair("application", _application));
		try
		{
			httpPost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			httpClient.execute(httpPost);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
