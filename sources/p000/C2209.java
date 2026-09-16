package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥَۙؒۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2209 extends AbstractC0071 {
    public static final Parcelable.Creator<C2209> CREATOR = new C1432(21);

    /* JADX INFO: renamed from: ۥْ */
    public final C3976 f7315;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2612 f7316;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f7317;

    public C2209(int i, C2612 c2612, C3976 c3976) {
        this.f7317 = i;
        this.f7316 = c2612;
        this.f7315 = c3976;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f7317);
        AbstractC4489.m7793(parcel, 2, this.f7316, i);
        AbstractC4489.m7793(parcel, 3, this.f7315, i);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
