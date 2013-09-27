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
} 
