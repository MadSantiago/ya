package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦٜؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3202 extends AbstractC0071 {
    public static final Parcelable.Creator<C3202> CREATOR = new C5229(15);

    /* JADX INFO: renamed from: ۥْ */
    public int f10744;

    /* JADX INFO: renamed from: ۥٓ */
    public C2238 f10745;

    /* JADX INFO: renamed from: ۦ۟ */
    public C2274[] f10746;

    /* JADX INFO: renamed from: ۦۨ */
    public Bundle f10747;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7784(parcel, 1, this.f10747);
        AbstractC4489.m7774(parcel, 2, this.f10746, i);
        int i2 = this.f10744;
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(i2);
        AbstractC4489.m7793(parcel, 4, this.f10745, i);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
