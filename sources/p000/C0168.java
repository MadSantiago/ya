package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٖؑؑؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0168 extends AbstractC4822 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0725 f628;

    public C0168(C0725 c0725) {
        this.f628 = c0725;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0725 c0725 = this.f628;
        AbstractC0949.m1955(i, c0725.f2651);
        Object[] objArr = c0725.f2649;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f628.f2651;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return true;
    }
}
