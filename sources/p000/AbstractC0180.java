package p000;

/* JADX INFO: renamed from: ۥؑؒۥِ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0180 implements Cloneable {

    /* JADX INFO: renamed from: ۦ۟ */
    public AbstractC0318 f666;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0318 f667;

    public AbstractC0180(AbstractC0318 abstractC0318) {
        this.f667 = abstractC0318;
        if (abstractC0318.m680()) {
            C1078.m2272("Default instance must be immutable.");
            throw null;
        }
        this.f666 = abstractC0318.m678();
    }

    public final Object clone() {
        AbstractC0180 abstractC0180 = (AbstractC0180) this.f667.mo674(5);
        abstractC0180.f666 = m401();
        return abstractC0180;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC0318 m401() {
        boolean zM680 = this.f666.m680();
        AbstractC0318 abstractC0318 = this.f666;
        if (!zM680) {
            return abstractC0318;
        }
        abstractC0318.getClass();
        C5734 c5734 = C5734.f18904;
        c5734.getClass();
        c5734.m9541(abstractC0318.getClass()).mo3387(abstractC0318);
        abstractC0318.m676();
        return this.f666;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0318 m402() {
        AbstractC0318 abstractC0318M401 = m401();
        abstractC0318M401.getClass();
        if (AbstractC0318.m671(abstractC0318M401, true)) {
            return abstractC0318M401;
        }
        throw new C2686();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m403() {
        if (this.f666.m680()) {
            return;
        }
        AbstractC0318 abstractC0318M678 = this.f667.m678();
        AbstractC0318 abstractC0318 = this.f666;
        C5734 c5734 = C5734.f18904;
        c5734.getClass();
        c5734.m9541(abstractC0318M678.getClass()).mo3386(abstractC0318M678, abstractC0318);
        this.f666 = abstractC0318M678;
    }
}
