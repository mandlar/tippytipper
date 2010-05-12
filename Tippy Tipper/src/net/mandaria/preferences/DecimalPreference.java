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

public class DecimalPreference extends DialogPreference implements SeekBar.OnSeekBarChangeListener
{
  private static final String androidns="http://schemas.android.com/apk/res/android";
  private static final String appns="http://schemas.android.com/apk/res/net.mandaria";

  private TextView mSplashText,mValueText;
  private EditText mEditInteger, mEditDecimal;
  private Button mIncreaseInteger, mDecreaseInteger, mIncreaseDecimal, mDecreaseDecimal;
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

//    mValueText = new TextView(mContext);
//    mValueText.setGravity(Gravity.CENTER_HORIZONTAL);
//    mValueText.setTextSize(32);
//    params = new TableLayout.LayoutParams(
//    	TableLayout.LayoutParams.FILL_PARENT, 
//    	TableLayout.LayoutParams.WRAP_CONTENT);
//    layout.addView(mValueText, params);

    mIncreaseInteger = new Button(mContext);
    mIncreaseInteger.setText("+");
    
    mEditInteger = new EditText(mContext);
    //mEditInteger.setCursorVisible(false);
    //mEditInteger.setEnabled(false);
    
    mDecreaseInteger = new Button(mContext);
    mDecreaseInteger.setText("-");
    
    
    mIncreaseDecimal = new Button(mContext);
    mIncreaseDecimal.setText("+");
    
    mEditDecimal = new EditText(mContext);
    //mEditDecimal.setCursorVisible(false);
    
    mDecreaseDecimal = new Button(mContext);
    mDecreaseDecimal.setText("-");
    
    TableRow row_one = new TableRow(mContext);
    row_one.addView(mIncreaseInteger);
    row_one.addView(mIncreaseDecimal);
    
    TableRow row_two = new TableRow(mContext);
    row_two.addView(mEditInteger);
    row_two.addView(mEditDecimal);
    
    TableRow row_three = new TableRow(mContext);
    row_three.addView(mDecreaseInteger);
    row_three.addView(mDecreaseDecimal);
    
    layout.addView(row_header);
    
    TableLayout table_main = new TableLayout(mContext);
    table_main.addView(row_one);
    table_main.addView(row_two);
    table_main.addView(row_three);
    
    TableRow row_main = new TableRow(mContext);
    row_main.addView(table_main);
    
    layout.addView(row_main);

//    layout.addView(mIncreaseInteger, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//    layout.addView(mEditInteger, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//    layout.addView(mDecreaseInteger, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//    
//    layout.addView(mIncreaseDecimal, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//    layout.addView(mEditDecimal, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//    layout.addView(mDecreaseDecimal, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

    if (shouldPersist())
      mValue = getPersistedFloat(mDefault);

      mInteger = (int)Math.floor((double)mValue);
	  mDecimal = (int)(mValue - mInteger) * 100;
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
    
    return layout;
  }
  
  private void BindData()
  {
	  mInteger = (int)Math.floor((double)mValue);
	  mDecimal = (int)(mValue - mInteger) * 100;
	  try
	  {
	  mEditInteger.setText(mInteger);
	  mEditDecimal.setText(mDecimal);
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
    //BindData();
    //mSeekBar.setMax(mMax);
    //mSeekBar.setProgress(mValue - mMin);
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
      }
      catch(Exception ex)
      {
    	  mValue = mDefault;
      }
    }
    else 
      mValue = (Float)defaultValue;
  }

  public void onProgressChanged(SeekBar seek, int value, boolean fromTouch)
  {
    String t = String.valueOf(value + mMin);
    mValueText.setText(mSuffix == null ? t : t.concat(mSuffix));
    if (shouldPersist())
      persistFloat(value + mMin);
    callChangeListener(new Float(value + mMin));
  }
  public void onStartTrackingTouch(SeekBar seek) {}
  public void onStopTrackingTouch(SeekBar seek) {}

  public void setMax(int max) { mMax = max; }
  public float getMax() { return mMax; }
  
  public void setMin(int min) {mMin = min;}
  public float getMin() { return mMin;}
}
