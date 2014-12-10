package com.mugu.mp3prayer.fragment;

import java.io.IOException;
import java.io.InputStream;

import com.mugu.mp3prayer.R;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MenuFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.menu_fragment, null);

		root.setBackground(new BitmapDrawable(
				getImageFromAssetsFile("assets/bkgs/001.jpg")));

		return root;
	}

	private Bitmap getImageFromAssetsFile(String fileName) {
		Bitmap image = null;
		AssetManager am = getResources().getAssets();
		try {
			InputStream is = am.open(fileName);
			image = BitmapFactory.decodeStream(is);
			is.close();
			am.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return image;

	}
}
