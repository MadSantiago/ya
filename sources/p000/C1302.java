package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥٌِٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1302 extends AbstractC0071 {
    public static final Parcelable.Creator<C1302> CREATOR = new C5229(4);

    /* JADX INFO: renamed from: ۥَ */
    public final String f4469;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f4470;

    /* JADX INFO: renamed from: ۥٓ */
    public final Bundle f4471;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f4472;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f4473;

    public C1302(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f4473 = j;
        this.f4472 = j2;
        this.f4470 = z;
        this.f4471 = bundle;
        this.f4469 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 8);
        parcel.writeLong(this.f4473);
        AbstractC4489.m7797(parcel, 2, 8);
        parcel.writeLong(this.f4472);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f4470 ? 1 : 0);
        AbstractC4489.m7784(parcel, 7, this.f4471);
        AbstractC4489.m7775(parcel, 8, this.f4469);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
