package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؔؔۜؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0396 extends AbstractC0071 {
    public static final Parcelable.Creator<C0396> CREATOR = new C1432(18);

    /* JADX INFO: renamed from: ۥْ */
    public final Intent f1462;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f1463;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f1464;

    public C0396(int i, int i2, Intent intent) {
        this.f1464 = i;
        this.f1463 = i2;
        this.f1462 = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f1464);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f1463);
        AbstractC4489.m7793(parcel, 3, this.f1462, i);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
