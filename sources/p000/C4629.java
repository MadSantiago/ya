package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۦّٛؕۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4629 extends AbstractC0071 {
    public static final Parcelable.Creator<C4629> CREATOR = new C5229(8);

    /* JADX INFO: renamed from: ۥَ */
    public final TreeMap f15285 = new TreeMap();

    /* JADX INFO: renamed from: ۥْ */
    public final String f15286;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2884[] f15287;

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean f15288;

    /* JADX INFO: renamed from: ۦٗ */
    public final long f15289;

    /* JADX INFO: renamed from: ۦ۟ */
    public final byte[] f15290;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f15291;

    public C4629(String str, String str2, C2884[] c2884Arr, boolean z, byte[] bArr, long j) {
        this.f15291 = str;
        this.f15286 = str2;
        this.f15287 = c2884Arr;
        this.f15288 = z;
        this.f15290 = bArr;
        this.f15289 = j;
        for (C2884 c2884 : c2884Arr) {
            this.f15285.put(Integer.valueOf(c2884.f9622), c2884);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4629)) {
            return false;
        }
        C4629 c4629 = (C4629) obj;
        return AbstractC3925.m7026(this.f15291, c4629.f15291) && AbstractC3925.m7026(this.f15286, c4629.f15286) && this.f15285.equals(c4629.f15285) && this.f15288 == c4629.f15288 && Arrays.equals(this.f15290, c4629.f15290) && this.f15289 == c4629.f15289;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15291, this.f15286, this.f15285, Boolean.valueOf(this.f15288), this.f15290, Long.valueOf(this.f15289)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f15291);
        sb.append("', '");
        sb.append(this.f15286);
        sb.append("', (");
        Iterator it = this.f15285.values().iterator();
        while (it.hasNext()) {
            sb.append((C2884) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f15288);
        sb.append(", ");
        byte[] bArr = this.f15290;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.f15289);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7775(parcel, 2, this.f15291);
        AbstractC4489.m7775(parcel, 3, this.f15286);
        AbstractC4489.m7774(parcel, 4, this.f15287, i);
        AbstractC4489.m7797(parcel, 5, 4);
        parcel.writeInt(this.f15288 ? 1 : 0);
        AbstractC4489.m7786(parcel, 6, this.f15290);
        AbstractC4489.m7797(parcel, 7, 8);
        parcel.writeLong(this.f15289);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
