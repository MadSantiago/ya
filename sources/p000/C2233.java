package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥۙؗؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2233 implements Parcelable {
    public static final Parcelable.Creator<C2233> CREATOR = new C1432(0);

    /* JADX INFO: renamed from: ۦ۟ */
    public final Intent f7399;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f7400;

    public C2233(Intent intent, int i) {
        this.f7400 = i;
        this.f7399 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f7400;
        if (i != -1) {
            strValueOf = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f7399);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7400);
        Intent intent = this.f7399;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
