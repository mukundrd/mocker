package com.lba.android.mocker.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mudesai on 9/20/16.
 */
public class Domain implements Parcelable {

    public MockMatchNode[] nodes;

    public String url;

    protected Domain(Parcel in) {
        nodes = in.createTypedArray(MockMatchNode.CREATOR);
        url = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(nodes, flags);
        dest.writeString(url);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Domain> CREATOR = new Creator<Domain>() {
        @Override
        public Domain createFromParcel(Parcel in) {
            return new Domain(in);
        }

        @Override
        public Domain[] newArray(int size) {
            return new Domain[size];
        }
    };

    @Override
    public String toString() {
        return "ClassPojo [nodes = " + nodes + ", url = " + url + "]";
    }
}
