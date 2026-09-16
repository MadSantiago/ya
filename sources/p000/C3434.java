package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦؗؖٓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3434 extends AbstractC0071 {
    public static final Parcelable.Creator<C3434> CREATOR = new C5229(24);

    /* JADX INFO: renamed from: ۥَ */
    public final long f11400;

    /* JADX INFO: renamed from: ۥْ */
    public final int f11401;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f11402;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f11403;

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f11404;

    public C3434(boolean z, String str, int i, int i2, long j) {
        this.f11404 = z;
        this.f11403 = str;
        this.f11401 = AbstractC2765.m5124(i) - 1;
        this.f11402 = AbstractC3801.m6769(i2) - 1;
        this.f11400 = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f11404 ? 1 : 0);
        AbstractC4489.m7775(parcel, 2, this.f11403);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f11401);
        AbstractC4489.m7797(parcel, 4, 4);
        parcel.writeInt(this.f11402);
        AbstractC4489.m7797(parcel, 5, 8);
        parcel.writeLong(this.f11400);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
