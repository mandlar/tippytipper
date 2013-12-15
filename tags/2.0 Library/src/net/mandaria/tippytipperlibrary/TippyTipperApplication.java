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

package net.mandaria.tippytipperlibrary;

import net.mandaria.tippytipperlibrary.errors.CustomExceptionHandler;
import net.mandaria.tippytipperlibrary.services.TipCalculatorService;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;

public class TippyTipperApplication extends Application {
	
	public TipCalculatorService service = new TipCalculatorService();
	
	// Use this variable to control if purchase links use Google PlayStore or Amazon Appstore 
	public final static boolean usePlayStoreLink = true;
	
	@Override
	public void onCreate()
	{
		Thread.setDefaultUncaughtExceptionHandler(new CustomExceptionHandler(getApplicationContext()));

		super.onCreate();
	}
	
	public static boolean isProVersion(Context context)
	{
		return context.getString(R.string.app_name).toLowerCase().contains("donate");
	}
	
	public static String getPaidVersionLink()
	{
		String url = "";
		if(usePlayStoreLink)
			url = "https://play.google.com/store/apps/details?id=net.mandaria.tippytipperdonate";
		else
		// For Amazon Appstore
			url = "http://www.amazon.com/gp/mas/dl/android?p=net.mandaria.tippytipperdonate";
		return url;
	}
	
	public static int getApplicationID(Context context)
	{
		int applicationID = 5; // free - play store
		if(TippyTipperApplication.getPaidVersionLink().contains("amazon"))
			applicationID = 6; // free - amazon
		
		return applicationID;
	}
	
	public static void SendEmail(Context context)
	{
		// Setup an intent to send email
		Intent sendIntent;
		sendIntent = new Intent(Intent.ACTION_SEND);
		sendIntent.setType("application/octet-stream");
		// Address
		sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { context.getString(R.string.email_address) });
		// Subject
		String appName = context.getString(R.string.app_name);
		String version = "";
		try
		{
			version = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
		}
		catch(NameNotFoundException e)
		{

		}

		sendIntent.putExtra(Intent.EXTRA_SUBJECT, appName + " " + version);
		// Body
		String body = "\n\n\n\n\n";
		body += context.getString(R.string.email_using_custom_rom) + "\n";
		body += "--------------------\n";
		body += context.getString(R.string.email_do_not_edit_message) + "\n\n";
		body += "BOARD: " + Build.BOARD + "\n";
		body += "BRAND: " + Build.BRAND + "\n";
		body += "CPU_ABI: " + Build.CPU_ABI + "\n";
		body += "DEVICE: " + Build.DEVICE + "\n";
		body += "DISPLAY: " + Build.DISPLAY + "\n";
		body += "FINGERPRINT: " + Build.FINGERPRINT + "\n";
		body += "HOST: " + Build.HOST + "\n";
		body += "ID: " + Build.ID + "\n";
		body += "MANUFACTURER: " + Build.MANUFACTURER + "\n";
		body += "MODEL: " + Build.MODEL + "\n";
		body += "PRODUCT: " + Build.PRODUCT + "\n";
		body += "TAGS: " + Build.TAGS + "\n";
		body += "TIME: " + Build.TIME + "\n";
		body += "TYPE: " + Build.TYPE + "\n";
		body += "USER: " + Build.USER + "\n";
		body += "VERSION.CODENAME: " + Build.VERSION.CODENAME + "\n";
		body += "VERSION.INCREMENTAL: " + Build.VERSION.INCREMENTAL + "\n";
		body += "VERSION.RELEASE: " + Build.VERSION.RELEASE + "\n";
		body += "VERSION.SDK: " + Build.VERSION.SDK + "\n";
		body += "VERSION.SDK_INT: " + Build.VERSION.SDK_INT + "\n";

		sendIntent.putExtra(Intent.EXTRA_TEXT, body);
		context.startActivity(Intent.createChooser(sendIntent, "Send Mail"));
	}
} 
