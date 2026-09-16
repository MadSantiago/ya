package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: ۥٌۢؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2636 implements InterfaceC4559 {

    /* JADX INFO: renamed from: ۥّ */
    public static final List f8754 = AbstractC4031.m7225("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: ۦۙ */
    public static final List f8755 = AbstractC4031.m7225("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: ۥؗ */
    public volatile C0498 f8756;

    /* JADX INFO: renamed from: ۥُ */
    public volatile boolean f8757;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0127 f8758;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3641 f8759;

    /* JADX INFO: renamed from: ۦؑ */
    public final EnumC1658 f8760;

    public C2636(C2561 c2561, C3641 c3641, C0870 c0870, C0127 c0127) {
        this.f8759 = c3641;
        this.f8758 = c0127;
        List list = c2561.f8545;
        EnumC1658 enumC1658 = EnumC1658.f5514;
        this.f8760 = list.contains(enumC1658) ? enumC1658 : EnumC1658.f5511;
    }

    @Override // p000.InterfaceC4559
    public final void cancel() {
        this.f8757 = true;
        C0498 c0498 = this.f8756;
        if (c0498 != null) {
            c0498.m1109(9);
        }
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo4239() throws SocketTimeoutException {
        this.f8756.m1110().close();
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥُ */
    public final long mo4241(C2147 c2147) {
        if (AbstractC0452.m974(c2147)) {
            return AbstractC4031.m7226(c2147);
        }
        return 0L;
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC3832 mo4242(C2813 c2813, long j) {
        return this.f8756.m1110();
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4598 mo4246(C2147 c2147) {
        return this.f8756.f1804;
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥۜ */
    public final C3641 mo4247() {
        return this.f8759;
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo4248(C2813 c2813) throws IOException {
        int i;
        C0498 c0498;
        boolean z;
        if (this.f8756 != null) {
            return;
        }
        boolean z2 = ((AbstractC2577) c2813.f9388) != null;
        C4714 c4714 = (C4714) c2813.f9390;
        ArrayList arrayList = new ArrayList(c4714.size() + 4);
        arrayList.add(new C4123(C4123.f13731, (String) c2813.f9389));
        C1007 c1007 = C4123.f13735;
        C0774 c0774 = (C0774) c2813.f9393;
        String strM1666 = c0774.m1666();
        String strM1668 = c0774.m1668();
        if (strM1668 != null) {
            strM1666 = strM1666 + '?' + strM1668;
        }
        arrayList.add(new C4123(c1007, strM1666));
        String strM8048 = c4714.m8048("Host");
        if (strM8048 != null) {
            arrayList.add(new C4123(C4123.f13734, strM8048));
        }
        arrayList.add(new C4123(C4123.f13732, c0774.f2800));
        int size = c4714.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = c4714.m8049(i2).toLowerCase(Locale.US);
            if (!f8754.contains(lowerCase) || (lowerCase.equals("te") && AbstractC3831.m6874(c4714.m8047(i2), "trailers"))) {
                arrayList.add(new C4123(lowerCase, c4714.m8047(i2)));
            }
        }
        C0127 c0127 = this.f8758;
        boolean z3 = !z2;
        synchronized (c0127.f524) {
            synchronized (c0127) {
                try {
                    if (c0127.f511 > 1073741823) {
                        c0127.m272(8);
                    }
                    if (c0127.f515) {
                        throw new C0824();
                    }
                    i = c0127.f511;
                    c0127.f511 = i + 2;
                    c0498 = new C0498(i, c0127, z3, false, null);
                    z = !z2 || c0127.f521 >= c0127.f519 || c0498.f1795 >= c0498.f1796;
                    if (c0498.m1112()) {
                        c0127.f530.put(Integer.valueOf(i), c0498);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0127.f524.m5830(z3, i, arrayList);
        }
        if (z) {
            c0127.f524.flush();
        }
        this.f8756 = c0498;
        boolean z4 = this.f8757;
        C0498 c0499 = this.f8756;
        if (z4) {
            c0499.m1109(9);
            C5028.m8448("Canceled");
        } else {
            c0499.f1805.mo3923(10000L);
            this.f8756.f1801.mo3923(10000L);
        }
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo4249() {
        this.f8758.flush();
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۦۙ */
    public final C1033 mo4255(boolean z) throws IOException {
        C4714 c4714;
        C0498 c0498 = this.f8756;
        if (c0498 == null) {
            C5028.m8448("stream wasn't created");
            return null;
        }
        synchronized (c0498) {
            c0498.f1805.m9679();
            while (c0498.f1806.isEmpty() && c0498.f1802 == 0) {
                try {
                    try {
                        c0498.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c0498.f1805.m5258();
                    throw th;
                }
            }
            c0498.f1805.m5258();
            if (c0498.f1806.isEmpty()) {
                IOException iOException = c0498.f1807;
                if (iOException != null) {
                    throw iOException;
                }
                throw new C5629(c0498.f1802);
            }
            c4714 = (C4714) c0498.f1806.removeFirst();
        }
        EnumC1658 enumC1658 = this.f8760;
        ArrayList arrayList = new ArrayList(20);
        int size = c4714.size();
        C3510 c3510M4130 = null;
        for (int i = 0; i < size; i++) {
            String strM8049 = c4714.m8049(i);
            String strM8047 = c4714.m8047(i);
            if (AbstractC3831.m6874(strM8049, ":status")) {
                c3510M4130 = AbstractC2133.m4130("HTTP/1.1 " + strM8047);
            } else if (!f8755.contains(strM8049)) {
                arrayList.add(strM8049);
                arrayList.add(AbstractC0684.m9760(strM8047).toString());
            }
        }
        if (c3510M4130 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C1033 c1033 = new C1033();
        c1033.f3643 = enumC1658;
        c1033.f3640 = c3510M4130.f11622;
        c1033.f3646 = (String) c3510M4130.f11624;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C5086 c5086 = new C5086(24);
        ((ArrayList) c5086.f16877).addAll(Arrays.asList(strArr));
        c1033.f3642 = c5086;
        if (z && c1033.f3640 == 100) {
            return null;
        }
        return c1033;
    }
}
