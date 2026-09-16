package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: ۥَٕؗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1425 extends AbstractC4821 implements NavigableSet, Iterable {

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ int f4897 = 0;

    /* JADX INFO: renamed from: ۥَ */
    public transient AbstractC1425 f4898;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient Comparator f4899;

    public AbstractC1425(Comparator comparator) {
        this.f4899 = comparator;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C2912 m3025(Comparator comparator) {
        if (C1160.f4027 == comparator) {
            return C2912.f9705;
        }
        C1868 c1868 = AbstractC4822.f15887;
        return new C2912(C4645.f15320, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f4899;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC1425 abstractC1425M3025 = this.f4898;
        if (abstractC1425M3025 == null) {
            C2912 c2912 = (C2912) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c2912.f4899);
            abstractC1425M3025 = c2912.isEmpty() ? m3025(comparatorReverseOrder) : new C2912(c2912.f9706.mo2770(), comparatorReverseOrder);
            this.f4898 = abstractC1425M3025;
            abstractC1425M3025.f4898 = this;
        }
        return abstractC1425M3025;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        C2912 c2912 = (C2912) this;
        return c2912.m5487(0, c2912.m5488(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        C2912 c2912 = (C2912) this;
        return c2912.m5487(c2912.m5486(obj, true), c2912.f9706.size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: ۦ۟, reason: merged with bridge method [inline-methods] */
    public final C2912 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        AbstractC0949.m1941(this.f4899.compare(obj, obj2) <= 0);
        C2912 c2912 = (C2912) this;
        C2912 c2912M5487 = c2912.m5487(c2912.m5486(obj, z), c2912.f9706.size());
        return c2912M5487.m5487(0, c2912M5487.m5488(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        C2912 c2912 = (C2912) this;
        return c2912.m5487(0, c2912.m5488(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        C2912 c2912 = (C2912) this;
        return c2912.m5487(c2912.m5486(obj, z), c2912.f9706.size());
    }
}
