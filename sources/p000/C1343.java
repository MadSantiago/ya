package p000;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥٔؔٚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 extends ProxySelector {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1343 f4628 = new C1343();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        C1078.m2272("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
