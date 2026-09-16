package p000;

/* JADX INFO: renamed from: ۥؘٝؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1872 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C5157 f6219;

    public C1872(C5157 c5157) {
        this.f6219 = c5157;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1872) {
            return this.f6219 == ((C1872) obj).f6219;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6219.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0485 c0485 = (C0485) abstractC5381;
        C5157 c5157 = this.f6219;
        c0485.f1764 = c5157;
        if (c0485.f17786) {
            c5157.mo211(c0485.f1765);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C0485(this.f6219);
    }
}
