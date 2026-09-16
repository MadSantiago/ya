package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥۘؕۦُ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2172 implements InterfaceC3424, InterfaceC3500 {

    /* JADX INFO: renamed from: ۥْ */
    public final C3950 f7170;

    /* JADX INFO: renamed from: ۥٓ */
    public C2127 f7171;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC5731 f7172;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3534 f7173;

    public C2172(InterfaceC3534 interfaceC3534, InterfaceC5731 interfaceC5731) {
        this.f7173 = interfaceC3534;
        this.f7172 = interfaceC5731;
        this.f7170 = AbstractC4009.m7151(interfaceC3534.mo860(this));
    }

    @Override // p000.InterfaceC4137
    public final InterfaceC2218 getKey() {
        return C1298.f4446;
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3769() {
        C2127 c2127 = this.f7171;
        if (c2127 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            c2127.mo871(cancellationException);
        }
        this.f7171 = AbstractC2765.m5135(this.f7170, null, 0, this.f7172, 3);
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3770() {
        C2127 c2127 = this.f7171;
        if (c2127 != null) {
            c2127.mo885(new C4013(1));
        }
        this.f7171 = null;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(obj, this);
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3772() {
        C2127 c2127 = this.f7171;
        if (c2127 != null) {
            c2127.mo885(new C4013(1));
        }
        this.f7171 = null;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6798(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3500
    /* JADX INFO: renamed from: ۦٕ */
    public final void mo1639(InterfaceC3534 interfaceC3534, Throwable th) throws Throwable {
        C2805 c2805 = (C2805) interfaceC3534.mo865(C2805.f9360);
        if (c2805 != null) {
            AbstractC0487.m1058(th, new C1225(8, c2805, this));
        }
        InterfaceC3500 interfaceC3500 = (InterfaceC3500) this.f7173.mo865(C1298.f4446);
        if (interfaceC3500 == null) {
            throw th;
        }
        interfaceC3500.mo1639(interfaceC3534, th);
    }
}
