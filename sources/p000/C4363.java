package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦَؚٗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4363 extends AbstractC5676 {

    /* JADX INFO: renamed from: ۥَ */
    public final C3262 f14367;

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f14368;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3639 f14369;

    /* JADX INFO: renamed from: ۥٖ */
    public final C5322 f14370;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3262 f14371;

    public C4363() {
        super(1);
        this.f14371 = AbstractC4225.m7437();
        this.f14368 = new ArrayList();
        C3639 c3639 = AbstractC5705.f18789;
        this.f14369 = new C3639();
        this.f14367 = new C3262();
        C4164 c4164 = new C4164(14, this);
        AbstractC1538.m3277(AbstractC1538.f5208);
        synchronized (AbstractC1538.f5203) {
            AbstractC1538.f5207 = AbstractC0973.m2046(AbstractC1538.f5207, c4164);
        }
        this.f14370 = new C5322(9, c4164);
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦٌ */
    public final InterfaceC4745 mo7668(InterfaceC4783 interfaceC4783) {
        C3262 c3262 = this.f14367;
        InterfaceC4745 c0079 = (InterfaceC4745) c3262.m6027(interfaceC4783);
        if (c0079 == null) {
            c0079 = new C0079(23, this, interfaceC4783);
            int iM6017 = c3262.m6017(interfaceC4783);
            if (iM6017 < 0) {
                iM6017 = ~iM6017;
            }
            Object[] objArr = c3262.f10944;
            Object obj = objArr[iM6017];
            c3262.f10947[iM6017] = interfaceC4783;
            objArr[iM6017] = c0079;
        }
        return c0079;
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦِ */
    public final void mo7669() {
        synchronized (this.f18660) {
            try {
                ArrayList arrayList = this.f14368;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC2977 interfaceC2977 = (InterfaceC2977) arrayList.get(i);
                    if (interfaceC2977 instanceof C5896) {
                        AbstractC4225.m7449(this.f14371, ((C5896) interfaceC2977).f19445, ((C5896) interfaceC2977).f19444);
                    } else {
                        if (!(interfaceC2977 instanceof C2313)) {
                            throw new C1228(6);
                        }
                        AbstractC4225.m7492(this.f14371, ((C2313) interfaceC2977).f7650);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14368.clear();
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo7670(InterfaceC4783 interfaceC4783) {
        this.f14368.add(new C2313(interfaceC4783));
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo7671() {
        this.f14370.m8926();
        this.f14368.clear();
        this.f14367.m6020();
        synchronized (this.f18660) {
            this.f14371.m6020();
        }
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo7672(InterfaceC4541 interfaceC4541) {
        this.f14367.m6026(interfaceC4541);
        mo7670(interfaceC4541);
        mo7669();
    }
}
