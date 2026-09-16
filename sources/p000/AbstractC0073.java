package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦٔ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0073 extends AbstractC0015 {
    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC0015, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC0015, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC0015, java.util.List
    public final List subList(int i, int i2) {
        return new C5795(this, i, i2);
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract AbstractC0073 mo622(Object obj);

    /* JADX INFO: renamed from: ۥّ */
    public AbstractC0073 mo623(Collection collection) {
        C4250 c4250Mo629 = mo629();
        c4250Mo629.addAll(collection);
        return c4250Mo629.m7514();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public abstract AbstractC0073 mo625(C0025 c0025);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract AbstractC0073 mo626(int i, Object obj);

    /* JADX INFO: renamed from: ۦِ */
    public abstract AbstractC0073 mo627(int i, Object obj);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract AbstractC0073 mo628(int i);

    /* JADX INFO: renamed from: ۦۙ */
    public abstract C4250 mo629();
}
