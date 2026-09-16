package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۥْۣٓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1299 extends AbstractC4822 {

    /* JADX INFO: renamed from: ۥْ */
    public final transient AbstractC4822 f4461;

    public C1299(AbstractC4822 abstractC4822) {
        this.f4461 = abstractC4822;
    }

    @Override // p000.AbstractC4822, p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4461.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4822 abstractC4822 = this.f4461;
        AbstractC0949.m1955(i, abstractC4822.size());
        return abstractC4822.get((abstractC4822.size() - 1) - i);
    }

    @Override // p000.AbstractC4822, java.util.List
    public final int indexOf(Object obj) {
        AbstractC4822 abstractC4822 = this.f4461;
        int iLastIndexOf = abstractC4822.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC4822.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p000.AbstractC4822, p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC4822, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC4822 abstractC4822 = this.f4461;
        int iIndexOf = abstractC4822.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC4822.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p000.AbstractC4822, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4461.size();
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return this.f4461.mo352();
    }

    @Override // p000.AbstractC4822, java.util.List
    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC4822 subList(int i, int i2) {
        AbstractC4822 abstractC4822 = this.f4461;
        AbstractC0949.m1968(i, i2, abstractC4822.size());
        return abstractC4822.subList(abstractC4822.size() - i2, abstractC4822.size() - i).mo2770();
    }

    @Override // p000.AbstractC4822
    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC4822 mo2770() {
        return this.f4461;
    }

    @Override // p000.AbstractC4822, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
