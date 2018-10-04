package com.supreme.code.recyclerviewinalertdialogue;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SqaureLinearLayout extends LinearLayout {
    public SqaureLinearLayout(Context context) {
        super(context);
    }

    public SqaureLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SqaureLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SqaureLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
