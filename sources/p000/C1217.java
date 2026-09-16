package p000;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: renamed from: ۥْٟؕؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1217 extends C3216 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f4205;

    /* JADX INFO: renamed from: ۥؗ */
    public final Provider f4206 = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C3133.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f4205 = z;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦٌ */
    public final X509TrustManager mo2583() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        C1078.m2278("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦۗ */
    public final SSLContext mo2584() {
        return SSLContext.getInstance("TLS", this.f4206);
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1374(SSLSocket sSLSocket, String str, List list) {
    }
}
