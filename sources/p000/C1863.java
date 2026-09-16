package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ۥٝؒٛۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1863 implements InterfaceC4242, InterfaceC2728 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1387 f6205;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2600 f6206;

    public C1863(C1387 c1387, C2600 c2600) {
        this.f6205 = c1387;
        this.f6206 = c2600;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return this.f6206.f8690;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        this.f6206.mo335(obj);
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۥْ */
    public final void mo3710(Object obj) throws C0768 {
        this.f6206.mo3710(obj);
    }

    @Override // p000.InterfaceC2728
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo681(AbstractC4971 abstractC4971, int i) {
        this.f6206.mo681(abstractC4971, i);
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۦِ */
    public final C5536 mo3711(Object obj, InterfaceC2609 interfaceC2609) {
        C1387 c1387 = this.f6205;
        C3032 c3032 = new C3032(c1387, this);
        C5536 c5536Mo3711 = this.f6206.mo3711((C2358) obj, c3032);
        if (c5536Mo3711 != null) {
            C1387.f4741.set(c1387, null);
        }
        return c5536Mo3711;
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo3712(Object obj, InterfaceC2609 interfaceC2609) throws C0768 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1387.f4741;
        C1387 c1387 = this.f6205;
        atomicReferenceFieldUpdater.set(c1387, null);
        C0091 c0091 = new C0091(22, c1387, this);
        C2600 c2600 = this.f6206;
        c2600.m4910(C2358.f7817, c2600.f18326, new C3032(0, c0091));
    }

    @Override // p000.InterfaceC4242
    /* JADX INFO: renamed from: ۦۨ */
    public final boolean mo3713(Throwable th) {
        return this.f6206.mo3713(th);
    }
}
