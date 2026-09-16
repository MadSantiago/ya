package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥؗٛؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0638 implements Cloneable {

    /* JADX INFO: renamed from: ۥْ */
    public /* synthetic */ Object[] f2386;

    /* JADX INFO: renamed from: ۥٓ */
    public /* synthetic */ int f2387;

    /* JADX INFO: renamed from: ۦ۟ */
    public /* synthetic */ long[] f2388;

    /* JADX INFO: renamed from: ۦۨ */
    public /* synthetic */ boolean f2389;

    public C0638(int i) {
        if (i == 0) {
            this.f2388 = AbstractC2164.f7141;
            this.f2386 = AbstractC2164.f7137;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.f2388 = new long[i5];
        this.f2386 = new Object[i5];
    }

    public final Object clone() {
        C0638 c0638 = (C0638) super.clone();
        c0638.f2388 = (long[]) this.f2388.clone();
        c0638.f2386 = (Object[]) this.f2386.clone();
        return c0638;
    }

    public final String toString() {
        if (m1456() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2387 * 28);
        sb.append('{');
        int i = this.f2387;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m1455(i2));
            sb.append('=');
            Object objM1453 = m1453(i2);
            if (objM1453 != sb) {
                sb.append(objM1453);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m1450(long j) {
        Object obj;
        int iM4215 = AbstractC2164.m4215(this.f2388, this.f2387, j);
        if (iM4215 < 0 || (obj = this.f2386[iM4215]) == C3133.f10544) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m1451(long j, Object obj) {
        Object obj2 = C3133.f10544;
        int iM4215 = AbstractC2164.m4215(this.f2388, this.f2387, j);
        if (iM4215 >= 0) {
            this.f2386[iM4215] = obj;
            return;
        }
        int i = ~iM4215;
        int i2 = this.f2387;
        if (i < i2) {
            Object[] objArr = this.f2386;
            if (objArr[i] == obj2) {
                this.f2388[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f2389) {
            long[] jArr = this.f2388;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f2386;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f2389 = false;
                this.f2387 = i3;
                i = ~AbstractC2164.m4215(this.f2388, i3, j);
            }
        }
        int i5 = this.f2387;
        if (i5 >= this.f2388.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f2388 = Arrays.copyOf(this.f2388, i9);
            this.f2386 = Arrays.copyOf(this.f2386, i9);
        }
        int i10 = this.f2387;
        if (i10 - i != 0) {
            long[] jArr2 = this.f2388;
            int i11 = i + 1;
            AbstractC0246.m511(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f2386;
            AbstractC0246.m510(i11, i, this.f2387, objArr3, objArr3);
        }
        this.f2388[i] = j;
        this.f2386[i] = obj;
        this.f2387++;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m1452(long j) {
        int iM4215 = AbstractC2164.m4215(this.f2388, this.f2387, j);
        if (iM4215 >= 0) {
            Object[] objArr = this.f2386;
            Object obj = objArr[iM4215];
            Object obj2 = C3133.f10544;
            if (obj != obj2) {
                objArr[iM4215] = obj2;
                this.f2389 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final Object m1453(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f2387)) {
            AbstractC2552.m4814("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f2389) {
            long[] jArr = this.f2388;
            Object[] objArr = this.f2386;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != C3133.f10544) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f2389 = false;
            this.f2387 = i3;
        }
        return this.f2386[i];
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1454() {
        int i = this.f2387;
        Object[] objArr = this.f2386;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2387 = 0;
        this.f2389 = false;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m1455(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f2387)) {
            AbstractC2552.m4814("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f2389) {
            long[] jArr = this.f2388;
            Object[] objArr = this.f2386;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != C3133.f10544) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f2389 = false;
            this.f2387 = i3;
        }
        return this.f2388[i];
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m1456() {
        if (this.f2389) {
            int i = this.f2387;
            long[] jArr = this.f2388;
            Object[] objArr = this.f2386;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C3133.f10544) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f2389 = false;
            this.f2387 = i2;
        }
        return this.f2387;
    }

    public /* synthetic */ C0638(Object obj) {
        this(10);
    }
}
