package p000;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: ۥِٕؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1107 implements InterfaceC4455 {

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f3893;

    public C1107(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f3893 = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1107) && ((C1107) obj).f3893.equals(this.f3893);
        }
        return true;
    }

    public final int hashCode() {
        return this.f3893.hashCode();
    }

    @Override // p000.InterfaceC4455
    /* JADX INFO: renamed from: ۥۣ */
    public final X509Certificate mo543(X509Certificate x509Certificate) {
        Set set = (Set) this.f3893.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }
}
