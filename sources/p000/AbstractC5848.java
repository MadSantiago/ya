package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦًؘۧ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5848 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public int f19273;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f19274;

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f19275 = C1205.f4146.f4150;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19273 < this.f19274;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9668(Object[] objArr, int i, int i2) {
        this.f19275 = objArr;
        this.f19274 = i;
        this.f19273 = i2;
    }
}
