package p000;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ۥٜؒٝۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1812 extends C3216 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f6037;

    /* JADX INFO: renamed from: ۥؗ */
    public final Provider f6038 = Conscrypt.newProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC5849.class.getClassLoader());
            if (Conscrypt.isAvailable() && AbstractC5849.m9669()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f6037 = z;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1374(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC1658) obj) != EnumC1658.f5517) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC1658) it.next()).f5518);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؚ */
    public final SSLSocketFactory mo3593(X509TrustManager x509TrustManager) throws KeyManagementException {
        SSLContext sSLContextMo2584 = mo2584();
        sSLContextMo2584.init(null, new TrustManager[]{x509TrustManager}, null);
        return sSLContextMo2584.getSocketFactory();
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦٌ */
    public final X509TrustManager mo2583() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C2746.f9086);
                return x509TrustManager;
            }
        }
        C1078.m2278("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦۗ */
    public final SSLContext mo2584() {
        return SSLContext.getInstance("TLS", this.f6038);
    }
}
