package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؐؖۥؚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0144 extends AbstractC0071 {
    public static final Parcelable.Creator<C0144> CREATOR = new C1432(27);

    /* JADX INFO: renamed from: ۥَ */
    public final int f575;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f576;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f577;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f578;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f579;

    public C0144(int i, boolean z, boolean z2, int i2, int i3) {
        this.f579 = i;
        this.f578 = z;
        this.f576 = z2;
        this.f577 = i2;
        this.f575 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f579);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f578 ? 1 : 0);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f576 ? 1 : 0);
        AbstractC4489.m7797(parcel, 4, 4);
        parcel.writeInt(this.f577);
        AbstractC4489.m7797(parcel, 5, 4);
        parcel.writeInt(this.f575);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
