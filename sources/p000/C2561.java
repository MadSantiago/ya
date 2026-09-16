package p000;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ۥۡؔۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2561 implements Cloneable {

    /* JADX INFO: renamed from: ۥَ */
    public final ProxySelector f8540;

    /* JADX INFO: renamed from: ۥْ */
    public final List f8541;

    /* JADX INFO: renamed from: ۥٓ */
    public final List f8542;

    /* JADX INFO: renamed from: ۥٖ */
    public final SocketFactory f8543;

    /* JADX INFO: renamed from: ۥٙ */
    public final C3121 f8544;

    /* JADX INFO: renamed from: ۥۖ */
    public final List f8545;

    /* JADX INFO: renamed from: ۦٕ */
    public final C3175 f8546;

    /* JADX INFO: renamed from: ۦٗ */
    public final SSLSocketFactory f8547;

    /* JADX INFO: renamed from: ۦۛ */
    public final List f8548;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4228 f8549;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1489 f8550;

    /* JADX INFO: renamed from: ۥؖ */
    public static final List f8539 = AbstractC4031.m7225(EnumC1658.f5511, EnumC1658.f5512);

    /* JADX INFO: renamed from: ۥؓ */
    public static final List f8538 = AbstractC4031.m7225(C5055.f16780, C5055.f16781);

    public C2561() throws NoSuchAlgorithmException, KeyStoreException {
        X509TrustManager x509TrustManagerMo2583;
        SSLSocketFactory sSLSocketFactoryMo3593;
        AbstractC1434 abstractC1434Mo1372;
        C1489 c1489 = new C1489(6);
        C4228 c4228 = new C4228(12);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SocketFactory socketFactory = SocketFactory.getDefault();
        List list = f8538;
        List list2 = f8539;
        C3175 c3175 = C3175.f10672;
        this.f8550 = c1489;
        this.f8549 = c4228;
        this.f8541 = AbstractC4031.m7213(arrayList);
        this.f8542 = AbstractC4031.m7213(arrayList2);
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f8540 = proxySelector == null ? C1343.f4628 : proxySelector;
        this.f8543 = socketFactory;
        this.f8548 = list;
        this.f8545 = list2;
        this.f8544 = new C3121(16, (byte) 0);
        if (list != null && list.isEmpty()) {
            this.f8547 = null;
            this.f8546 = C3175.f10672;
            x509TrustManagerMo2583 = null;
            sSLSocketFactoryMo3593 = null;
            abstractC1434Mo1372 = null;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f8547 = null;
                this.f8546 = C3175.f10672;
                x509TrustManagerMo2583 = null;
                sSLSocketFactoryMo3593 = null;
                abstractC1434Mo1372 = null;
                break;
            }
            if (((C5055) it.next()).f16784) {
                C3216 c3216 = C3216.f10772;
                x509TrustManagerMo2583 = C3216.f10772.mo2583();
                sSLSocketFactoryMo3593 = C3216.f10772.mo3593(x509TrustManagerMo2583);
                this.f8547 = sSLSocketFactoryMo3593;
                abstractC1434Mo1372 = C3216.f10772.mo1372(x509TrustManagerMo2583);
                this.f8546 = AbstractC3831.m6874(c3175.f10673, abstractC1434Mo1372) ? c3175 : new C3175(c3175.f10674, abstractC1434Mo1372);
                break;
            }
        }
        List list3 = this.f8542;
        List list4 = this.f8541;
        if (list4.contains(null)) {
            C5028.m8445(list4, "Null interceptor: ");
            throw null;
        }
        if (list3.contains(null)) {
            C5028.m8445(list3, "Null network interceptor: ");
            throw null;
        }
        List list5 = this.f8548;
        if (list5 == null || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((C5055) it2.next()).f16784) {
                    if (sSLSocketFactoryMo3593 == null) {
                        C1078.m2276("sslSocketFactory == null");
                        throw null;
                    }
                    if (abstractC1434Mo1372 == null) {
                        C1078.m2276("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerMo2583 != null) {
                        return;
                    }
                    C1078.m2276("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactoryMo3593 != null) {
            C1078.m2276("Check failed.");
            throw null;
        }
        if (abstractC1434Mo1372 != null) {
            C1078.m2276("Check failed.");
            throw null;
        }
        if (x509TrustManagerMo2583 != null) {
            C1078.m2276("Check failed.");
            throw null;
        }
        if (AbstractC3831.m6874(this.f8546, C3175.f10672)) {
            return;
        }
        C1078.m2276("Check failed.");
        throw null;
    }

    public final Object clone() {
        return super.clone();
    }
}
