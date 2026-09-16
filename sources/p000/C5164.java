package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۦّۚؓۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5164 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f17099;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f17100;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17101;

    public /* synthetic */ C5164(int i, Object obj, Object obj2) {
        this.f17101 = i;
        this.f17100 = obj;
        this.f17099 = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f17101;
        Object obj = this.f17100;
        switch (i) {
            case 0:
                C1339 c1339 = (C1339) obj;
                C5164 c5164 = (C5164) this.f17099;
                c1339.m9679();
                try {
                    try {
                        c5164.close();
                        if (c1339.m9680()) {
                            throw c1339.m2854(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c1339.m9680()) {
                            throw e;
                        }
                        throw c1339.m2854(e);
                    }
                } catch (Throwable th) {
                    c1339.m9680();
                    throw th;
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f17101) {
            case 0:
                return "AsyncTimeout.source(" + ((C5164) this.f17099) + ')';
            default:
                return "source(" + ((InputStream) this.f17100) + ')';
        }
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        int i = this.f17101;
        Object obj = this.f17100;
        Object obj2 = this.f17099;
        switch (i) {
            case 0:
                C1339 c1339 = (C1339) obj;
                C5164 c5164 = (C5164) obj2;
                c1339.m9679();
                try {
                    try {
                        long jMo406 = c5164.mo406(c1270, j);
                        if (c1339.m9680()) {
                            throw c1339.m2854(null);
                        }
                        return jMo406;
                    } catch (IOException e) {
                        if (c1339.m9680()) {
                            throw c1339.m2854(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c1339.m9680();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((C2014) obj2).mo3919();
                    C3341 c3341M2662 = c1270.m2662(1);
                    int i2 = ((InputStream) obj).read(c3341M2662.f11178, c3341M2662.f11174, (int) Math.min(j, 8192 - c3341M2662.f11174));
                    if (i2 == -1) {
                        if (c3341M2662.f11177 == c3341M2662.f11174) {
                            c1270.f4341 = c3341M2662.m6103();
                            AbstractC3701.m6565(c3341M2662);
                        }
                        return -1L;
                    }
                    c3341M2662.f11174 += i2;
                    long j2 = i2;
                    c1270.f4340 += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? AbstractC0684.m1527(message, "getsockname failed", false) : false) {
                            throw new IOException(e2);
                        }
                    }
                    throw e2;
                }
        }
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        switch (this.f17101) {
            case 0:
                return (C1339) this.f17100;
            default:
                return (C2014) this.f17099;
        }
    }
}
