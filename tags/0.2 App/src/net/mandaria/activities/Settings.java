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
	
	public static int getDefaultNumberOfPeopleToSplitBill(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getInt("default_number_of_people", 2);
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
}
