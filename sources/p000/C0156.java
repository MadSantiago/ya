package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ۥؐٛۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0156 implements Iterator, InterfaceC0443, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC0443 f594;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f595;

    /* JADX INFO: renamed from: ۦۨ */
    public int f596;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f596;
            if (i != 0) {
                break;
            }
            this.f596 = 5;
            InterfaceC0443 interfaceC0443 = this.f594;
            this.f594 = null;
            interfaceC0443.mo335(C2358.f7817);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw m337();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f596;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            C0178.m381();
            return null;
        }
        if (i == 2) {
            this.f596 = 1;
            throw null;
        }
        if (i != 3) {
            throw m337();
        }
        this.f596 = 0;
        Object obj = this.f595;
        this.f595 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return C4794.f15814;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        AbstractC0186.m409(obj);
        this.f596 = 4;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m336(InterfaceC0443 interfaceC0443, Object obj) {
        this.f595 = obj;
        this.f596 = 3;
        this.f594 = interfaceC0443;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final RuntimeException m337() {
        int i = this.f596;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f596);
    }
}
