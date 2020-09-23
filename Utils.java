package com.example.androidzuoye01;

import android.content.Context

public class  Utils{
    public static int dip2px(Context context,float dpValue){
        final float scale=context.getResoures().getDisplayMetrics().density;
        return (int)(dpValue*scale+0.5f);
    }
    public static  int px2dip(Context context,float pxValue){
        final float scale=context.getResoures().getDisplayMetrics().density;
        return (int)(pxValue/scale+0.5f);
    }

}
