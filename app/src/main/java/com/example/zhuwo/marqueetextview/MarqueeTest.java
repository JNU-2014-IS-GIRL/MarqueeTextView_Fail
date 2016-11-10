package com.example.zhuwo.marqueetextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by zhuwo on 2016/11/10.
 */

public class MarqueeTest extends TextView {

    public MarqueeTest(Context context) {
        super(context);
    }

    public MarqueeTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MarqueeTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean isFocused() {
        return super.isFocused();
    }

}
