package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: ۦًؑ۠ؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3641 extends AbstractC1918 {

    /* JADX INFO: renamed from: ۥؗ */
    public Socket f12177;

    /* JADX INFO: renamed from: ۥُ */
    public C4073 f12178;

    /* JADX INFO: renamed from: ۥّ */
    public EnumC1658 f12179;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4167 f12181;

    /* JADX INFO: renamed from: ۥۜ */
    public C4162 f12182;

    /* JADX INFO: renamed from: ۦؑ */
    public Socket f12183;

    /* JADX INFO: renamed from: ۦؚ */
    public int f12184;

    /* JADX INFO: renamed from: ۦٌ */
    public int f12185;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f12186;

    /* JADX INFO: renamed from: ۦٛ */
    public C5025 f12187;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f12188;

    /* JADX INFO: renamed from: ۦۙ */
    public C0127 f12189;

    /* JADX INFO: renamed from: ۦۚ */
    public int f12190;

    /* JADX INFO: renamed from: ۦۨ */
    public int f12192 = 1;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f12191 = new ArrayList();

    /* JADX INFO: renamed from: ۥْ */
    public long f12180 = Long.MAX_VALUE;

    public C3641(C4167 c4167) {
        this.f12181 = c4167;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m6503(C2561 c2561, C4167 c4167, IOException iOException) {
        if (c4167.f13867.type() != Proxy.Type.DIRECT) {
            C3462 c3462 = c4167.f13868;
            c3462.f11485.connectFailed(c3462.f11486.m1669(), c4167.f13867.address(), iOException);
        }
        C3121 c3121 = c2561.f8544;
        synchronized (c3121) {
            ((LinkedHashSet) c3121.f10451).add(c4167);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C4167 c4167 = this.f12181;
        sb.append(c4167.f13868.f11486.f2801);
        sb.append(':');
        sb.append(c4167.f13868.f11486.f2796);
        sb.append(", proxy=");
        sb.append(c4167.f13867);
        sb.append(" hostAddress=");
        sb.append(c4167.f13866);
        sb.append(" cipherSuite=");
        C4073 c4073 = this.f12178;
        sb.append(c4073 != null ? c4073.f13563 : "none");
        sb.append(" protocol=");
        sb.append(this.f12179);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.net.Socket, ۥّؐؔ۠, ۥًٟٙؔ, ۦُْٜؔ, ۦٔؑۦ٘, ۦٕۘؕؐ] */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m6504(C0201 c0201) throws Throwable {
        if (this.f12179 != null) {
            C1078.m2276("already connected");
            return;
        }
        C3462 c3462 = this.f12181.f13868;
        List list = c3462.f11488;
        C5590 c5590 = new C5590(list);
        if (c3462.f11487 == null) {
            if (!list.contains(C5055.f16781)) {
                throw new C2493(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f12181.f13868.f11486.f2801;
            C3216 c3216 = C3216.f10772;
            if (!C3216.f10772.mo1373(str)) {
                throw new C2493(new UnknownServiceException(AbstractC3761.m6629("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c3462.f11491.contains(EnumC1658.f5514)) {
            throw new C2493(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        ?? r6 = 0;
        C2493 c2493 = null;
        while (true) {
            try {
                C4167 c4167 = this.f12181;
                if (c4167.f13868.f11487 != null && c4167.f13867.type() == Proxy.Type.HTTP) {
                    m6506();
                    if (this.f12177 != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m6505();
                m6512(c5590);
                InetSocketAddress inetSocketAddress = this.f12181.f13866;
                break;
            } catch (IOException e) {
                Socket socket = this.f12183;
                if (socket != null) {
                    AbstractC4031.m7222(socket);
                }
                Socket socket2 = this.f12177;
                if (socket2 != null) {
                    AbstractC4031.m7222(socket2);
                }
                this.f12183 = r6;
                this.f12177 = r6;
                this.f12182 = r6;
                this.f12187 = r6;
                this.f12178 = r6;
                this.f12179 = r6;
                this.f12189 = r6;
                this.f12192 = 1;
                InetSocketAddress inetSocketAddress2 = this.f12181.f13866;
                if (c2493 == null) {
                    c2493 = new C2493(e);
                } else {
                    AbstractC5537.m9223(c2493.f8291, e);
                    c2493.f8290 = e;
                }
                c5590.f18424 = true;
                if (!c5590.f18425) {
                    throw c2493;
                }
                if (e instanceof ProtocolException) {
                    throw c2493;
                }
                if (e instanceof InterruptedIOException) {
                    throw c2493;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw c2493;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw c2493;
                }
                if (!(e instanceof SSLException)) {
                    throw c2493;
                }
            }
        }
        C4167 c4168 = this.f12181;
        if (c4168.f13868.f11487 != null && c4168.f13867.type() == Proxy.Type.HTTP && this.f12177 == null) {
            throw new C2493(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f12180 = System.nanoTime();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m6505() throws IOException {
        C4167 c4167 = this.f12181;
        Proxy proxy = c4167.f13867;
        C3462 c3462 = c4167.f13868;
        Proxy.Type type = proxy.type();
        int i = type == null ? -1 : AbstractC5621.f18537[type.ordinal()];
        int i2 = 1;
        Socket socketCreateSocket = (i == 1 || i == 2) ? c3462.f11489.createSocket() : new Socket(proxy);
        this.f12177 = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f12181.f13866;
        socketCreateSocket.setSoTimeout(10000);
        try {
            C3216 c3216 = C3216.f10772;
            C3216.f10772.mo5905(socketCreateSocket, this.f12181.f13866);
            try {
                Logger logger = AbstractC2235.f7403;
                C1339 c1339 = new C1339(socketCreateSocket);
                this.f12182 = new C4162(new C5164(0, c1339, new C5164(1, socketCreateSocket.getInputStream(), c1339)));
                C1339 c13310 = new C1339(socketCreateSocket);
                this.f12187 = new C5025(new C1455(0, c13310, new C1455(i2, socketCreateSocket.getOutputStream(), c13310)));
            } catch (NullPointerException e) {
                if (AbstractC3831.m6874(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f12181.f13866);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m6506() throws IOException {
        C1414 c1414 = new C1414(7);
        C4167 c4167 = this.f12181;
        c1414.f4871 = c4167.f13868.f11486;
        c1414.m3006("CONNECT", null);
        ((C5086) c1414.f4869).m8695("Host", AbstractC4031.m7217(c4167.f13868.f11486, true));
        ((C5086) c1414.f4869).m8695("Proxy-Connection", "Keep-Alive");
        ((C5086) c1414.f4869).m8695("User-Agent", "okhttp/4.12.0");
        C2813 c2813M2998 = c1414.m2998();
        C5086 c5086 = new C5086(24);
        c5086.m8695("Proxy-Authenticate", "OkHttp-Preemptive");
        c5086.m8701();
        C0774 c0774 = (C0774) c2813M2998.f9393;
        m6505();
        String str = "CONNECT " + AbstractC4031.m7217(c0774, true) + " HTTP/1.1";
        C4162 c4162 = this.f12182;
        C5025 c5025 = this.f12187;
        C2186 c2186 = new C2186(null, this, c4162, c5025);
        c4162.f13857.mo961().mo3923(10000L);
        c5025.f16636.mo961().mo3923(10000L);
        c2186.m4245((C4714) c2813M2998.f9390, str);
        c2186.mo4239();
        C1033 c1033Mo4255 = c2186.mo4255(false);
        c1033Mo4255.f3645 = c2813M2998;
        C2147 c2147M2239 = c1033Mo4255.m2239();
        int i = c2147M2239.f7033;
        long jM7226 = AbstractC4031.m7226(c2147M2239);
        if (jM7226 != -1) {
            C3911 c3911M4256 = c2186.m4256(jM7226);
            AbstractC4031.m7230(c3911M4256, Integer.MAX_VALUE);
            c3911M4256.close();
        }
        if (i != 200) {
            if (i == 407) {
                C5028.m8448("Failed to authenticate with proxy");
                return;
            } else {
                C5028.m8448(AbstractC5078.m8670(i, "Unexpected response code for CONNECT: "));
                return;
            }
        }
        if (c4162.f13856.m2693() && c5025.f16635.m2693()) {
            return;
        }
        C5028.m8448("TLS tunnel buffered too many bytes!");
    }

    @Override // p000.AbstractC1918
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3752(C0498 c0498) {
        c0498.m1108(8, null);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m6507(C3462 c3462, List list) {
        C4073 c4073;
        C0774 c0774 = c3462.f11486;
        String str = c0774.f2801;
        byte[] bArr = AbstractC4031.f13451;
        if (this.f12191.size() < this.f12192 && !this.f12186) {
            C4167 c4167 = this.f12181;
            C3462 c3463 = c4167.f13868;
            C3462 c3464 = c4167.f13868;
            if (c3463.m6239(c3462)) {
                if (!AbstractC3831.m6874(str, c3464.f11486.f2801)) {
                    if (this.f12189 != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C4167 c4168 = (C4167) it.next();
                            Proxy.Type type = c4168.f13867.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && c4167.f13867.type() == type2 && AbstractC3831.m6874(c4167.f13866, c4168.f13866)) {
                                if (c3462.f11484 != C5125.f16987) {
                                    break;
                                }
                                byte[] bArr2 = AbstractC4031.f13451;
                                C0774 c0775 = c3464.f11486;
                                if (c0774.f2796 != c0775.f2796) {
                                    break;
                                }
                                if (!AbstractC3831.m6874(str, c0775.f2801)) {
                                    if (!this.f12188 && (c4073 = this.f12178) != null) {
                                        List listM7257 = c4073.m7257();
                                        if (listM7257.isEmpty() || !C5125.m8744(str, (X509Certificate) listM7257.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    C3175 c3175 = c3462.f11490;
                                    this.f12178.m7257();
                                    Iterator it2 = c3175.f10674.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    AbstractC2049.m4001(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC1918
    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized void mo3753(C1928 c1928) {
        this.f12192 = (c1928.f6354 & 16) != 0 ? c1928.f6353[4] : Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m6508() throws SocketException {
        int i;
        Socket socket = this.f12183;
        C4162 c4162 = this.f12182;
        C5025 c5025 = this.f12187;
        socket.setSoTimeout(0);
        C2680 c2680 = C2680.f8890;
        C2813 c2813 = new C2813(c2680);
        String str = this.f12181.f13868.f11486.f2801;
        c2813.f9389 = socket;
        c2813.f9390 = AbstractC4031.f13453 + ' ' + str;
        c2813.f9388 = c4162;
        c2813.f9391 = c5025;
        c2813.f9392 = this;
        C0127 c0127 = new C0127(c2813);
        this.f12189 = c0127;
        C1928 c1928 = C0127.f506;
        this.f12192 = (c1928.f6354 & 16) != 0 ? c1928.f6353[4] : Integer.MAX_VALUE;
        C3149 c3149 = c0127.f524;
        synchronized (c3149) {
            try {
                if (c3149.f10627) {
                    throw new IOException("closed");
                }
                Logger logger = C3149.f10624;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC4031.m7228(">> CONNECTION " + AbstractC2678.f8883.mo2203(), new Object[0]));
                }
                c3149.f10629.mo2696(AbstractC2678.f8883);
                c3149.f10629.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        C3149 c31410 = c0127.f524;
        C1928 c1929 = c0127.f528;
        synchronized (c31410) {
            try {
                if (c31410.f10627) {
                    throw new IOException("closed");
                }
                c31410.m5836(0, Integer.bitCount(c1929.f6354) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & c1929.f6354) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        c31410.f10629.writeShort(i);
                        c31410.f10629.writeInt(c1929.f6353[i2]);
                    }
                    i2++;
                }
                c31410.f10629.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iM3789 = c0127.f528.m3789();
        if (iM3789 != 65535) {
            c0127.f524.m5831(iM3789 - 65535, 0);
        }
        c2680.m4989().m4367(new C1841(c0127.f512, c0127.f526, 2), 0L);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC4559 m6509(C2561 c2561, C0870 c0870) {
        Socket socket = this.f12183;
        C4162 c4162 = this.f12182;
        C5025 c5025 = this.f12187;
        C0127 c0127 = this.f12189;
        if (c0127 != null) {
            return new C2636(c2561, this, c0870, c0127);
        }
        socket.setSoTimeout(10000);
        c4162.f13857.mo961().mo3923(10000L);
        c5025.f16636.mo961().mo3923(10000L);
        return new C2186(c2561, this, c4162, c5025);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m6510(boolean z) {
        long j;
        byte[] bArr = AbstractC4031.f13451;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f12177;
        Socket socket2 = this.f12183;
        C4162 c4162 = this.f12182;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C0127 c0127 = this.f12189;
        if (c0127 != null) {
            synchronized (c0127) {
                if (c0127.f515) {
                    return false;
                }
                return c0127.f520 >= c0127.f507 || jNanoTime < c0127.f510;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f12180;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !c4162.m7362();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final synchronized void m6511() {
        this.f12186 = true;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m6512(C5590 c5590) throws Throwable {
        SSLSocket sSLSocket;
        String strMo1371;
        EnumC1658 enumC1658 = EnumC1658.f5511;
        EnumC1658 enumC1659 = EnumC1658.f5512;
        EnumC1658 enumC16510 = EnumC1658.f5514;
        C3462 c3462 = this.f12181.f13868;
        SSLSocketFactory sSLSocketFactory = c3462.f11487;
        if (sSLSocketFactory == null) {
            boolean zContains = c3462.f11491.contains(enumC16510);
            Socket socket = this.f12177;
            if (!zContains) {
                this.f12183 = socket;
                this.f12179 = enumC1659;
                return;
            } else {
                this.f12183 = socket;
                this.f12179 = enumC16510;
                m6508();
                return;
            }
        }
        try {
            Socket socket2 = this.f12177;
            C0774 c0774 = c3462.f11486;
            int i = 1;
            SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket2, c0774.f2801, c0774.f2796, true);
            try {
                C5055 c5055M9433 = c5590.m9433(sSLSocket2);
                if (c5055M9433.f16783) {
                    C3216 c3216 = C3216.f10772;
                    C3216.f10772.mo1374(sSLSocket2, c3462.f11486.f2801, c3462.f11491);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                C4073 c4073M7077 = AbstractC3933.m7077(session);
                int i2 = 0;
                if (!c3462.f11484.verify(c3462.f11486.f2801, session)) {
                    List listM7257 = c4073M7077.m7257();
                    if (listM7257.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c3462.f11486.f2801 + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listM7257.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(c3462.f11486.f2801);
                    sb.append(" not verified:\n              |    certificate: ");
                    C3175 c3175 = C3175.f10672;
                    sb.append(AbstractC3925.m7029(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(AbstractC0973.m2049(C5125.m8746(x509Certificate, 7), C5125.m8746(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(AbstractC1098.m2325(sb.toString()));
                }
                C3175 c3176 = c3462.f11490;
                this.f12178 = new C4073(c4073M7077.f13564, c4073M7077.f13563, c4073M7077.f13562, new C4811(c3176, c4073M7077, c3462, i2));
                Iterator it = c3176.f10674.iterator();
                if (it.hasNext()) {
                    AbstractC2049.m4001(it.next());
                    throw null;
                }
                if (c5055M9433.f16783) {
                    C3216 c3217 = C3216.f10772;
                    strMo1371 = C3216.f10772.mo1371(sSLSocket2);
                } else {
                    strMo1371 = null;
                }
                this.f12183 = sSLSocket2;
                Logger logger = AbstractC2235.f7403;
                C1339 c1339 = new C1339(sSLSocket2);
                this.f12182 = new C4162(new C5164(0, c1339, new C5164(1, sSLSocket2.getInputStream(), c1339)));
                C1339 c13310 = new C1339(sSLSocket2);
                this.f12187 = new C5025(new C1455(i2, c13310, new C1455(i, sSLSocket2.getOutputStream(), c13310)));
                if (strMo1371 != null) {
                    EnumC1658 enumC16511 = EnumC1658.f5517;
                    if (strMo1371.equals("http/1.0")) {
                        enumC1659 = enumC16511;
                    } else if (!strMo1371.equals("http/1.1")) {
                        if (strMo1371.equals("h2_prior_knowledge")) {
                            enumC1659 = enumC16510;
                        } else if (strMo1371.equals("h2")) {
                            enumC1659 = enumC1658;
                        } else {
                            enumC1659 = EnumC1658.f5513;
                            if (!strMo1371.equals("spdy/3.1")) {
                                enumC1659 = EnumC1658.f5515;
                                if (!strMo1371.equals("quic")) {
                                    throw new IOException("Unexpected protocol: ".concat(strMo1371));
                                }
                            }
                        }
                    }
                }
                this.f12179 = enumC1659;
                C3216 c3218 = C3216.f10772;
                C3216.f10772.mo5906(sSLSocket2);
                if (this.f12179 == enumC1658) {
                    m6508();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C3216 c3219 = C3216.f10772;
                    C3216.f10772.mo5906(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC4031.m7222(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }
}
