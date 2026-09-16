package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥَُٖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1049 implements Iterator {

    /* JADX INFO: renamed from: ۦۨ */
    public final Iterator f3715;

    public C1049(C5645 c5645) {
        this.f3715 = c5645.f18597.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3715.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f3715.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
