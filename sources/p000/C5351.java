package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦ۟ؖٓۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5351 implements Parcelable {
    public static final Parcelable.Creator<C5351> CREATOR = new C1432(6);

    /* JADX INFO: renamed from: ۦ۟ */
    public int f17618;

    /* JADX INFO: renamed from: ۦۨ */
    public String f17619;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17619);
        parcel.writeInt(this.f17618);
    }
}
