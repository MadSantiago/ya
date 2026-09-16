package p000;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: ۦؘؑؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3462 {

    /* JADX INFO: renamed from: ۥؗ */
    public final HostnameVerifier f11484;

    /* JADX INFO: renamed from: ۥُ */
    public final ProxySelector f11485;

    /* JADX INFO: renamed from: ۥّ */
    public final C0774 f11486;

    /* JADX INFO: renamed from: ۥۗ */
    public final SSLSocketFactory f11487;

    /* JADX INFO: renamed from: ۥۜ */
    public final List f11488;

    /* JADX INFO: renamed from: ۥۣ */
    public final SocketFactory f11489;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3175 f11490;

    /* JADX INFO: renamed from: ۦۙ */
    public final List f11491;

    public C3462(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C3175 c3175, List list, List list2, ProxySelector proxySelector) {
        this.f11489 = socketFactory;
        this.f11487 = sSLSocketFactory;
        this.f11484 = hostnameVerifier;
        this.f11490 = c3175;
        this.f11485 = proxySelector;
        C3303 c3303 = new C3303();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c3303.f11063 = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                C1078.m2272("unexpected scheme: ".concat(str2));
                throw null;
            }
            c3303.f11063 = "https";
        }
        String strM5186 = AbstractC2774.m5186(C3223.m5940(str, 0, 0, 7));
        if (strM5186 == null) {
            C1078.m2272("unexpected host: ".concat(str));
            throw null;
        }
        c3303.f11064 = strM5186;
        if (1 > i || i >= 65536) {
            C1078.m2273(AbstractC5078.m8670(i, "unexpected port: "));
            throw null;
        }
        c3303.f11059 = i;
        this.f11486 = c3303.m6064();
        this.f11491 = AbstractC4031.m7213(list);
        this.f11488 = AbstractC4031.m7213(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3462)) {
            return false;
        }
        C3462 c3462 = (C3462) obj;
        return this.f11486.equals(c3462.f11486) && m6239(c3462);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11490) + ((Objects.hashCode(this.f11484) + ((Objects.hashCode(this.f11487) + ((this.f11485.hashCode() + ((this.f11488.hashCode() + ((this.f11491.hashCode() + ((C1397.f4802.hashCode() + ((C1397.f4788.hashCode() + AbstractC5078.m8674(527, 31, this.f11486.f2803)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0774 c0774 = this.f11486;
        sb.append(c0774.f2801);
        sb.append(':');
        sb.append(c0774.f2796);
        sb.append(", ");
        sb.append("proxySelector=" + this.f11485);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m6239(C3462 c3462) {
        return this.f11491.equals(c3462.f11491) && this.f11488.equals(c3462.f11488) && AbstractC3831.m6874(this.f11485, c3462.f11485) && AbstractC3831.m6874(this.f11487, c3462.f11487) && AbstractC3831.m6874(this.f11484, c3462.f11484) && AbstractC3831.m6874(this.f11490, c3462.f11490) && this.f11486.f2796 == c3462.f11486.f2796;
    }
}
