package com.mediatek.mtk70951.slidetest;


import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class BirdActivity extends Activity {

	private Handler mHandler;
	
	public static Intent newInstance(Activity activity, int pos) {
		Intent intent = new Intent(activity, BirdActivity.class);
		intent.putExtra("pos", pos);
		return intent;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		int pos = 0;
		
		if (getIntent().getExtras() != null) {
			pos = getIntent().getExtras().getInt("pos");
		}
		
		String[] birds = getResources().getStringArray(R.array.birds);
		TypedArray imgs1 = getResources().obtainTypedArray(R.array.birds_img);
		int resId = imgs1.getResourceId(pos, -1);
		
		setTitle(birds[pos]);
		
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
		
		ColorDrawable color = new ColorDrawable(Color.BLACK);
		color.setAlpha(128);
		
		getActionBar().setBackgroundDrawable(color);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		mHandler = new Handler();
		
		ImageView imageView = new ImageView(this);
		imageView.setScaleType(ScaleType.CENTER_INSIDE);
		imageView.setImageResource(resId);
		imageView.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				getActionBar().show();
				hideActionBarDelayed(mHandler);
			}
		});
		
		setContentView(imageView);
		this.getWindow().setBackgroundDrawableResource(android.R.color.black);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		getActionBar().show();
		hideActionBarDelayed(mHandler);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void hideActionBarDelayed(Handler handler) {
		handler.postDelayed(new Runnable() {
			public void run() {
				getActionBar().hide();
			}
		}, 2000);
	}
	
}
