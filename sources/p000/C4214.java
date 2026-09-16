package p000;

/* JADX INFO: renamed from: ۦَٕؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4214 implements InterfaceC4334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f13983;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC1814 f13984;

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1814 f13985;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1280 f13986;

    /* JADX INFO: renamed from: ۥۜ */
    public long f13987;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2707 f13988;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f13989;

    /* JADX INFO: renamed from: ۦٛ */
    public AbstractC1814 f13990;

    /* JADX INFO: renamed from: ۦۙ */
    public final AbstractC1814 f13991;

    public C4214(InterfaceC3347 interfaceC3347, C1280 c1280, Object obj, Object obj2, AbstractC1814 abstractC1814) {
        this.f13988 = interfaceC3347.mo827(c1280);
        this.f13986 = c1280;
        this.f13983 = obj2;
        this.f13989 = obj;
        this.f13984 = (AbstractC1814) c1280.f4359.mo211(obj);
        InterfaceC4745 interfaceC4745 = c1280.f4359;
        this.f13985 = (AbstractC1814) interfaceC4745.mo211(obj2);
        this.f13991 = abstractC1814 != null ? AbstractC3933.m7072(abstractC1814) : ((AbstractC1814) interfaceC4745.mo211(obj)).mo2171();
        this.f13987 = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f13989 + " -> " + this.f13983 + ",initial velocity: " + this.f13991 + ", duration: " + (mo2834() / 1000000) + " ms,animationSpec: " + this.f13988;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo2834() {
        long j = this.f13987;
        if (j >= 0) {
            return j;
        }
        long jMo3123 = this.f13988.mo3123(this.f13984, this.f13985, this.f13991);
        this.f13987 = jMo3123;
        return jMo3123;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo2835() {
        return this.f13983;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1814 mo2836(long j) {
        if (!m7629(j)) {
            return this.f13988.mo687(j, this.f13984, this.f13985, this.f13991);
        }
        AbstractC1814 abstractC1814 = this.f13990;
        if (abstractC1814 != null) {
            return abstractC1814;
        }
        AbstractC1814 abstractC1814Mo3122 = this.f13988.mo3122(this.f13984, this.f13985, this.f13991);
        this.f13990 = abstractC1814Mo3122;
        return abstractC1814Mo3122;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo2837(long j) {
        if (m7629(j)) {
            return this.f13983;
        }
        AbstractC1814 abstractC1814Mo700 = this.f13988.mo700(j, this.f13984, this.f13985, this.f13991);
        int iMo2173 = abstractC1814Mo700.mo2173();
        for (int i = 0; i < iMo2173; i++) {
            if (Float.isNaN(abstractC1814Mo700.mo2174(i))) {
                AbstractC0388.m901("AnimationVector cannot contain a NaN. " + abstractC1814Mo700 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f13986.f4358.mo211(abstractC1814Mo700);
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo2838() {
        return this.f13988.mo2726();
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۦؑ */
    public final C1280 mo2839() {
        return this.f13986;
    }
}
