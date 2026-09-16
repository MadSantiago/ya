package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٝؓٙٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1870 implements Cloneable {

    /* JADX INFO: renamed from: ۥْ */
    public /* synthetic */ int f6215;

    /* JADX INFO: renamed from: ۦ۟ */
    public /* synthetic */ Object[] f6216;

    /* JADX INFO: renamed from: ۦۨ */
    public /* synthetic */ int[] f6217;

    public C1870(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f6217 = new int[i5];
        this.f6216 = new Object[i5];
    }

    public final String toString() {
        int i = this.f6215;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f6215;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f6217[i3]);
            sb.append('=');
            Object objM3724 = m3724(i3);
            if (objM3724 != this) {
                sb.append(objM3724);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3722(int i, Object obj) {
        int iM4217 = AbstractC2164.m4217(this.f6215, i, this.f6217);
        if (iM4217 >= 0) {
            this.f6216[iM4217] = obj;
            return;
        }
        int i2 = ~iM4217;
        int i3 = this.f6215;
        if (i2 < i3) {
            Object[] objArr = this.f6216;
            if (objArr[i2] == AbstractC5378.f17774) {
                this.f6217[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f6217.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f6217 = Arrays.copyOf(this.f6217, i7);
            this.f6216 = Arrays.copyOf(this.f6216, i7);
        }
        int i8 = this.f6215;
        if (i8 - i2 != 0) {
            int[] iArr = this.f6217;
            int i9 = i2 + 1;
            AbstractC0246.m523(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.f6216;
            AbstractC0246.m510(i9, i2, this.f6215, objArr2, objArr2);
        }
        this.f6217[i2] = i;
        this.f6216[i2] = obj;
        this.f6215++;
    }

    /* JADX INFO: renamed from: ۥۣ, reason: merged with bridge method [inline-methods] */
    public final C1870 clone() {
        C1870 c1870 = (C1870) super.clone();
        c1870.f6217 = (int[]) this.f6217.clone();
        c1870.f6216 = (Object[]) this.f6216.clone();
        return c1870;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m3724(int i) {
        Object[] objArr = this.f6216;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
