package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: ۦٔؒۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4167 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InetSocketAddress f13866;

    /* JADX INFO: renamed from: ۥۗ */
    public final Proxy f13867;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3462 f13868;

    public C4167(C3462 c3462, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.f13868 = c3462;
        this.f13867 = proxy;
        this.f13866 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4167)) {
            return false;
        }
        C4167 c4167 = (C4167) obj;
        return c4167.f13868.equals(this.f13868) && c4167.f13867.equals(this.f13867) && AbstractC3831.m6874(c4167.f13866, this.f13866);
    }

    public final int hashCode() {
        return this.f13866.hashCode() + ((this.f13867.hashCode() + ((this.f13868.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f13866 + '}';
    }
}
