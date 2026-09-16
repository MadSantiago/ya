package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۦؑؔؓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3030 implements InterfaceC4131 {

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC4131 f10191;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2521 f10192;

    public C3030(InterfaceC2521 interfaceC2521) {
        this.f10192 = interfaceC2521;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo635() {
        return true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final synchronized InterfaceC4131 m5618(SSLSocket sSLSocket) {
        try {
            if (this.f10191 == null && this.f10192.mo610(sSLSocket)) {
                this.f10191 = this.f10192.mo611(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10191;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo636(SSLSocket sSLSocket) {
        return this.f10192.mo610(sSLSocket);
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۣ */
    public final String mo637(SSLSocket sSLSocket) {
        InterfaceC4131 interfaceC4131M5618 = m5618(sSLSocket);
        if (interfaceC4131M5618 != null) {
            return interfaceC4131M5618.mo637(sSLSocket);
        }
        return null;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo638(SSLSocket sSLSocket, String str, List list) {
        InterfaceC4131 interfaceC4131M5618 = m5618(sSLSocket);
        if (interfaceC4131M5618 != null) {
            interfaceC4131M5618.mo638(sSLSocket, str, list);
        }
    }
}
