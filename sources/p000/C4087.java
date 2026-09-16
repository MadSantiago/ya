package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ۦْؗۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4087 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0201 f13640;

    /* JADX INFO: renamed from: ۥُ */
    public C2186 f13641;

    /* JADX INFO: renamed from: ۥّ */
    public int f13642;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3462 f13643;

    /* JADX INFO: renamed from: ۥۜ */
    public int f13644;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0615 f13645;

    /* JADX INFO: renamed from: ۦؑ */
    public C0322 f13646;

    /* JADX INFO: renamed from: ۦٛ */
    public C4167 f13647;

    /* JADX INFO: renamed from: ۦۙ */
    public int f13648;

    public C4087(C0615 c0615, C3462 c3462, C0201 c0201) {
        this.f13645 = c0615;
        this.f13643 = c3462;
        this.f13640 = c0201;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7277(IOException iOException) {
        this.f13647 = null;
        if ((iOException instanceof C5629) && ((C5629) iOException).f18557 == 8) {
            this.f13642++;
        } else if (iOException instanceof C0824) {
            this.f13648++;
        } else {
            this.f13644++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0298  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:145:0x0303  */
    /* JADX WARN: Code duplicated, block: B:146:0x0310  */
    /* JADX WARN: Code duplicated, block: B:190:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX INFO: renamed from: ۥۣ */
    public final C3641 m7278(boolean z) throws IOException {
        C4167 c4167;
        C0322 c0322;
        C2186 c2186;
        ArrayList arrayList;
        C0322 c0323;
        C3462 c3462;
        Proxy proxy;
        String hostName;
        int port;
        List listSingletonList;
        boolean zContains;
        C3462 c3463;
        URI uriM1669;
        List<Proxy> listSelect;
        List listM7225;
        C3641 c3641;
        C3121 c3121;
        Socket socketM464;
        while (!this.f13640.f732) {
            C3641 c3642 = this.f13640.f744;
            if (c3642 != null) {
                synchronized (c3642) {
                    try {
                        if (!c3642.f12186) {
                            C0774 c0774 = c3642.f12181.f13868.f11486;
                            C0774 c0775 = this.f13643.f11486;
                            socketM464 = !(c0774.f2796 == c0775.f2796 && AbstractC3831.m6874(c0774.f2801, c0775.f2801)) ? this.f13640.m464() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f13640.f744 == null) {
                    if (socketM464 != null) {
                        AbstractC4031.m7222(socketM464);
                    }
                    this.f13642 = 0;
                    this.f13648 = 0;
                    this.f13644 = 0;
                    if (this.f13645.m1381(this.f13643, this.f13640, null, false)) {
                        c3642 = this.f13640.f744;
                    } else {
                        c4167 = this.f13647;
                        try {
                            if (c4167 != null) {
                                this.f13647 = null;
                            } else {
                                c0322 = this.f13646;
                                if (c0322 == null && c0322.m702()) {
                                    C0322 c0324 = this.f13646;
                                    if (!c0324.m702()) {
                                        C0178.m381();
                                        return null;
                                    }
                                    ArrayList arrayList2 = (ArrayList) c0324.f1178;
                                    int i = c0324.f1179;
                                    c0324.f1179 = i + 1;
                                    c4167 = (C4167) arrayList2.get(i);
                                } else {
                                    c2186 = this.f13641;
                                    if (c2186 == null) {
                                        c3463 = this.f13643;
                                        C3121 c3122 = this.f13640.f746.f8544;
                                        c2186 = new C2186();
                                        c2186.f7249 = c3463;
                                        c2186.f7246 = c3122;
                                        C2340 c2340 = C2340.f7777;
                                        c2186.f7251 = c2340;
                                        c2186.f7247 = c2340;
                                        c2186.f7248 = new ArrayList();
                                        uriM1669 = c3463.f11486.m1669();
                                        if (uriM1669.getHost() == null) {
                                            listM7225 = AbstractC4031.m7225(Proxy.NO_PROXY);
                                        } else {
                                            listSelect = c3463.f11485.select(uriM1669);
                                            if (listSelect != null || listSelect.isEmpty()) {
                                                listM7225 = AbstractC4031.m7225(Proxy.NO_PROXY);
                                            } else {
                                                listM7225 = AbstractC4031.m7213(listSelect);
                                            }
                                        }
                                        c2186.f7251 = listM7225;
                                        c2186.f7250 = 0;
                                        this.f13641 = c2186;
                                    }
                                    if (c2186.m4250()) {
                                        C0178.m381();
                                        return null;
                                    }
                                    arrayList = new ArrayList();
                                    while (c2186.f7250 < ((List) c2186.f7251).size()) {
                                        c3462 = (C3462) c2186.f7249;
                                        if (c2186.f7250 < ((List) c2186.f7251).size()) {
                                            throw new SocketException("No route to " + c3462.f11486.f2801 + "; exhausted proxy configurations: " + ((List) c2186.f7251));
                                        }
                                        List list = (List) c2186.f7251;
                                        int i2 = c2186.f7250;
                                        c2186.f7250 = i2 + 1;
                                        proxy = (Proxy) list.get(i2);
                                        ArrayList arrayList3 = new ArrayList();
                                        c2186.f7247 = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            C0774 c0776 = c3462.f11486;
                                            hostName = c0776.f2801;
                                            port = c0776.f2796;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            if (AbstractC4031.f13449.f16581.matcher(hostName).matches()) {
                                                listSingletonList = Collections.singletonList(InetAddress.getByName(hostName));
                                            } else {
                                                C1397 c1397 = C1397.f4788;
                                                try {
                                                    List listM509 = AbstractC0246.m509(InetAddress.getAllByName(hostName));
                                                    if (listM509.isEmpty()) {
                                                        throw new UnknownHostException(c1397 + " returned no addresses for " + hostName);
                                                    }
                                                    listSingletonList = listM509;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listSingletonList.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = ((List) c2186.f7247).iterator();
                                        while (it2.hasNext()) {
                                            C4167 c4168 = new C4167((C3462) c2186.f7249, proxy, (InetSocketAddress) it2.next());
                                            C3121 c3123 = (C3121) c2186.f7246;
                                            synchronized (c3123) {
                                                zContains = ((LinkedHashSet) c3123.f10451).contains(c4168);
                                            }
                                            if (zContains) {
                                                ((ArrayList) c2186.f7248).add(c4168);
                                            } else {
                                                arrayList.add(c4168);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        AbstractC3649.m6529((ArrayList) c2186.f7248, arrayList);
                                        ((ArrayList) c2186.f7248).clear();
                                    }
                                    c0323 = new C0322(arrayList);
                                    this.f13646 = c0323;
                                    if (!this.f13640.f732) {
                                        C5028.m8448("Canceled");
                                        return null;
                                    }
                                    if (this.f13645.m1381(this.f13643, this.f13640, arrayList, false)) {
                                        c3642 = this.f13640.f744;
                                    } else {
                                        if (c0323.m702()) {
                                            C0178.m381();
                                            return null;
                                        }
                                        int i3 = c0323.f1179;
                                        c0323.f1179 = i3 + 1;
                                        c4167 = (C4167) arrayList.get(i3);
                                        c3641 = new C3641(c4167);
                                        this.f13640.f734 = c3641;
                                        c3641.m6504(this.f13640);
                                        this.f13640.f734 = null;
                                        c3121 = this.f13640.f746.f8544;
                                        synchronized (c3121) {
                                            ((LinkedHashSet) c3121.f10451).remove(c4167);
                                        }
                                        if (this.f13645.m1381(this.f13643, this.f13640, arrayList, true)) {
                                            C3641 c3643 = this.f13640.f744;
                                            this.f13647 = c4167;
                                            AbstractC4031.m7222(c3641.f12183);
                                            c3642 = c3643;
                                        } else {
                                            synchronized (c3641) {
                                                C0615 c0615 = this.f13645;
                                                byte[] bArr = AbstractC4031.f13451;
                                                ((ConcurrentLinkedQueue) c0615.f2297).add(c3641);
                                                ((C2324) c0615.f2295).m4367((C1841) c0615.f2294, 0L);
                                                this.f13640.m462(c3641);
                                            }
                                            c3642 = c3641;
                                        }
                                    }
                                }
                            }
                            c3641.m6504(this.f13640);
                            this.f13640.f734 = null;
                            c3121 = this.f13640.f746.f8544;
                            synchronized (c3121) {
                                ((LinkedHashSet) c3121.f10451).remove(c4167);
                                if (this.f13645.m1381(this.f13643, this.f13640, arrayList, true)) {
                                    C3641 c3644 = this.f13640.f744;
                                    this.f13647 = c4167;
                                    AbstractC4031.m7222(c3641.f12183);
                                    c3642 = c3644;
                                } else {
                                    synchronized (c3641) {
                                        C0615 c0616 = this.f13645;
                                        byte[] bArr2 = AbstractC4031.f13451;
                                        ((ConcurrentLinkedQueue) c0616.f2297).add(c3641);
                                        ((C2324) c0616.f2295).m4367((C1841) c0616.f2294, 0L);
                                        this.f13640.m462(c3641);
                                        c3642 = c3641;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f13640.f734 = null;
                            throw th2;
                        }
                        arrayList = null;
                        c3641 = new C3641(c4167);
                        this.f13640.f734 = c3641;
                    }
                } else if (socketM464 != null) {
                    C1078.m2276("Check failed.");
                    return null;
                }
            } else {
                this.f13642 = 0;
                this.f13648 = 0;
                this.f13644 = 0;
                if (this.f13645.m1381(this.f13643, this.f13640, null, false)) {
                    c3642 = this.f13640.f744;
                } else {
                    c4167 = this.f13647;
                    if (c4167 != null) {
                        this.f13647 = null;
                    } else {
                        c0322 = this.f13646;
                        if (c0322 == null) {
                        }
                        c2186 = this.f13641;
                        if (c2186 == null) {
                            c3463 = this.f13643;
                            C3121 c3124 = this.f13640.f746.f8544;
                            c2186 = new C2186();
                            c2186.f7249 = c3463;
                            c2186.f7246 = c3124;
                            C2340 c2341 = C2340.f7777;
                            c2186.f7251 = c2341;
                            c2186.f7247 = c2341;
                            c2186.f7248 = new ArrayList();
                            uriM1669 = c3463.f11486.m1669();
                            if (uriM1669.getHost() == null) {
                                listM7225 = AbstractC4031.m7225(Proxy.NO_PROXY);
                            } else {
                                listSelect = c3463.f11485.select(uriM1669);
                                if (listSelect != null) {
                                    listM7225 = AbstractC4031.m7225(Proxy.NO_PROXY);
                                } else {
                                    listM7225 = AbstractC4031.m7225(Proxy.NO_PROXY);
                                }
                            }
                            c2186.f7251 = listM7225;
                            c2186.f7250 = 0;
                            this.f13641 = c2186;
                        }
                        if (c2186.m4250()) {
                            C0178.m381();
                            return null;
                        }
                        arrayList = new ArrayList();
                        while (c2186.f7250 < ((List) c2186.f7251).size()) {
                            c3462 = (C3462) c2186.f7249;
                            if (c2186.f7250 < ((List) c2186.f7251).size()) {
                                throw new SocketException("No route to " + c3462.f11486.f2801 + "; exhausted proxy configurations: " + ((List) c2186.f7251));
                            }
                            List list2 = (List) c2186.f7251;
                            int i4 = c2186.f7250;
                            c2186.f7250 = i4 + 1;
                            proxy = (Proxy) list2.get(i4);
                            ArrayList arrayList4 = new ArrayList();
                            c2186.f7247 = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                C0774 c0777 = c3462.f11486;
                                hostName = c0777.f2801;
                                port = c0777.f2796;
                            } else {
                                C0774 c0778 = c3462.f11486;
                                hostName = c0778.f2801;
                                port = c0778.f2796;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            AbstractC3649.m6529((ArrayList) c2186.f7248, arrayList);
                            ((ArrayList) c2186.f7248).clear();
                        }
                        c0323 = new C0322(arrayList);
                        this.f13646 = c0323;
                        if (!this.f13640.f732) {
                            C5028.m8448("Canceled");
                            return null;
                        }
                        if (this.f13645.m1381(this.f13643, this.f13640, arrayList, false)) {
                            c3642 = this.f13640.f744;
                        } else {
                            if (c0323.m702()) {
                                C0178.m381();
                                return null;
                            }
                            int i5 = c0323.f1179;
                            c0323.f1179 = i5 + 1;
                            c4167 = (C4167) arrayList.get(i5);
                            c3641 = new C3641(c4167);
                            this.f13640.f734 = c3641;
                            c3641.m6504(this.f13640);
                            this.f13640.f734 = null;
                            c3121 = this.f13640.f746.f8544;
                            synchronized (c3121) {
                                ((LinkedHashSet) c3121.f10451).remove(c4167);
                                if (this.f13645.m1381(this.f13643, this.f13640, arrayList, true)) {
                                    C3641 c3645 = this.f13640.f744;
                                    this.f13647 = c4167;
                                    AbstractC4031.m7222(c3641.f12183);
                                    c3642 = c3645;
                                } else {
                                    synchronized (c3641) {
                                        C0615 c0617 = this.f13645;
                                        byte[] bArr3 = AbstractC4031.f13451;
                                        ((ConcurrentLinkedQueue) c0617.f2297).add(c3641);
                                        ((C2324) c0617.f2295).m4367((C1841) c0617.f2294, 0L);
                                        this.f13640.m462(c3641);
                                        c3642 = c3641;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    c3641 = new C3641(c4167);
                    this.f13640.f734 = c3641;
                    c3641.m6504(this.f13640);
                    this.f13640.f734 = null;
                    c3121 = this.f13640.f746.f8544;
                    synchronized (c3121) {
                        ((LinkedHashSet) c3121.f10451).remove(c4167);
                        if (this.f13645.m1381(this.f13643, this.f13640, arrayList, true)) {
                            C3641 c3646 = this.f13640.f744;
                            this.f13647 = c4167;
                            AbstractC4031.m7222(c3641.f12183);
                            c3642 = c3646;
                        } else {
                            synchronized (c3641) {
                                C0615 c0618 = this.f13645;
                                byte[] bArr4 = AbstractC4031.f13451;
                                ((ConcurrentLinkedQueue) c0618.f2297).add(c3641);
                                ((C2324) c0618.f2295).m4367((C1841) c0618.f2294, 0L);
                                this.f13640.m462(c3641);
                                c3642 = c3641;
                            }
                        }
                    }
                }
            }
            if (c3642.m6510(z)) {
                return c3642;
            }
            c3642.m6511();
            if (this.f13647 == null) {
                C0322 c0325 = this.f13646;
                if (c0325 != null ? c0325.m702() : true) {
                    continue;
                } else {
                    C2186 c2187 = this.f13641;
                    if (!(c2187 != null ? c2187.m4250() : true)) {
                        C5028.m8448("exhausted all routes");
                        return null;
                    }
                }
            }
        }
        C5028.m8448("Canceled");
        return null;
    }
}
