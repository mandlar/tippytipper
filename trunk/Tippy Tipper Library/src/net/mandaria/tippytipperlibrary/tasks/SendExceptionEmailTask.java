/*
 *	Tippy Tipper: mobile app to calculate tips
 *  Copyright (C) 2013 Bryan Denny
 *  
 *  This file is part of "Tippy Tipper"
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

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
