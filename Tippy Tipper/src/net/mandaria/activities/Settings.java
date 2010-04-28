package net.mandaria.activities;

import net.mandaria.R;
import net.mandaria.R.xml;
import android.os.Bundle;
import android.preference.*;

public class Settings extends PreferenceActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}
