package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥَ٘ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1619 extends AbstractC0090 {
    public static final Parcelable.Creator<C1619> CREATOR = new C0589(2);

    /* JADX INFO: renamed from: ۥْ */
    public int f5427;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f5428;

    public C1619(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5427 = parcel.readInt();
        this.f5428 = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0090, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5427);
        parcel.writeInt(this.f5428 ? 1 : 0);
    }
}
