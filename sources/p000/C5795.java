package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۦ٘ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5795 extends AbstractC0015 {

    /* JADX INFO: renamed from: ۥْ */
    public final int f19089;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f19090;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0073 f19091;

    public C5795(AbstractC0073 abstractC0073, int i, int i2) {
        this.f19091 = abstractC0073;
        this.f19090 = i;
        AbstractC0487.m1050(i, i2, abstractC0073.mo624());
        this.f19089 = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0487.m1076(i, this.f19089);
        return this.f19091.get(this.f19090 + i);
    }

    @Override // p000.AbstractC0015, java.util.List
    public final List subList(int i, int i2) {
        AbstractC0487.m1050(i, i2, this.f19089);
        int i3 = this.f19090;
        return new C5795(this.f19091, i + i3, i3 + i2);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f19089;
    }
}
