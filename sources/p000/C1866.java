package p000;

/* JADX INFO: renamed from: ۥۣٝؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1866 extends AbstractC5752 implements InterfaceC3101 {

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC0386 f6209;

    public C1866(AbstractC0386 abstractC0386) {
        this.f6209 = abstractC0386;
    }

    @Override // p000.InterfaceC3101
    public final InterfaceC3196 getParent() {
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 != null) {
            return abstractC0386;
        }
        return null;
    }

    @Override // p000.InterfaceC3101
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo3717(Throwable th) {
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 == null) {
            abstractC0386 = null;
        }
        return abstractC0386.mo850(th);
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo922() {
        return true;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo923(Throwable th) {
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 == null) {
            abstractC0386 = null;
        }
        this.f6209.m858(abstractC0386);
    }
}
