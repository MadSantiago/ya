package p000;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٔؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1354 extends AbstractSet {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5441 f4658;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f4659;

    public C1354(C5441 c5441, int i) {
        this.f4658 = c5441;
        this.f4659 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f4658.f17957, m2862(), m2863(), obj, this.f4659 == -1 ? C5441.f17952 : C5324.f17569) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2692(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return m2863() - m2862();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m2862() {
        int i = this.f4659;
        if (i == -1) {
            return 0;
        }
        return this.f4658.f17956[i];
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m2863() {
        return this.f4658.f17956[this.f4659 + 1];
    }
}
