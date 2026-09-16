package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥِؔۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1103 extends AbstractC0071 {
    public static final Parcelable.Creator<C1103> CREATOR = new C1432(29);

    /* JADX INFO: renamed from: ۦۨ */
    public final Bundle f3878;

    public C1103(Bundle bundle) {
        this.f3878 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7784(parcel, 1, this.f3878);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
