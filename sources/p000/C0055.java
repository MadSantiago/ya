package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦؓ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0055 extends AbstractC0015 implements RandomAccess {

    /* JADX INFO: renamed from: ۥْ */
    public final int f10618;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f10619;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0015 f10620;

    public C0055(AbstractC0015 abstractC0015, int i, int i2) {
        this.f10620 = abstractC0015;
        this.f10619 = i;
        AbstractC3933.m7102(i, i2, abstractC0015.mo624());
        this.f10618 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f10618;
        if (i < 0 || i >= i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return null;
        }
        return this.f10620.get(this.f10619 + i);
    }

    @Override // p000.AbstractC0015, java.util.List
    public final List subList(int i, int i2) {
        AbstractC3933.m7102(i, i2, this.f10618);
        int i3 = this.f10619;
        return new C0055(this.f10620, i + i3, i3 + i2);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f10618;
    }
}
