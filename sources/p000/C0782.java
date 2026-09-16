package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥؚؕؖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0782 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5630 f2824;

    /* JADX INFO: renamed from: ۦۨ */
    public final Iterator f2825;

    public C0782(C5630 c5630) {
        this.f2824 = c5630;
        this.f2825 = c5630.f18559.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2825.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2824.f18558.mo211(this.f2825.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
