package p000;

/* JADX INFO: renamed from: ۥٙٙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1691 extends AbstractC0028 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object[] f5638;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3110 f5639;

    public C1691(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.f5638 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f5639 = new C3110(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        C3110 c3110 = this.f5639;
        if (c3110.hasNext()) {
            this.f5661++;
            return c3110.next();
        }
        int i = this.f5661;
        this.f5661 = i + 1;
        return this.f5638[i - c3110.f5660];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0178.m381();
            return null;
        }
        int i = this.f5661;
        C3110 c3110 = this.f5639;
        int i2 = c3110.f5660;
        if (i <= i2) {
            this.f5661 = i - 1;
            return c3110.previous();
        }
        int i3 = i - 1;
        this.f5661 = i3;
        return this.f5638[i3 - i2];
    }
}
