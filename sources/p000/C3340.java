package p000;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ۦؘؖؓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3340 extends AbstractC1434 {

    /* JADX INFO: renamed from: ۥّ */
    public final X509TrustManager f11172;

    /* JADX INFO: renamed from: ۦۙ */
    public final X509TrustManagerExtensions f11173;

    public C3340(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f11172 = x509TrustManager;
        this.f11173 = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3340) && ((C3340) obj).f11172 == this.f11172;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f11172);
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۥۜ */
    public final List mo793(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.f11173.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
