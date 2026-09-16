package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ۥٟؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0263 implements InterfaceC4455 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Method f961;

    /* JADX INFO: renamed from: ۥۣ */
    public final X509TrustManager f962;

    public C0263(X509TrustManager x509TrustManager, Method method) {
        this.f962 = x509TrustManager;
        this.f961 = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0263)) {
            return false;
        }
        C0263 c0263 = (C0263) obj;
        return this.f962.equals(c0263.f962) && this.f961.equals(c0263.f961);
    }

    public final int hashCode() {
        return this.f961.hashCode() + (this.f962.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f962 + ", findByIssuerAndSignatureMethod=" + this.f961 + ')';
    }

    @Override // p000.InterfaceC4455
    /* JADX INFO: renamed from: ۥۣ */
    public final X509Certificate mo543(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.f961.invoke(this.f962, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
