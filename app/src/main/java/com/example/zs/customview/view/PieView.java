package com.example.zs.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.zs.customview.model.PieData;

import java.util.ArrayList;

/**
 * Description:自定义饼状图
 * Created by zs on 2016/11/3.
 */

public class PieView extends View {
    // view宽度
    private int mWidth;
    // view高度
    private int mHeight;
    // 画笔
    private Paint mPaint;
    // 数据
    private ArrayList<PieData> mData;

    public PieView(Context context) {
        super(context);
    }

    public PieView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PieView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        mPaint = new Paint();
        // 画笔样式 填满
        mPaint.setStyle(Paint.Style.FILL);
        // 抗锯齿
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mData == null) {
            return;
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    /**
     * 设置数据
     */
    public void setPieData(ArrayList<PieData> mData) {
        if (mData != null & mData.size() > 0) {

        }

    }
}
