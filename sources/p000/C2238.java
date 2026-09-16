package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥۙؗۚۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2238 extends AbstractC0071 {
    public static final Parcelable.Creator<C2238> CREATOR = new C5229(16);

    /* JADX INFO: renamed from: ۥَ */
    public final int f7406;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f7407;

    /* JADX INFO: renamed from: ۥٓ */
    public final int[] f7408;

    /* JADX INFO: renamed from: ۥٖ */
    public final int[] f7409;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f7410;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0144 f7411;

    public C2238(C0144 c0144, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f7411 = c0144;
        this.f7410 = z;
        this.f7407 = z2;
        this.f7408 = iArr;
        this.f7406 = i;
        this.f7409 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7793(parcel, 1, this.f7411, i);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f7410 ? 1 : 0);
        AbstractC4489.m7797(parcel, 3, 4);
        parcel.writeInt(this.f7407 ? 1 : 0);
        AbstractC4489.m7787(parcel, 4, this.f7408);
        AbstractC4489.m7797(parcel, 5, 4);
        parcel.writeInt(this.f7406);
        AbstractC4489.m7787(parcel, 6, this.f7409);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
