package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ۥۥؓ٘ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2730 {

    /* JADX INFO: renamed from: ۥؗ */
    public C3482 f9039;

    /* JADX INFO: renamed from: ۥۗ */
    public int f9040;

    /* JADX INFO: renamed from: ۥۣ */
    public Object[] f9041;

    public C2730(int i) {
        this.f9041 = i == 0 ? AbstractC3667.f12261 : new Object[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2730) {
            C2730 c2730 = (C2730) obj;
            int i = c2730.f9040;
            int i2 = this.f9040;
            if (i == i2) {
                Object[] objArr = this.f9041;
                Object[] objArr2 = c2730.f9041;
                C3046 c3046M7917 = AbstractC4554.m7917(0, i2);
                int i3 = c3046M7917.f6006;
                int i4 = c3046M7917.f6005;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC3831.m6874(objArr[i3], objArr2[i3])) {
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
        Object[] objArr = this.f9041;
        int i = this.f9040;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f9041;
        int i = this.f9040;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5074(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f9040;
        int size = list.size() + i;
        Object[] objArr = this.f9041;
        if (objArr.length < size) {
            m5082(size, objArr);
        }
        Object[] objArr2 = this.f9041;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f9040 = list.size() + this.f9040;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Object m5075() {
        if (!m5078()) {
            return this.f9041[0];
        }
        C0178.m384("ObjectList is empty.");
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Object m5076(int i) {
        if (i >= 0 && i < this.f9040) {
            return this.f9041[i];
        }
        m5088(i);
        throw null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5077(C2730 c2730) {
        if (c2730.m5078()) {
            return;
        }
        int i = this.f9040 + c2730.f9040;
        Object[] objArr = this.f9041;
        if (objArr.length < i) {
            m5082(i, objArr);
        }
        AbstractC0246.m510(this.f9040, 0, c2730.f9040, c2730.f9041, this.f9041);
        this.f9040 += c2730.f9040;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m5078() {
        return this.f9040 == 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5079(Object obj) {
        int i = this.f9040 + 1;
        Object[] objArr = this.f9041;
        if (objArr.length < i) {
            m5082(i, objArr);
        }
        Object[] objArr2 = this.f9041;
        int i2 = this.f9040;
        objArr2[i2] = obj;
        this.f9040 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5080() {
        Arrays.fill(this.f9041, 0, this.f9040, (Object) null);
        this.f9040 = 0;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m5081(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f9040) || i2 < 0 || i2 > i3) {
            AbstractC2552.m4812("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.f9040);
            throw null;
        }
        if (i2 < i) {
            AbstractC2552.m4814("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f9041;
                AbstractC0246.m510(i, i2, i3, objArr, objArr);
            }
            int i4 = this.f9040;
            int i5 = i4 - (i2 - i);
            Arrays.fill(this.f9041, i5, i4, (Object) null);
            this.f9040 = i5;
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m5082(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f9041 = objArr2;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m5083(Object obj) {
        int iM5086 = m5086(obj);
        if (iM5086 < 0) {
            return false;
        }
        m5085(iM5086);
        return true;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m5084() {
        return this.f9040 != 0;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final Object m5085(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f9040)) {
            m5088(i);
            throw null;
        }
        Object[] objArr = this.f9041;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC0246.m510(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.f9040 - 1;
        this.f9040 = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m5086(Object obj) {
        Object[] objArr = this.f9041;
        int i = 0;
        if (obj == null) {
            int i2 = this.f9040;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f9040;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final Object m5087(int i, Object obj) {
        if (i < 0 || i >= this.f9040) {
            m5088(i);
            throw null;
        }
        Object[] objArr = this.f9041;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m5088(int i) {
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Index ", " must be in 0..");
        sbM8680.append(this.f9040 - 1);
        AbstractC2552.m4812(sbM8680.toString());
        throw null;
    }

    public /* synthetic */ C2730() {
        this(16);
    }
}
