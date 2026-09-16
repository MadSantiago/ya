package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦۘؕۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5033 extends AbstractC0071 {
    public static final Parcelable.Creator<C5033> CREATOR = new C5229(13);

    /* JADX INFO: renamed from: ۦۨ */
    public final List f16661;

    public C5033(ArrayList arrayList) {
        this.f16661 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5033) {
            return this.f16661.equals(((C5033) obj).f16661);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (C1628 c1628 : this.f16661) {
            if (!z) {
                sb.append(", ");
            }
            c1628.m3402(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7794(parcel, 2, this.f16661);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
