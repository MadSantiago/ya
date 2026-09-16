package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥۘؗٚۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2184 implements Parcelable {
    public static final Parcelable.Creator<C2184> CREATOR = new C1432(5);

    /* JADX INFO: renamed from: ۦۨ */
    public final int f7240;

    public C2184(int i) {
        this.f7240 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2184) && this.f7240 == ((C2184) obj).f7240;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7240);
    }

    public final String toString() {
        return AbstractC3761.m6638(new StringBuilder("DefaultLazyKey(index="), this.f7240, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7240);
    }
}
