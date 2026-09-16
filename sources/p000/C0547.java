package p000;

import android.graphics.Shader;

/* JADX INFO: renamed from: ۥَؖؖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0547 extends AbstractC0548 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f1966;

    public C0547(long j) {
        this.f1966 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0547)) {
            return false;
        }
        long j = ((C0547) obj).f1966;
        int i = C1327.f4593;
        return C4462.m7744(this.f1966, j);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f1966);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C1327.m2827(this.f1966)) + ')';
    }

    @Override // p000.AbstractC0548
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1239(float f, long j, C0376 c0376) {
        c0376.m807(1.0f);
        long jM2826 = this.f1966;
        if (f != 1.0f) {
            jM2826 = C1327.m2826(jM2826, C1327.m2823(jM2826) * f, 14);
        }
        c0376.m818(jM2826);
        if (((Shader) c0376.f1399) != null) {
            c0376.m815(null);
        }
    }
}
