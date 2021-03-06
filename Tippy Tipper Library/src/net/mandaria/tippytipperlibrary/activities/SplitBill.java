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

import java.util.HashMap;
import java.util.Map;

import net.mandaria.tippytipperlibrary.R;
import net.mandaria.tippytipperlibrary.TippyTipperApplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.flurry.android.FlurryAgent;

public class SplitBill extends SherlockActivity {


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splitbill);  

		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());

		splitBill(appState.service.getNumberOfPeople());

		View btn_add_person = findViewById(R.id.btn_add_person);
		btn_add_person.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				addPerson();
				FlurryAgent.onEvent("Add Person Button");
			}
		});

		View btn_remove_person = findViewById(R.id.btn_remove_person);
		btn_remove_person.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				removePerson();
				FlurryAgent.onEvent("Remove Person Button");
			}
		});

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

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		super.onCreateOptionsMenu(menu);

		//MenuInflater inflater = getMenuInflater();
		//inflater.inflate(R.menu.menu, menu);
		FlurryAgent.onEvent("Disabled Menu Button");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.settings)
		{
			startActivity(new Intent(this, Settings.class));
			FlurryAgent.onEvent("Settings Button");
			return true;
		}
		return false;
	}

	private void addPerson()
	{
		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		int people = appState.service.getNumberOfPeople() + 1;

		splitBill(people); 	


	}

	private void removePerson()
	{
		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		int people = appState.service.getNumberOfPeople() - 1;

		if(people > 1)
			splitBill(people);
	}

	private void splitBill(int people)
	{
		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
		appState.service.splitBill(people);

		bindData();
	}

	private void bindData()
	{
		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());

		TextView lbl_split_amount = (TextView)findViewById(R.id.lbl_split_amount);
		TextView lbl_split_tip = (TextView)findViewById(R.id.lbl_split_tip);
		TextView lbl_split_adjustment = (TextView)findViewById(R.id.lbl_split_adjustment);
		TextView lbl_split_total = (TextView)findViewById(R.id.lbl_split_total);
		TextView lbl_NumberOfPeople = (TextView)findViewById(R.id.lbl_NumberOfPeople);

		View inflated_splitTax = findViewById(R.id.inflated_splitTax);

		float excludeTaxRate = Settings.getExcludeTaxRate(getBaseContext());
		if(excludeTaxRate != 0)
		{
			ViewStub stub_splitTax = (ViewStub)findViewById(R.id.stub_splitTax);
			if(stub_splitTax != null)
				stub_splitTax.setVisibility(View.VISIBLE);
			else if(inflated_splitTax != null)
				inflated_splitTax.setVisibility(View.VISIBLE);
			TextView lbl_split_tax = (TextView)findViewById(R.id.lbl_split_tax);
			lbl_split_tax.setText(appState.service.getSplitTaxAmount());
		}
		else
		{
			if(inflated_splitTax != null)
				inflated_splitTax.setVisibility(View.GONE);
		}

		lbl_split_amount.setText(appState.service.getSplitBillAmount());
		lbl_split_tip.setText(appState.service.getSplitTipAmount());
		lbl_split_adjustment.setText(appState.service.getSplitAdjustment());
		lbl_split_total.setText(appState.service.getSplitTotalAmount());
		lbl_NumberOfPeople.setText(Integer.toString(appState.service.getNumberOfPeople()));

		Map<String, String> params = new HashMap<String, String>();
		params.put("Number of People", String.valueOf(appState.service.getNumberOfPeople()));
		params.put("Split Bill Amount", appState.service.getSplitBillAmount());
		params.put("Split Tax Amount", appState.service.getSplitTaxAmount());
		params.put("Split Tip Amount", appState.service.getSplitTipAmount());
		params.put("Split Adjustment Amount", appState.service.getSplitAdjustment());
		params.put("Split Total Amount", appState.service.getSplitTotalAmount());
		FlurryAgent.onEvent("Split Bill Bind Data", params);

	}
}
