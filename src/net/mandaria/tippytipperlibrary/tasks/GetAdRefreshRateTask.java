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

import java.util.Locale;

import net.mandaria.tippytipperlibrary.TippyTipperApplication;
import net.mandaria.tippytipperlibrary.activities.Settings;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;


public class GetAdRefreshRateTask extends AsyncTask<Void, Integer, Integer> 
{
	private static String TAG = "TippyTipper";
	private Context _context;
	private Locale _locale;
	private Application _application;
	private Exception ex;
	
	

    public GetAdRefreshRateTask(Application application, Context context, Locale locale) 
    {
    	_context = context;
    	_locale = locale;
    	_application = application;
    }

	@Override
	protected Integer doInBackground(Void... unused) 
	{
		int adRefreshRate = -1;
		try 
		{
			String SOAP_ACTION = "http://www.bryandenny.com/software/android/GetAdRefreshRateByApplicationID";
		    String METHOD_NAME = "GetAdRefreshRateByApplicationID";
		    String NAMESPACE = "http://www.bryandenny.com/software/android/";
		    String URL = "http://www.bryandenny.com/software/android/service.asmx";

		    int applicationID = TippyTipperApplication.getApplicationID(_context);
		    
			SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
			request.addProperty("applicationID", applicationID);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet=true;
            envelope.setOutputSoapObject(request);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

            androidHttpTransport.call(SOAP_ACTION, envelope);

            //SoapObject result = (SoapObject)envelope.getResponse();
            SoapPrimitive result = (SoapPrimitive)envelope.getResponse();

            //to get the data
            adRefreshRate = Integer.parseInt(result.toString());
            // 0 is the first object of data 
            
            Log.e(TAG, "New ad refresh rate: " + adRefreshRate);
		}
		catch(Exception e)
		{
			ex = e;
			Log.e(TAG, "FAIL: New ad refresh rate: " + e);
		}
		
		return adRefreshRate;
	}

	@Override
	protected void onProgressUpdate(Integer... item) 
	{

	}

	@Override
	protected void onPostExecute(Integer result) 
	{
		TippyTipperApplication appState = ((TippyTipperApplication)_application);
		if(result != -1)
		{
			 Log.e(TAG, "Post execute: " + result);
			Settings.setAdRefreshRate(_context, result);
		}
		else
		{
			Log.e(TAG, "FAIL: Post execute: " + result);
		}
		
		if(ex != null)
			Log.e(TAG, "FAIL: EXCEPTION: Post execute: " + ex);
		
	}
}
