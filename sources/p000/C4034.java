package p000;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۦّؔۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4034 implements InterfaceC4131 {
    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo635() {
        C3216 c3216 = C3216.f10772;
        return C3223.m5933() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo636(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۣ */
    public final String mo637(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo638(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C3216 c3216 = C3216.f10772;
            sSLParameters.setApplicationProtocols((String[]) C3223.m5942(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
