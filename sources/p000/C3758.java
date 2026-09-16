package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: ۦٍؑۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3758 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3758 f12519 = new C3758(0);

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f12520;

    public C3758(C2561 c2561) {
        this.f12520 = 4;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static int m6614(C2147 c2147, int i) {
        String strM8048 = c2147.f7034.m8048("Retry-After");
        if (strM8048 == null) {
            strM8048 = null;
        }
        if (strM8048 == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strM8048).matches()) {
            return Integer.valueOf(strM8048).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public boolean m6615(IOException iOException, C0201 c0201, C2813 c2813, boolean z) {
        boolean zM4250;
        C2186 c2186;
        C3641 c3641;
        if ((!z || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) {
            C4087 c4087 = c0201.f743;
            int i = c4087.f13642;
            if (i == 0 && c4087.f13648 == 0 && c4087.f13644 == 0) {
                zM4250 = false;
            } else if (c4087.f13647 != null) {
                zM4250 = true;
            } else {
                C4167 c4167 = null;
                if (i <= 1 && c4087.f13648 <= 1 && c4087.f13644 <= 0 && (c3641 = c4087.f13640.f744) != null) {
                    synchronized (c3641) {
                        if (c3641.f12184 == 0 && AbstractC4031.m7221(c3641.f12181.f13868.f11486, c4087.f13643.f11486)) {
                            c4167 = c3641.f12181;
                        }
                    }
                }
                if (c4167 != null) {
                    c4087.f13647 = c4167;
                } else {
                    C0322 c0322 = c4087.f13646;
                    if ((c0322 == null || !c0322.m702()) && (c2186 = c4087.f13641) != null) {
                        zM4250 = c2186.m4250();
                    }
                }
                zM4250 = true;
            }
            if (zM4250) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX INFO: renamed from: ۥۣ */
    public C2813 m6616(C2147 c2147, C4752 c4752) throws ProtocolException {
        String strM8048;
        C2813 c2813;
        C3303 c3303;
        C0774 c0774M6064;
        C1414 c1414M5377;
        boolean z;
        C3641 c3641;
        C4167 c4167 = (c4752 == null || (c3641 = (C3641) c4752.f15685) == null) ? null : c3641.f12181;
        int i = c2147.f7033;
        String str = (String) c2147.f7042.f9389;
        if (i == 307 || i == 308) {
            strM8048 = c2147.f7034.m8048("Location");
            if (strM8048 == null) {
                strM8048 = null;
            }
            c2813 = c2147.f7042;
            if (strM8048 != null) {
                C0774 c0774 = (C0774) c2813.f9393;
                c0774.getClass();
                try {
                    c3303 = new C3303();
                    c3303.m6062(c0774, strM8048);
                } catch (IllegalArgumentException unused) {
                    c3303 = null;
                }
                if (c3303 != null) {
                    c0774M6064 = c3303.m6064();
                } else {
                    c0774M6064 = null;
                }
                if (c0774M6064 != null) {
                    AbstractC3831.m6874(c0774M6064.f2800, ((C0774) c2813.f9393).f2800);
                    c1414M5377 = c2813.m5377();
                    if (AbstractC1605.m3335(str)) {
                        int i2 = c2147.f7033;
                        z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            c1414M5377.m3006(str, z ? (AbstractC2577) c2813.f9388 : null);
                        } else {
                            c1414M5377.m3006("GET", null);
                        }
                        if (!z) {
                            c1414M5377.m3011("Transfer-Encoding");
                            c1414M5377.m3011("Content-Length");
                            c1414M5377.m3011("Content-Type");
                        }
                    }
                    if (!AbstractC4031.m7221((C0774) c2813.f9393, c0774M6064)) {
                        c1414M5377.m3011("Authorization");
                    }
                    c1414M5377.f4871 = c0774M6064;
                    return c1414M5377.m2998();
                }
            }
        } else {
            if (i == 401) {
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    C2147 c2148 = c2147.f7038;
                    if ((c2148 == null || c2148.f7033 != 503) && m6614(c2147, Integer.MAX_VALUE) == 0) {
                        return c2147.f7042;
                    }
                } else {
                    if (i == 407) {
                        if (c4167.f13867.type() == Proxy.Type.HTTP) {
                            return null;
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                strM8048 = c2147.f7034.m8048("Location");
                                if (strM8048 == null) {
                                    strM8048 = null;
                                }
                                c2813 = c2147.f7042;
                                if (strM8048 != null) {
                                    C0774 c0775 = (C0774) c2813.f9393;
                                    c0775.getClass();
                                    c3303 = new C3303();
                                    c3303.m6062(c0775, strM8048);
                                    if (c3303 != null) {
                                        c0774M6064 = c3303.m6064();
                                    } else {
                                        c0774M6064 = null;
                                    }
                                    if (c0774M6064 != null) {
                                        AbstractC3831.m6874(c0774M6064.f2800, ((C0774) c2813.f9393).f2800);
                                        c1414M5377 = c2813.m5377();
                                        if (AbstractC1605.m3335(str)) {
                                            int i3 = c2147.f7033;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                c1414M5377.m3006(str, z ? (AbstractC2577) c2813.f9388 : null);
                                            } else {
                                                c1414M5377.m3006(str, z ? (AbstractC2577) c2813.f9388 : null);
                                            }
                                            if (!z) {
                                                c1414M5377.m3011("Transfer-Encoding");
                                                c1414M5377.m3011("Content-Length");
                                                c1414M5377.m3011("Content-Type");
                                            }
                                        }
                                        if (!AbstractC4031.m7221((C0774) c2813.f9393, c0774M6064)) {
                                            c1414M5377.m3011("Authorization");
                                        }
                                        c1414M5377.f4871 = c0774M6064;
                                        return c1414M5377.m2998();
                                    }
                                }
                            default:
                                return null;
                        }
                    } else {
                        C2147 c2149 = c2147.f7038;
                        if ((c2149 == null || c2149.f7033 != 408) && m6614(c2147, 0) <= 0) {
                            return c2147.f7042;
                        }
                    }
                }
            } else if (c4752 != null && !AbstractC3831.m6874(((C4087) c4752.f15684).f13643.f11486.f2801, ((C3641) c4752.f15685).f12181.f13868.f11486.f2801)) {
                C3641 c3642 = (C3641) c4752.f15685;
                synchronized (c3642) {
                    c3642.f12188 = true;
                }
                return c2147.f7042;
            }
        }
        return null;
    }

    public /* synthetic */ C3758(int i) {
        this.f12520 = i;
    }
}
