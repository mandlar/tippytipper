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

package net.mandaria.tippytipperlibrary.preferences;

import net.mandaria.tippytipperlibrary.R;
import net.mandaria.tippytipperlibrary.widgets.NumberPicker;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class NumberPickerPreference extends DialogPreference
{
	private static final String androidns = "http://schemas.android.com/apk/res/android";
	private static final String appns = "http://schemas.android.com/apk/res/net.mandaria.tippytipperlibrary";

	private NumberPicker mPickInteger;
	private TextView mSplashText, mValueText;
	private Context mContext;

	private String mDialogMessage, mSuffix;
	private int mDefault, mMin, mMax, mValue = 0;

	public NumberPickerPreference(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		mContext = context;

		mDialogMessage = attrs.getAttributeValue(androidns, "dialogMessage");
		mSuffix = attrs.getAttributeValue(androidns, "text");
		mDefault = attrs.getAttributeIntValue(androidns, "defaultValue", 0);
		mMax = attrs.getAttributeIntValue(androidns,"max", 100);
	    
	    TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SeekBarPreference);
	    mMin = a.getInt(R.styleable.SeekBarPreference_min, 0);
	}

	@Override
	protected View onCreateDialogView()
	{
		TableLayout.LayoutParams params;
		TableLayout layout = new TableLayout(mContext);
		layout.setPadding(6, 6, 6, 6);

		mSplashText = new TextView(mContext);
		if (mDialogMessage != null)
			mSplashText.setText(mDialogMessage);

		TableRow row_header = new TableRow(mContext);
		row_header.addView(mSplashText);

		mPickInteger = new NumberPicker(mContext);
		mPickInteger.setRange(mMin, mMax);

		TextView suffix = new TextView(mContext);
		suffix.setText(mSuffix);
		suffix.setTextSize(32);

		TableRow row_one = new TableRow(mContext);
		row_one.setGravity(Gravity.CENTER);
		row_one.addView(mPickInteger);
		row_one.addView(suffix);

		layout.addView(row_header);

		TableLayout table_main = new TableLayout(mContext);
		table_main.addView(row_one);

		TableRow row_main = new TableRow(mContext);
		row_main.setGravity(Gravity.CENTER_HORIZONTAL);
		row_main.addView(table_main);

		layout.addView(row_main);

		if (shouldPersist())
			mValue = getPersistedInt(mDefault);

		bindData();

		return layout;
	}

	private void bindData()
	{
		try
		{
			mPickInteger.setCurrent(mValue);
		}
		catch (Exception ex)
		{
			
		}
	}

	@Override
	protected void onBindDialogView(View v)
	{
		super.onBindDialogView(v);
		bindData();
	}

	@Override
	protected void onSetInitialValue(boolean restore, Object defaultValue)
	{
		super.onSetInitialValue(restore, defaultValue);
		if (restore)
		{
			try
			{
				mValue = shouldPersist() ? getPersistedInt(mDefault) : 0;
			}
			catch (Exception ex)
			{
				mValue = mDefault;
			}
		}
		else
			mValue = (Integer) defaultValue;
	}

	@Override
	protected void onDialogClosed(boolean positiveResult)
	{
		if (positiveResult == true)
		{
			super.onDialogClosed(positiveResult);
			// HACK: "click" both picker inputs to validate inputs before closing the dialog
			// this is to fix a problem of closing the dialog not causing the onFocusChange of the picker
			// to be called
			mPickInteger.onClick(null);
			mValue = mPickInteger.getCurrent();
			if (shouldPersist())
				persistInt(mValue);
		}
	}
}
