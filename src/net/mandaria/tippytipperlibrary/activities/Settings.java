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

package net.mandaria.tippytipperlibrary.activities;

import net.mandaria.tippytipperlibrary.R;
import net.mandaria.tippytipperlibrary.TippyTipperApplication;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.flurry.android.FlurryAgent;

public class Settings extends SherlockPreferenceActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
	
	@Override
	public void onStart()
    {
       super.onStart();
       boolean enableErrorLogging = Settings.getEnableErrorLogging(getBaseContext());
       String API = getString(R.string.flurrykey);
       if(!API.equals("") && enableErrorLogging == true)
       {
    	   FlurryAgent.setContinueSessionMillis(30000);
    	   FlurryAgent.onStartSession(this, API);
       }
    }
    
    @Override
	public void onStop()
    {
       super.onStop();
       FlurryAgent.onEndSession(this);
    }
	
	public static int getDefaultTipPercentage(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("default_tip_percentage", 15);
	}
	
	public static int getTipPercentagePresetOne(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("tip_percentage_one", 10);
	}
	
	public static int getTipPercentagePresetTwo(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("tip_percentage_two", 15);
	}
	
	public static int getTipPercentagePresetThree(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("tip_percentage_three", 20);
	}
	
	public static int getDefaultNumberOfPeopleToSplitBill(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("default_number_of_people", 2);
	}
	
	public static boolean getEnableErrorLogging(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("enable_error_logging", true);
	}
	
	public static boolean getEnableAds(Context context)
	{
		boolean adsEnabledByDefault = true;
		
		if(TippyTipperApplication.isProVersion(context))
			adsEnabledByDefault = false;
		
		return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("enable_ads", adsEnabledByDefault);
	}
	
	public static boolean getEnableExcludeTaxRate(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("enable_exclude_tax_rate", false);
	}
	
	public static boolean isSetToRoundByTip(Context context)
	{
		String RoundType = PreferenceManager.getDefaultSharedPreferences(context).getString("round_type", "round_total");
		if(RoundType.equals("round_tip"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static float getExcludeTaxRate(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getFloat("exclude_tax", 0);
	}
	
	// Ad Refresh Rate, in miliseconds
	
	public static int getAdRefreshRate(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("ad_refresh_rate", 60000);
	}
	  
	public static void setAdRefreshRate(Context context, int adRefreshRate)
	{
		PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("ad_refresh_rate", adRefreshRate).commit();
	}
	
	// In House Ads Percentage
	
	public static int getInHouseAdsPercentage(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("in_house_ads_percentage", 0);
	}
	
	public static void setInHouseAdsPercentage(Context context, int inHouseAdsPercentage)
	{
		PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("in_house_ads_percentage", inHouseAdsPercentage).commit();
	}
}
