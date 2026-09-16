package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥۨؕؐ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2923 extends AbstractC0071 {
    public static final Parcelable.Creator<C2923> CREATOR = new C1432(22);

    /* JADX INFO: renamed from: ۥَ */
    public final long f9824;

    /* JADX INFO: renamed from: ۥْ */
    public final int f9825;

    /* JADX INFO: renamed from: ۥٓ */
    public final long f9826;

    /* JADX INFO: renamed from: ۥٖ */
    public final String f9827;

    /* JADX INFO: renamed from: ۥۖ */
    public final int f9828;

    /* JADX INFO: renamed from: ۦٗ */
    public final String f9829;

    /* JADX INFO: renamed from: ۦۛ */
    public final int f9830;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f9831;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f9832;

    public C2923(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f9832 = i;
        this.f9831 = i2;
        this.f9825 = i3;
        this.f9826 = j;
        this.f9824 = j2;
        this.f9827 = str;
        this.f9829 = str2;
        this.f9830 = i4;
        this.f9828 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f9832);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f9831);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f9825);
        AbstractC4489.m7797(parcel, 4, 8);
        parcel.writeLong(this.f9826);
        AbstractC4489.m7797(parcel, 5, 8);
        parcel.writeLong(this.f9824);
        AbstractC4489.m7775(parcel, 6, this.f9827);
        AbstractC4489.m7775(parcel, 7, this.f9829);
        AbstractC4489.m7797(parcel, 8, 4);
        parcel.writeInt(this.f9830);
        AbstractC4489.m7797(parcel, 9, 4);
        parcel.writeInt(this.f9828);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
