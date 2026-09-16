package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦٜؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3390 extends AbstractC0071 {
    public static final Parcelable.Creator<C3390> CREATOR = new C5229(9);

    /* JADX INFO: renamed from: ۦۨ */
    public final byte[] f11288;

    public C3390(byte[] bArr) {
        this.f11288 = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7786(parcel, 2, this.f11288);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
