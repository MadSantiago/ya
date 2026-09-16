package p000;

/* JADX INFO: renamed from: ۦًؖؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3372 extends AbstractC1958 {

    /* JADX INFO: renamed from: ۥْ */
    public final transient AbstractC1958 f11258;

    public C3372(AbstractC1958 abstractC1958) {
        this.f11258 = abstractC1958;
    }

    @Override // p000.AbstractC1958, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11258.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1958 abstractC1958 = this.f11258;
        AbstractC0487.m1055(i, abstractC1958.size());
        return abstractC1958.get((abstractC1958.size() - 1) - i);
    }

    @Override // p000.AbstractC1958, java.util.List
    public final int indexOf(Object obj) {
        AbstractC1958 abstractC1958 = this.f11258;
        int iLastIndexOf = abstractC1958.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC1958.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p000.AbstractC1958, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC1958 abstractC1958 = this.f11258;
        int iIndexOf = abstractC1958.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC1958.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11258.size();
    }

    @Override // p000.AbstractC1958, java.util.List
    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC1958 subList(int i, int i2) {
        AbstractC1958 abstractC1958 = this.f11258;
        AbstractC0487.m1087(i, i2, abstractC1958.size());
        return abstractC1958.subList(abstractC1958.size() - i2, abstractC1958.size() - i).mo3841();
    }

    @Override // p000.AbstractC1958
    /* JADX INFO: renamed from: ۦۙ */
    public final AbstractC1958 mo3841() {
        return this.f11258;
    }
}
