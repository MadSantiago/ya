package p000;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ۥْؒۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0288 implements InterfaceC2521 {
    @Override // p000.InterfaceC2521
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo610(SSLSocket sSLSocket) {
        return C1812.f6037 && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000.InterfaceC2521
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC4131 mo611(SSLSocket sSLSocket) {
        return new C2077();
    }
}
