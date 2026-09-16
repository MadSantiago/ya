package p000;

/* JADX INFO: renamed from: ۥٍَؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1017 implements InterfaceC0465 {

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f3603;

    public C1017(boolean z) {
        this.f3603 = z;
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("Empty{"), this.f3603 ? "Active" : "New", '}');
    }

    @Override // p000.InterfaceC0465
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo981() {
        return this.f3603;
    }

    @Override // p000.InterfaceC0465
    /* JADX INFO: renamed from: ۦؑ */
    public final C5835 mo982() {
        return null;
    }
}
