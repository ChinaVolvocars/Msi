package com.example.common;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.widget.Toast;

public class Utils {

  public static void toast(Context context, @StringRes int msg) {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
  }

  public static void toast(Context context, @Nullable String msg) {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
  }
}
