package p000;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: ۦْؔؒٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3216 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final Logger f10771;

    /* JADX INFO: renamed from: ۥۣ */
    public static volatile C3216 f10772;

    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[PHI: r0
  0x0070: PHI (r0v35 ۦْؔؒٓ) = (r0v15 ۦْؔؒٓ), (r0v18 ۦْؔؒٓ), (r0v25 ۦْؔؒٓ), (r0v29 ۦْؔؒٓ), (r0v33 ۦْؔؒٓ), (r0v44 ۦْؔؒٓ) binds: [B:54:0x00de, B:66:0x0134, B:48:0x00d0, B:40:0x00b0, B:32:0x0090, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    static {
        C3216 c3216;
        C3216 c5361 = null;
        if (C3223.m5933()) {
            for (Map.Entry entry : AbstractC3339.f11170.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AbstractC3339.f11171.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C3900.f13023);
                }
            }
            c3216 = C0607.f2282 ? new C0607() : null;
            if (c3216 != null) {
                c5361 = c3216;
            } else if (C3512.f11626) {
                c5361 = new C3512();
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            c3216 = C1812.f6037 ? new C1812() : null;
            if (c3216 != null) {
                c5361 = c3216;
            } else if (!"BC".equals(Security.getProviders()[0].getName())) {
                if (C1217.f4205) {
                    c3216 = new C1217();
                } else {
                    c3216 = null;
                }
                if (c3216 != null) {
                    c5361 = c3216;
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (C5168.f17108) {
                        c3216 = new C5168();
                    } else {
                        c3216 = null;
                    }
                    if (c3216 != null) {
                        c5361 = c3216;
                    } else {
                        if (C1139.f3983) {
                            c3216 = new C1139();
                        } else {
                            c3216 = null;
                        }
                        if (c3216 != null) {
                            c5361 = c3216;
                        } else {
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                c5361 = new C5361(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                            }
                            if (c5361 == null) {
                                c3216 = new C3216();
                                c5361 = c3216;
                            }
                        }
                    }
                } else {
                    if (C1139.f3983) {
                        c3216 = new C1139();
                    } else {
                        c3216 = null;
                    }
                    if (c3216 != null) {
                        c5361 = c3216;
                    } else {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            c5361 = new C5361(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        }
                        if (c5361 == null) {
                            c3216 = new C3216();
                            c5361 = c3216;
                        }
                    }
                }
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (C1139.f3983) {
                    c3216 = new C1139();
                } else {
                    c3216 = null;
                }
                if (c3216 != null) {
                    c5361 = c3216;
                } else {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        c5361 = new C5361(cls3.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                    }
                    if (c5361 == null) {
                        c3216 = new C3216();
                        c5361 = c3216;
                    }
                }
            } else {
                if (C5168.f17108) {
                    c3216 = new C5168();
                } else {
                    c3216 = null;
                }
                if (c3216 != null) {
                    c5361 = c3216;
                } else {
                    if (C1139.f3983) {
                        c3216 = new C1139();
                    } else {
                        c3216 = null;
                    }
                    if (c3216 != null) {
                        c5361 = c3216;
                    } else {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            c5361 = new C5361(cls4.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls4.getMethod("get", SSLSocket.class), cls4.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        }
                        if (c5361 == null) {
                            c3216 = new C3216();
                            c5361 = c3216;
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (C1217.f4205) {
                c3216 = new C1217();
            } else {
                c3216 = null;
            }
            if (c3216 != null) {
                c5361 = c3216;
            } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (C1139.f3983) {
                    c3216 = new C1139();
                } else {
                    c3216 = null;
                }
                if (c3216 != null) {
                    c5361 = c3216;
                } else {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        c5361 = new C5361(cls5.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls5.getMethod("get", SSLSocket.class), cls5.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                    }
                    if (c5361 == null) {
                        c3216 = new C3216();
                        c5361 = c3216;
                    }
                }
            } else {
                if (C5168.f17108) {
                    c3216 = new C5168();
                } else {
                    c3216 = null;
                }
                if (c3216 != null) {
                    c5361 = c3216;
                } else {
                    if (C1139.f3983) {
                        c3216 = new C1139();
                    } else {
                        c3216 = null;
                    }
                    if (c3216 != null) {
                        c5361 = c3216;
                    } else {
                        if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                            Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            c5361 = new C5361(cls6.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls6.getMethod("get", SSLSocket.class), cls6.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        }
                        if (c5361 == null) {
                            c3216 = new C3216();
                            c5361 = c3216;
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (C1139.f3983) {
                c3216 = new C1139();
            } else {
                c3216 = null;
            }
            if (c3216 != null) {
                c5361 = c3216;
            } else {
                try {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        try {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            c5361 = new C5361(cls7.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls7.getMethod("get", SSLSocket.class), cls7.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (c5361 == null) {
                    c3216 = new C3216();
                    c5361 = c3216;
                }
            }
        } else {
            if (C5168.f17108) {
                c3216 = new C5168();
            } else {
                c3216 = null;
            }
            if (c3216 != null) {
                c5361 = c3216;
            } else {
                if (C1139.f3983) {
                    c3216 = new C1139();
                } else {
                    c3216 = null;
                }
                if (c3216 != null) {
                    c5361 = c3216;
                } else {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                        Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        c5361 = new C5361(cls8.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls8.getMethod("get", SSLSocket.class), cls8.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                    }
                    if (c5361 == null) {
                        c3216 = new C3216();
                        c5361 = c3216;
                    }
                }
            }
        }
        f10772 = c5361;
        f10771 = Logger.getLogger(C2561.class.getName());
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m5903(int i, String str, Throwable th) {
        f10771.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC4455 mo5904(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C1107((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: ۥُ */
    public void mo5905(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        socket.connect(inetSocketAddress, 10000);
    }

    /* JADX INFO: renamed from: ۥّ */
    public String mo1371(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public AbstractC1434 mo1372(X509TrustManager x509TrustManager) {
        return new C0369(mo5904(x509TrustManager));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public boolean mo1373(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public SSLSocketFactory mo3593(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo2584 = mo2584();
            sSLContextMo2584.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo2584.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public X509TrustManager mo2583() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        C1078.m2278("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public void mo5907(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m5903(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public SSLContext mo2584() {
        return SSLContext.getInstance("TLS");
    }

    /* JADX INFO: renamed from: ۦۙ */
    public Object mo5908() {
        if (f10771.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void mo5906(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void mo1374(SSLSocket sSLSocket, String str, List list) {
    }
}
