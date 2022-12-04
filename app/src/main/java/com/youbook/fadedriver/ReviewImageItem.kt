package com.youbook.fadedriver

import android.os.Parcel
import android.os.Parcelable

class ReviewImageItem() : Parcelable{
    var image: String? = null
    var id: Int? = null

    constructor(parcel: Parcel) : this() {
        image = parcel.readString()
        id = parcel.readValue(Int::class.java.classLoader) as? Int

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(image)
        parcel.writeValue(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<com.youbook.fadedriver.ReviewImageItem> {
        override fun createFromParcel(parcel: Parcel): com.youbook.fadedriver.ReviewImageItem {
            return com.youbook.fadedriver.ReviewImageItem(parcel)
        }

        override fun newArray(size: Int): Array<com.youbook.fadedriver.ReviewImageItem?> {
            return arrayOfNulls(size)
        }
    }
}