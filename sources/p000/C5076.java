package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦۣۘؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5076 extends AbstractC0015 {

    /* JADX INFO: renamed from: ۦۨ */
    public final List f16833;

    public C5076(List list) {
        this.f16833 = list;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f16833.get(AbstractC0973.m2053(i, this));
    }

    @Override // p000.AbstractC0015, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2158(this, 0);
    }

    @Override // p000.AbstractC0015, java.util.List
    public final ListIterator listIterator() {
        return new C2158(this, 0);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f16833.size();
    }

    @Override // p000.AbstractC0015, java.util.List
    public final ListIterator listIterator(int i) {
        return new C2158(this, i);
    }
}
