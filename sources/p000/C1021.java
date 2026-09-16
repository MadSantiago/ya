package p000;

/* JADX INFO: renamed from: ۥَُؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1021 extends AbstractC5848 {

    /* JADX INFO: renamed from: ۥٓ */
    public final C3894 f3608;

    public C1021(C3894 c3894) {
        this.f3608 = c3894;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f19273;
        this.f19273 = i + 2;
        Object[] objArr = this.f19275;
        return new C4143(this.f3608, objArr[i], objArr[i + 1]);
    }
}
