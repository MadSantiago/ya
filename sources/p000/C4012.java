package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦَّؒۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4012 extends AbstractC0071 {
    public static final Parcelable.Creator<C4012> CREATOR = new C5229(18);

    /* JADX INFO: renamed from: ۥْ */
    public final int f13377;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f13378;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f13379;

    public C4012(long j, String str, int i) {
        this.f13379 = str;
        this.f13378 = j;
        this.f13377 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 1, this.f13379);
        AbstractC4489.m7797(parcel, 2, 8);
        parcel.writeLong(this.f13378);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f13377);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
