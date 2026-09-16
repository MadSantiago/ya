package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦؘْ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3516 implements InterfaceC3862, Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f11641;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f11642;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2575 f11643;

    public C3516(C2575 c2575, int i, int i2) {
        this.f11643 = c2575;
        this.f11642 = i;
        this.f11641 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3516)) {
            return false;
        }
        C3516 c3516 = (C3516) obj;
        return c3516.f11642 == this.f11642 && c3516.f11641 == this.f11641 && c3516.f11643 == this.f11643;
    }

    public final int hashCode() {
        return (this.f11643.hashCode() * 31) + this.f11642;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2575 c2575 = this.f11643;
        if (c2575.f8601 != this.f11641) {
            AbstractC3809.m6809();
        }
        int i = this.f11642;
        c2575.m4874(i);
        return new C3524(c2575, i + 1, c2575.f8603[(i * 5) + 3] + i);
    }
}
