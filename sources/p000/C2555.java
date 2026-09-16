package p000;

/* JADX INFO: renamed from: ۥًۡؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2555 extends AbstractC4821 {

    /* JADX INFO: renamed from: ۥَ */
    public final transient C2299 f8522;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient C5147 f8523;

    public C2555(C5147 c5147, C2299 c2299) {
        this.f8523 = c5147;
        this.f8522 = c2299;
    }

    @Override // p000.AbstractC2857, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8523.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8523.f17054;
    }

    @Override // p000.AbstractC4821, p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4822 mo4834() {
        return this.f8522;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return true;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1603(Object[] objArr) {
        return this.f8522.mo1603(objArr);
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0219 iterator() {
        return this.f8522.listIterator(0);
    }
}
