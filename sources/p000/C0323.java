package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؘْؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0323 extends AbstractC0071 {
    public static final Parcelable.Creator<C0323> CREATOR = new C1432(26);

    /* JADX INFO: renamed from: ۥْ */
    public final long f1181;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f1182;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f1183;

    public C0323(int i, long j, long j2) {
        this.f1183 = j;
        this.f1182 = i;
        this.f1181 = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 8);
        parcel.writeLong(this.f1183);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f1182);
        AbstractC4489.m7797(parcel, 3, 8);
        parcel.writeLong(this.f1181);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
