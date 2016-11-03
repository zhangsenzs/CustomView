package com.example.zs.customview.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Description:饼状图数据
 * Created by zs on 2016/11/3.
 */

public class PieData implements Parcelable {
    // 名称
    private String name;
    // 百分比
    private float percentage;
    // 数值
    private float value;

    // 颜色
    private int color;
    // 角度
    private float angle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeFloat(this.percentage);
        dest.writeFloat(this.value);
        dest.writeInt(this.color);
        dest.writeFloat(this.angle);
    }

    public PieData() {
    }

    protected PieData(Parcel in) {
        this.name = in.readString();
        this.percentage = in.readFloat();
        this.value = in.readFloat();
        this.color = in.readInt();
        this.angle = in.readFloat();
    }

    public static final Parcelable.Creator<PieData> CREATOR = new Parcelable.Creator<PieData>() {
        @Override
        public PieData createFromParcel(Parcel source) {
            return new PieData(source);
        }

        @Override
        public PieData[] newArray(int size) {
            return new PieData[size];
        }
    };
}
