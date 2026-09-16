package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: ۦٕؑٛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4210 implements InterfaceC4131 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3726 f13978 = new C3726();

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo635() {
        boolean z = C1217.f4205;
        return C1217.f4205;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo636(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۣ */
    public final String mo637(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo638(SSLSocket sSLSocket, String str, List list) {
        if (mo636(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C3216 c3216 = C3216.f10772;
            parameters.setApplicationProtocols((String[]) C3223.m5942(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
