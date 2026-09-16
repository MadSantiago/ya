package p000;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: ۥِؔؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0369 extends AbstractC1434 {

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC4455 f1357;

    public C0369(InterfaceC4455 interfaceC4455) {
        this.f1357 = interfaceC4455;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0369) && AbstractC3831.m6874(((C0369) obj).f1357, this.f1357);
    }

    public final int hashCode() {
        return this.f1357.hashCode();
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۥۜ */
    public final List mo793(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo543 = this.f1357.mo543(x509Certificate);
            if (x509CertificateMo543 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo543)) {
                    arrayList.add(x509CertificateMo543);
                }
                if (AbstractC3831.m6874(x509CertificateMo543.getIssuerDN(), x509CertificateMo543.getSubjectDN())) {
                    try {
                        x509CertificateMo543.verify(x509CertificateMo543.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (AbstractC3831.m6874(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
