package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ۥٖۣؓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1455 implements InterfaceC3832 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f4963;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f4964;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4965;

    public /* synthetic */ C1455(int i, Object obj, Object obj2) {
        this.f4965 = i;
        this.f4964 = obj;
        this.f4963 = obj2;
    }

    @Override // p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f4965;
        Object obj = this.f4964;
        switch (i) {
            case 0:
                C1339 c1339 = (C1339) obj;
                C1455 c1455 = (C1455) this.f4963;
                c1339.m9679();
                try {
                    try {
                        c1455.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // p000.InterfaceC3832, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f4965;
        Object obj = this.f4964;
        switch (i) {
            case 0:
                C1339 c1339 = (C1339) obj;
                C1455 c1455 = (C1455) this.f4963;
                c1339.m9679();
                try {
                    try {
                        c1455.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4965) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1455) this.f4963) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4964) + ')';
        }
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        switch (this.f4965) {
            case 0:
                return (C1339) this.f4964;
            default:
                return (C2014) this.f4963;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[LOOP:1: B:12:0x0061->B:25:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[SYNTHETIC] */
    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) throws IOException {
        long j2;
        C1339 c1339;
        int i = this.f4965;
        Object obj = this.f4964;
        Object obj2 = this.f4963;
        switch (i) {
            case 0:
                C5063.m8614(c1270.f4340, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    C3341 c3341 = c1270.f4341;
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (c3341.f11174 - c3341.f11177);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    c1339 = (C1339) obj;
                                    C1455 c1455 = (C1455) obj2;
                                    c1339.m9679();
                                    c1455.mo962(c1270, j2);
                                    if (!c1339.m9680()) {
                                        throw c1339.m2854(null);
                                    }
                                } else {
                                    c3341 = c3341.f11176;
                                }
                            }
                            c1455.mo962(c1270, j2);
                            if (!c1339.m9680()) {
                                throw c1339.m2854(null);
                            }
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
                    c1339 = (C1339) obj;
                    C1455 c1456 = (C1455) obj2;
                    c1339.m9679();
                }
                return;
            default:
                C5063.m8614(c1270.f4340, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((C2014) obj2).mo3919();
                    C3341 c3342 = c1270.f4341;
                    int iMin = (int) Math.min(j4, c3342.f11174 - c3342.f11177);
                    ((OutputStream) obj).write(c3342.f11178, c3342.f11177, iMin);
                    int i2 = c3342.f11177 + iMin;
                    c3342.f11177 = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    c1270.f4340 -= j5;
                    if (i2 == c3342.f11174) {
                        c1270.f4341 = c3342.m6103();
                        AbstractC3701.m6565(c3342);
                    }
                }
                return;
        }
    }
}
