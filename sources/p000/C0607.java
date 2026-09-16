package p000;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ۥَؗؕٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0607 extends C3216 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f2282;

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f2283;

    static {
        f2282 = C3223.m5933() && Build.VERSION.SDK_INT >= 29;
    }

    public C0607() {
        List listM524 = AbstractC0246.m524(new InterfaceC4131[]{(!C3223.m5933() || Build.VERSION.SDK_INT < 29) ? null : new C4034(), new C3030(C0306.f1103), new C3030(C2077.f6857), new C3030(C4210.f13978)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listM524) {
            if (((InterfaceC4131) obj).mo635()) {
                arrayList.add(obj);
            }
        }
        this.f2283 = arrayList;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f2283.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC4131) next).mo636(sSLSocket));
        InterfaceC4131 interfaceC4131 = (InterfaceC4131) next;
        if (interfaceC4131 != null) {
            return interfaceC4131.mo637(sSLSocket);
        }
        return null;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC1434 mo1372(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C3340 c3340 = x509TrustManagerExtensions != null ? new C3340(x509TrustManager, x509TrustManagerExtensions) : null;
        return c3340 != null ? c3340 : super.mo1372(x509TrustManager);
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo1373(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1374(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.f2283.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC4131) next).mo636(sSLSocket));
        InterfaceC4131 interfaceC4131 = (InterfaceC4131) next;
        if (interfaceC4131 != null) {
            interfaceC4131.mo638(sSLSocket, str, list);
        }
    }
}
