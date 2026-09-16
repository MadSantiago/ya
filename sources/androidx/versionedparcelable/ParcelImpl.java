package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C1432;
import p000.C3514;
import p000.InterfaceC3793;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1432(13);

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3793 f242;

    public ParcelImpl(Parcel parcel) {
        this.f242 = new C3514(parcel).m837();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C3514(parcel).m836(this.f242);
    }
}
