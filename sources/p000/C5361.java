package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۦْٜ۟ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5361 extends C3216 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Method f17637;

    /* JADX INFO: renamed from: ۥُ */
    public final Method f17638;

    /* JADX INFO: renamed from: ۥّ */
    public final Class f17639;

    /* JADX INFO: renamed from: ۦؑ */
    public final Method f17640;

    /* JADX INFO: renamed from: ۦۙ */
    public final Class f17641;

    public C5361(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f17637 = method;
        this.f17640 = method2;
        this.f17638 = method3;
        this.f17639 = cls;
        this.f17641 = cls2;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        try {
            C1143 c1143 = (C1143) Proxy.getInvocationHandler(this.f17640.invoke(null, sSLSocket));
            boolean z = c1143.f3986;
            if (!z && c1143.f3985 == null) {
                C3216.m5903(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return c1143.f3985;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo5906(SSLSocket sSLSocket) {
        try {
            this.f17638.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1374(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1658) obj) != EnumC1658.f5517) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1658) it.next()).f5518);
        }
        try {
            this.f17637.invoke(null, sSLSocket, Proxy.newProxyInstance(C3216.class.getClassLoader(), new Class[]{this.f17639, this.f17641}, new C1143(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }
}
