package p000;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ۦؘؙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3512 extends C3216 {

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean f11626;

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f11627;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4682 f11628;

    static {
        boolean z = false;
        if (C3223.m5933() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f11626 = z;
    }

    public C3512() throws NoSuchMethodException {
        C0592 c0592;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c0592 = new C0592(cls);
        } catch (Exception e) {
            C3216.f10772.getClass();
            C3216.m5903(5, "unable to load android socket classes", e);
            c0592 = null;
        }
        List listM524 = AbstractC0246.m524(new InterfaceC4131[]{c0592, new C3030(C0306.f1103), new C3030(C2077.f6857), new C3030(C4210.f13978)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listM524) {
            if (((InterfaceC4131) obj).mo635()) {
                arrayList.add(obj);
            }
        }
        this.f11627 = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f11628 = new C4682(method3, method2, method);
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4455 mo5904(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0263(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo5904(x509TrustManager);
        }
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥُ */
    public final void mo5905(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        try {
            socket.connect(inetSocketAddress, 10000);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f11627.iterator();
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
        Iterator it = this.f11627.iterator();
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

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦِ */
    public final void mo5907(Object obj, String str) {
        C4682 c4682 = this.f11628;
        c4682.getClass();
        if (obj != null) {
            try {
                c4682.f15421.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C3216.m5903(5, str, null);
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo5908() {
        C4682 c4682 = this.f11628;
        Method method = c4682.f15423;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                c4682.f15422.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
