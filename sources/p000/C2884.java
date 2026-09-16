package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥۧؖۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2884 extends AbstractC0071 implements Comparable {
    public static final Parcelable.Creator<C2884> CREATOR = new C5229(7);

    /* JADX INFO: renamed from: ۥْ */
    public final String[] f9619;

    /* JADX INFO: renamed from: ۥٓ */
    public final TreeMap f9620 = new TreeMap();

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5692[] f9621;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f9622;

    public C2884(int i, C5692[] c5692Arr, String[] strArr) {
        this.f9622 = i;
        this.f9621 = c5692Arr;
        for (C5692 c5692 : c5692Arr) {
            this.f9620.put(c5692.f18729, c5692);
        }
        this.f9619 = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f9622 - ((C2884) obj).f9622;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2884)) {
            return false;
        }
        C2884 c2884 = (C2884) obj;
        return this.f9622 == c2884.f9622 && AbstractC3925.m7026(this.f9620, c2884.f9620) && Arrays.equals(this.f9619, c2884.f9619);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f9622);
        sb.append(", (");
        Iterator it = this.f9620.values().iterator();
        while (it.hasNext()) {
            sb.append((C5692) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f9619;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f9622);
        AbstractC4489.m7774(parcel, 3, this.f9621, i);
        String[] strArr = this.f9619;
        if (strArr != null) {
            int iM7801 = AbstractC4489.m7800(parcel, 4);
            parcel.writeStringArray(strArr);
            AbstractC4489.m7790(parcel, iM7801);
        }
        AbstractC4489.m7790(parcel, iM7800);
    }
}
