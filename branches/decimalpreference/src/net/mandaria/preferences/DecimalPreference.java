package net.mandaria.preferences;

/* The following code was written by Matthew Wiggins 
 * and is released under the APACHE 2.0 license 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 */

import net.mandaria.*;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.preference.DialogPreference;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.content.res.*;

public class DecimalPreference extends DialogPreference
{
  private static final String androidns="http://schemas.android.com/apk/res/android";
  private static final String appns="http://schemas.android.com/apk/res/net.mandaria";

  private TextView mSplashText,mValueText;
  private EditText mEditInteger, mEditDecimal;
  private Context mContext;

  private String mDialogMessage, mSuffix;
  private float mDefault, mMax, mMin, mValue = 0;
  private int mInteger, mDecimal = 0;

  public DecimalPreference(Context context, AttributeSet attrs) { 
    super(context,attrs); 
    mContext = context;

    mDialogMessage = attrs.getAttributeValue(androidns,"dialogMessage");
    mSuffix = attrs.getAttributeValue(androidns,"text");
    mDefault = attrs.getAttributeIntValue(androidns,"defaultValue", 0);
    mMax = attrs.getAttributeIntValue(androidns,"max", 100);
    
    TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SeekBarPreference);
    mMin = a.getInt(R.styleable.SeekBarPreference_min, 0);
    mMax = mMax - mMin;
  }
  
  @Override 
  protected View onCreateDialogView() {
    TableLayout.LayoutParams params;
    //LinearLayout layout = new LinearLayout(mContext);
    TableLayout layout = new TableLayout(mContext);
    //layout.setOrientation(LinearLayout.VERTICAL);
    layout.setPadding(6,6,6,6);

    mSplashText = new TextView(mContext);
    if (mDialogMessage != null)
      mSplashText.setText(mDialogMessage);
    
    TableRow row_header = new TableRow(mContext);
    row_header.addView(mSplashText);
    
    mEditInteger = new EditText(mContext);
    
    mEditDecimal = new EditText(mContext);
    
    TextView dot = new TextView(mContext);
    dot.setText(".");
    
    TextView percent = new TextView(mContext);
    percent.setText("%");
    
    TableRow row_one = new TableRow(mContext);
    row_one.addView(mEditInteger);
    row_one.addView(dot);
    row_one.addView(mEditDecimal);
    row_one.addView(percent);
    
    layout.addView(row_header);
    
    TableLayout table_main = new TableLayout(mContext);
    table_main.addView(row_one);
    
    TableRow row_main = new TableRow(mContext);
    row_main.addView(table_main);
    
    layout.addView(row_main);

    if (shouldPersist())
      mValue = getPersistedFloat(mDefault);

      BindData();
    
    return layout;
  }
  
  private void BindData()
  {
	  mInteger = (int)Math.floor((double)mValue);
	  mDecimal = (int)((mValue - mInteger) * 100);
	  try
	  {
		  mEditInteger.setText(Integer.toString(mInteger));
		  mEditDecimal.setText(Integer.toString(mDecimal));
	  }
	  catch(Exception ex)
	  {
		  int test = 0;
		  test++;
	  }
  }
  @Override 
  protected void onBindDialogView(View v) {
    super.onBindDialogView(v);
    BindData();
  }
  
  @Override
  protected void onSetInitialValue(boolean restore, Object defaultValue)  
  {
    super.onSetInitialValue(restore, defaultValue);
    if (restore) 
    {
      try
      {
    	  mValue = shouldPersist() ? getPersistedFloat(mDefault) : 0;
    	  BindData();
      }
      catch(Exception ex)
      {
    	  mValue = mDefault;
      }
    }
    else 
      mValue = (Float)defaultValue;
  }
  
  @Override
  protected void onDialogClosed(boolean positiveResult) 
  {
	  if(positiveResult == true)
	  {
		  super.onDialogClosed(positiveResult);
		  String value = mEditInteger.getText() + "." + mEditDecimal.getText();//mInteger + "." + mDecimal;
		  mValue = Float.valueOf(value);
		  if (shouldPersist())
			  persistFloat(mValue);
	  }
  }

  public void setMax(int max) { mMax = max; }
  public float getMax() { return mMax; }
  
  public void setMin(int min) {mMin = min;}
  public float getMin() { return mMin;}
}
