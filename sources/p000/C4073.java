package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦُْٜؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4073 {

    /* JADX INFO: renamed from: ۥؗ */
    public final List f13562;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5700 f13563;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC2044 f13564;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2432 f13565;

    public C4073(EnumC2044 enumC2044, C5700 c5700, List list, InterfaceC4448 interfaceC4448) {
        this.f13564 = enumC2044;
        this.f13563 = c5700;
        this.f13562 = list;
        this.f13565 = new C2432(new C5285(10, interfaceC4448));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4073)) {
            return false;
        }
        C4073 c4073 = (C4073) obj;
        return c4073.f13564 == this.f13564 && c4073.f13563 == this.f13563 && AbstractC3831.m6874(c4073.m7257(), m7257()) && c4073.f13562.equals(this.f13562);
    }

    public final int hashCode() {
        return this.f13562.hashCode() + ((m7257().hashCode() + ((this.f13563.hashCode() + ((this.f13564.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listM7257 = m7257();
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(listM7257, 10));
        for (Certificate certificate : listM7257) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f13564);
        sb.append(" cipherSuite=");
        sb.append(this.f13563);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f13562;
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final List m7257() {
        return (List) this.f13565.getValue();
    }
}
