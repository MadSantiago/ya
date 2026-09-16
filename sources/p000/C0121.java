package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥؐؔؑۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0121 extends AbstractC0095 implements InterfaceC3984 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C3881 f477;

    public C0121(C3881 c3881) {
        this.f477 = c3881;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f477.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f477.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        AbstractC5848[] abstractC5848Arr = new AbstractC5848[8];
        for (int i = 0; i < 8; i++) {
            abstractC5848Arr[i] = new C2939(2);
        }
        return new C2881(this.f477, abstractC5848Arr);
    }

    @Override // p000.AbstractC0095
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo220() {
        return this.f477.f12966;
    }
}
