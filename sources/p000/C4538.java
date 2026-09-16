package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦۣٚؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4538 extends AbstractC0071 implements Comparable {
    public static final Parcelable.Creator<C4538> CREATOR = new C5229(14);

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f15002;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f15003;

    public C4538(int i, int i2) {
        this.f15003 = i;
        this.f15002 = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4538 c4538 = (C4538) obj;
        int i = c4538.f15003;
        int i2 = this.f15003;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c4538.f15002;
        int i4 = this.f15002;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (p000.C4538) r3).f15003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f15002;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p000.C4538
            if (r0 == 0) goto L1c
            ۦۣٚؒۢ r3 = (p000.C4538) r3
            int r0 = r3.f15003
            int r1 = r2.f15003
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f15002
            int r2 = r2.f15002
            if (r2 >= r3) goto L17
            goto L1c
        L17:
            if (r2 <= r3) goto L1a
            goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4538.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f15003 * 31) + this.f15002;
    }

    public final String toString() {
        int i = this.f15003;
        int length = String.valueOf(i).length();
        int i2 = this.f15002;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f15003);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f15002);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
