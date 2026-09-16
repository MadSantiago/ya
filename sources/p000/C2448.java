package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٟ۟ؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2448 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f8152;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5630 f8153;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f8154 = -1;

    /* JADX INFO: renamed from: ۦۨ */
    public final Iterator f8155;

    public C2448(C5630 c5630) {
        this.f8153 = c5630;
        this.f8155 = c5630.f18559.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8154 == -1) {
            m4569();
        }
        return this.f8154 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8154 == -1) {
            m4569();
        }
        if (this.f8154 == 0) {
            C0178.m381();
            return null;
        }
        Object obj = this.f8152;
        this.f8152 = null;
        this.f8154 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4569() {
        Object next;
        do {
            Iterator it = this.f8155;
            if (!it.hasNext()) {
                this.f8154 = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) this.f8153.f18558.mo211(next)).booleanValue());
        this.f8152 = next;
        this.f8154 = 1;
    }
}
