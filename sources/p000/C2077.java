package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ۥَۖؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2077 implements InterfaceC4131 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0288 f6857 = new C0288();

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo635() {
        boolean z = C1812.f6037;
        return C1812.f6037;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo636(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۣ */
    public final String mo637(SSLSocket sSLSocket) {
        if (mo636(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo638(SSLSocket sSLSocket, String str, List list) {
        if (mo636(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C3216 c3216 = C3216.f10772;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C3223.m5942(list).toArray(new String[0]));
        }
    }
}
