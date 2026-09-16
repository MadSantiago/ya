package moe.shizuku.api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C1432;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class BinderContainer implements Parcelable {
    public static final Parcelable.Creator<BinderContainer> CREATOR = new C1432(4);

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f365;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f365);
    }
}
