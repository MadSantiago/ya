package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؚٜٙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1628 extends AbstractC0071 {
    public static final Parcelable.Creator<C1628> CREATOR = new C5229(12);

    /* JADX INFO: renamed from: ۥْ */
    public final C5692 f5451;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f5452;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f5453;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f5454;

    public C1628(String str, String str2, C5692 c5692, boolean z) {
        this.f5454 = str;
        this.f5453 = str2;
        this.f5451 = c5692;
        this.f5452 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1628)) {
            return false;
        }
        C1628 c1628 = (C1628) obj;
        return AbstractC3925.m7026(this.f5454, c1628.f5454) && AbstractC3925.m7026(this.f5453, c1628.f5453) && AbstractC3925.m7026(this.f5451, c1628.f5451) && this.f5452 == c1628.f5452;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m3402(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 2, this.f5454);
        AbstractC4489.m7775(parcel, 3, this.f5453);
        AbstractC4489.m7793(parcel, 4, this.f5451, i);
        AbstractC4489.m7797(parcel, 5, 4);
        parcel.writeInt(this.f5452 ? 1 : 0);
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3402(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f5454);
        sb.append(", ");
        sb.append(this.f5453);
        sb.append(", ");
        this.f5451.m9504(sb);
        sb.append(", ");
        sb.append(this.f5452);
        sb.append(")");
    }
}
