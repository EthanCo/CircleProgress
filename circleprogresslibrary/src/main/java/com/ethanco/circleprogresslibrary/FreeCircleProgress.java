package com.ethanco.circleprogresslibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * @Description 自由度高的可添加控件的CircleProgress
 * Created by YOLANDA on 2015-12-11.
 */
public class FreeCircleProgress extends RelativeLayout {
    private final TickCircleProgress tickCircleProgress;

    public FreeCircleProgress(Context context) {
        this(context, null);
    }

    public FreeCircleProgress(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FreeCircleProgress(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        View contentView = View.inflate(context, R.layout.layout_circleprogress_free, this);
        tickCircleProgress = (TickCircleProgress) contentView.findViewById(R.id.tickCircleProgress_free);
    }

    /**
     * 获得TickCircleProgress
     *
     * @return
     */
    public TickCircleProgress getTickCircleProgress() {
        return tickCircleProgress;
    }

    /**
     * 设置进度条进度
     *
     * @param progress
     */
    public void setProgress(int progress) {
        tickCircleProgress.setProgress(progress);
    }
}
