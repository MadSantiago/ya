package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦُۣۚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5167 extends AbstractC0096 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C0588 f17107;

    public C5167(C0588 c0588) {
        this.f17107 = c0588;
    }

    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f17107.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1205 c1205 = this.f17107.f2193;
        AbstractC5848[] abstractC5848Arr = new AbstractC5848[8];
        for (int i = 0; i < 8; i++) {
            abstractC5848Arr[i] = new C2939(2);
        }
        return new C0813(c1205, abstractC5848Arr);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f17107.f2192;
    }
}
