package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥؖؑؓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0506 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۦُ */
    public Object[] f1825;

    /* JADX INFO: renamed from: ۦٖ */
    public int f1826;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f1826; i++) {
            sb.append(" '");
            sb.append(mo1149(i));
            sb.append("': ");
            sb.append(mo1145(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۥِ */
    public final Object mo1145(int i) {
        if (i < this.f1826) {
            return this.f1825[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۥۢ */
    public final void m1146(C2632 c2632, Object obj) {
        int iM1147;
        if (!c2632.f8741 && (iM1147 = m1147(c2632)) != -1) {
            this.f1825[iM1147 + iM1147 + 1] = obj;
            return;
        }
        int i = this.f1826 + 1;
        Object[] objArrCopyOf = this.f1825;
        int length = objArrCopyOf.length;
        if (i + i > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
            this.f1825 = objArrCopyOf;
        }
        int i2 = this.f1826;
        int i3 = i2 + i2;
        objArrCopyOf[i3] = c2632;
        objArrCopyOf[i3 + 1] = obj;
        this.f1826 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۦ */
    public final int m1147(C2632 c2632) {
        for (int i = 0; i < this.f1826; i++) {
            if (this.f1825[i + i].equals(c2632)) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦؔ */
    public final Object mo1148(C2632 c2632) {
        int iM1147 = m1147(c2632);
        if (iM1147 == -1) {
            return null;
        }
        return c2632.f8743.cast(this.f1825[iM1147 + iM1147 + 1]);
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦ۠ */
    public final C2632 mo1149(int i) {
        if (i < this.f1826) {
            return (C2632) this.f1825[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦۧ */
    public final int mo1150() {
        return this.f1826;
    }
}
