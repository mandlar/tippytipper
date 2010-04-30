package net.mandaria.activities;

import net.mandaria.R;
import net.mandaria.R.xml;
import android.os.Bundle;
import android.preference.*;
import android.content.Context;

public class Settings extends PreferenceActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
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
}
