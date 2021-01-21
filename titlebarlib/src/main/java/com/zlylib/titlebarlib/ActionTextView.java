package com.zlylib.titlebarlib;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * @author zhangliyang
 * @date 2019/11/16
 * @github https://github.com/ZLYang110
 */
public final class ActionTextView extends AppCompatTextView {

    public ActionTextView(Context context) {
        this(context, null);
    }

    public ActionTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActionTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
