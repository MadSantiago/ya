package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦُْؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3894 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Iterator f13014;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13015 = 1;

    public C3894(C3881 c3881) {
        AbstractC5848[] abstractC5848Arr = new AbstractC5848[8];
        for (int i = 0; i < 8; i++) {
            abstractC5848Arr[i] = new C1021(this);
        }
        this.f13014 = new C0603(c3881, abstractC5848Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13015) {
            case 0:
                return ((C0603) this.f13014).f6930;
            default:
                return this.f13014.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13015) {
            case 0:
                return (Map.Entry) ((C0603) this.f13014).next();
            default:
                return (AbstractC1090) this.f13014.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13015) {
            case 0:
                ((C0603) this.f13014).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3894(C2715 c2715) {
        this.f13014 = c2715.f9001.iterator();
    }
}
