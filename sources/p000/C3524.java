package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦؘؙؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3524 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public int f11669;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f11670;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f11671;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2575 f11672;

    public C3524(C2575 c2575, int i, int i2) {
        this.f11672 = c2575;
        this.f11671 = i2;
        this.f11669 = i;
        this.f11670 = c2575.f8601;
        if (c2575.f8600) {
            AbstractC3809.m6809();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11669 < this.f11671;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2575 c2575 = this.f11672;
        int i = c2575.f8601;
        int i2 = this.f11670;
        if (i != i2) {
            AbstractC3809.m6809();
        }
        int i3 = this.f11669;
        this.f11669 = c2575.f8603[(i3 * 5) + 3] + i3;
        return new C3516(c2575, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
