package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۥۚ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2299 extends AbstractC4822 {

    /* JADX INFO: renamed from: ۥَ */
    public final transient int f7629;

    /* JADX INFO: renamed from: ۥْ */
    public final transient Object[] f7630;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient int f7631;

    public C2299(Object[] objArr, int i, int i2) {
        this.f7630 = objArr;
        this.f7631 = i;
        this.f7629 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0949.m1955(i, this.f7629);
        Object obj = this.f7630[(i * 2) + this.f7631];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7629;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return true;
    }
}
