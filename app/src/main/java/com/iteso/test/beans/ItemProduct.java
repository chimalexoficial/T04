package com.iteso.test.beans;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

public class ItemProduct {

    private int image, code;
    String title, store, location, phone, description;
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(store);
        dest.writeString(location);
        dest.writeString(phone);
        dest.writeString(description);
    }
    public static final Parcelable.Creator<ItemProduct> CREATOR = new
            Parcelable.Creator<ItemProduct>() {
                @Override
                public ItemProductcreateFromParcel(Parcel source) {
                    // using parcelable constructor
                    return new ItemProduct (source);
                }

                @Override
                public ItemProduct createFromParcel(Parcel source) {
                    return null;
                }

                @Override
                public ItemProduct [] newArray(int size) {
                    return new ItemProduct [size];
                }
            };

    holder.mEventLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, ActivityDetail.class);
            intent.putExtra("ITEM", mDataSet.get(position));
            context.startActivity(intent);
        }
    });

    public ItemProduct(int image, String title, String store, String location, String phone, String description) {
        this.image = image;
        this.title = title;
        this.store = store;
        this.location = location;
        this.phone = phone;
        this.description = description;
    }

    public ItemProduct(Parcel in){
        image = in.readInt();
        title = in.readString();
        store = in.readString();
        location = in.readString();
        phone = in.readString();
        description = in.readString();
    }

    public int describeContents() {
        return 0;
    }

    public ItemProduct() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", store='" + store + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
