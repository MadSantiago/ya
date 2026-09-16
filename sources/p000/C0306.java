package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۥِؓؓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0306 implements InterfaceC4131 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C1397 f1103 = new C1397(26);

    /* JADX INFO: renamed from: ۥؗ */
    public final Method f1104;

    /* JADX INFO: renamed from: ۥُ */
    public final Method f1105;

    /* JADX INFO: renamed from: ۥۗ */
    public final Method f1106;

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f1107;

    /* JADX INFO: renamed from: ۦؑ */
    public final Method f1108;

    public C0306(Class cls) {
        this.f1107 = cls;
        this.f1106 = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.f1104 = cls.getMethod("setHostname", String.class);
        this.f1108 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1105 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo635() {
        boolean z = C3512.f11626;
        return C3512.f11626;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo636(SSLSocket sSLSocket) {
        return this.f1107.isInstance(sSLSocket);
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۥۣ */
    public final String mo637(SSLSocket sSLSocket) {
        if (this.f1107.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f1108.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC4637.f15306);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC3831.m6874(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // p000.InterfaceC4131
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo638(SSLSocket sSLSocket, String str, List list) {
        if (this.f1107.isInstance(sSLSocket)) {
            try {
                this.f1106.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1104.invoke(sSLSocket, str);
                }
                Method method = this.f1105;
                C3216 c3216 = C3216.f10772;
                method.invoke(sSLSocket, C3223.m5941(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
