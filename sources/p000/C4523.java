package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦٙٛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4523 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f14948;

    /* JADX INFO: renamed from: ۥۣ */
    public int[] f14949;

    public C4523(int i) {
        this.f14949 = i == 0 ? AbstractC5291.f17428 : new int[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4523) {
            C4523 c4523 = (C4523) obj;
            int i = c4523.f14948;
            int i2 = this.f14948;
            if (i == i2) {
                int[] iArr = this.f14949;
                int[] iArr2 = c4523.f14949;
                C3046 c3046M7917 = AbstractC4554.m7917(0, i2);
                int i3 = c3046M7917.f6006;
                int i4 = c3046M7917.f6005;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f14949;
        int i = this.f14948;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f14949;
        int i = this.f14948;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m7840(int i) {
        if (i >= 0 && i < this.f14948) {
            return this.f14949[i];
        }
        AbstractC2552.m4812("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7841(int i, int i2) {
        if (i < 0 || i >= this.f14948) {
            AbstractC2552.m4812("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f14949;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7842(int i) {
        int[] iArr = this.f14949;
        if (iArr.length < i) {
            this.f14949 = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7843(int i) {
        m7842(this.f14948 + 1);
        int[] iArr = this.f14949;
        int i2 = this.f14948;
        iArr[i2] = i;
        this.f14948 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m7844(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f14948)) {
            AbstractC2552.m4812("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f14949;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC0246.m523(i, i + 1, i2, iArr, iArr);
        }
        this.f14948--;
    }

    public /* synthetic */ C4523() {
        this(16);
    }
}
