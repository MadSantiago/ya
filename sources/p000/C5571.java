package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦٜۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5571 extends AbstractC0071 {
    public static final Parcelable.Creator<C5571> CREATOR = new C5229(19);

    /* JADX INFO: renamed from: ۥَ */
    public final int f18397;

    /* JADX INFO: renamed from: ۥْ */
    public final String f18398;

    /* JADX INFO: renamed from: ۥٓ */
    public final Bundle f18399;

    /* JADX INFO: renamed from: ۥٖ */
    public final long f18400;

    /* JADX INFO: renamed from: ۦٗ */
    public String f18401;

    /* JADX INFO: renamed from: ۦ۟ */
    public byte[] f18402;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f18403;

    public C5571(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f18403 = j;
        this.f18402 = bArr;
        this.f18398 = str;
        this.f18399 = bundle;
        this.f18397 = i;
        this.f18400 = j2;
        this.f18401 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 8);
        parcel.writeLong(this.f18403);
        AbstractC4489.m7786(parcel, 2, this.f18402);
        AbstractC4489.m7775(parcel, 3, this.f18398);
        AbstractC4489.m7784(parcel, 4, this.f18399);
        AbstractC4489.m7797(parcel, 5, 4);
        parcel.writeInt(this.f18397);
        AbstractC4489.m7797(parcel, 6, 8);
        parcel.writeLong(this.f18400);
        AbstractC4489.m7775(parcel, 7, this.f18401);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
