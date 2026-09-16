package p000;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: renamed from: ۦۚؓۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5168 extends C3216 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f17108;

    /* JADX INFO: renamed from: ۥؗ */
    public final Provider f17109 = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, AbstractC5568.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f17108 = z;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦٌ */
    public final X509TrustManager mo2583() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f17109);
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
        return SSLContext.getInstance("TLSv1.3", this.f17109);
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1374(SSLSocket sSLSocket, String str, List list) {
    }
}
