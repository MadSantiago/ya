package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۥؘٕؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1421 extends AbstractC4822 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ AbstractC4822 f4891;

    /* JADX INFO: renamed from: ۥْ */
    public final transient int f4892;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient int f4893;

    public C1421(AbstractC4822 abstractC4822, int i, int i2) {
        this.f4891 = abstractC4822;
        this.f4892 = i;
        this.f4893 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0949.m1955(i, this.f4893);
        return this.f4891.get(i + this.f4892);
    }

    @Override // p000.AbstractC4822, p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC4822, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4893;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥُ */
    public final Object[] mo3022() {
        return this.f4891.mo3022();
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3023() {
        return this.f4891.mo3024() + this.f4892 + this.f4893;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return true;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo3024() {
        return this.f4891.mo3024() + this.f4892;
    }

    @Override // p000.AbstractC4822, java.util.List
    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC4822 subList(int i, int i2) {
        AbstractC0949.m1968(i, i2, this.f4893);
        int i3 = this.f4892;
        return this.f4891.subList(i + i3, i2 + i3);
    }

    @Override // p000.AbstractC4822, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
