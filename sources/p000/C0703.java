package p000;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ۥًؙؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0703 extends AbstractC1567 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5051 f2548;

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1567 f2549;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5051 f2550;

    /* JADX INFO: renamed from: ۦؑ */
    public final LinkedHashMap f2551;

    static {
        String str = C5051.f16766;
        f2548 = C4992.m8381("/");
    }

    public C0703(C5051 c5051, AbstractC1567 abstractC1567, LinkedHashMap linkedHashMap) {
        this.f2550 = c5051;
        this.f2549 = abstractC1567;
        this.f2551 = linkedHashMap;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1562(C5051 c5051) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥّ */
    public final List mo1563(C5051 c5051) throws IOException {
        C5051 c5052 = f2548;
        c5052.getClass();
        C2440 c2440 = (C2440) this.f2551.get(AbstractC0088.m8666(c5052, c5051, true));
        if (c2440 != null) {
            return AbstractC0973.m2039(c2440.f8128);
        }
        C2316.m4362(c5051, "not a directory: ");
        return null;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1564(C5051 c5051, C5051 c5052) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۜ */
    public final C1377 mo1565(C5051 c5051) throws Throwable {
        C1377 c1377M7782;
        Throwable th;
        C5051 c5052 = f2548;
        c5052.getClass();
        C2440 c2440 = (C2440) this.f2551.get(AbstractC0088.m8666(c5052, c5051, true));
        Throwable th2 = null;
        if (c2440 == null) {
            return null;
        }
        long j = c2440.f8131;
        boolean z = c2440.f8127;
        C1377 c1377 = new C1377(!z, z, null, z ? null : Long.valueOf(c2440.f8130), null, c2440.f8126, null);
        if (j == -1) {
            return c1377;
        }
        C3886 c3886Mo1569 = this.f2549.mo1569(this.f2550);
        try {
            C4162 c4162 = new C4162(c3886Mo1569.m6971(j));
            try {
                c1377M7782 = AbstractC4489.m7782(c4162, c1377);
                try {
                    c4162.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    c4162.close();
                } catch (Throwable th5) {
                    AbstractC5537.m9223(th4, th5);
                }
                th = th4;
                c1377M7782 = null;
            }
            if (th != null) {
                throw th;
            }
            try {
                c3886Mo1569.close();
            } catch (Throwable th6) {
                th2 = th6;
            }
        } catch (Throwable th7) {
            if (c3886Mo1569 != null) {
                try {
                    c3886Mo1569.close();
                } catch (Throwable th8) {
                    AbstractC5537.m9223(th7, th8);
                }
            }
            th2 = th7;
            c1377M7782 = null;
        }
        if (th2 == null) {
            return c1377M7782;
        }
        throw th2;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3832 mo1566(C5051 c5051) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1567(C5051 c5051) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC3832 mo1568(C5051 c5051) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦٛ */
    public final C3886 mo1569(C5051 c5051) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC4598 mo1570(C5051 c5051) throws Throwable {
        Throwable th;
        C4162 c4162;
        C5051 c5052 = f2548;
        c5052.getClass();
        C2440 c2440 = (C2440) this.f2551.get(AbstractC0088.m8666(c5052, c5051, true));
        if (c2440 == null) {
            C5028.m8454(c5051, "no such file: ");
            return null;
        }
        long j = c2440.f8130;
        C3886 c3886Mo1569 = this.f2549.mo1569(this.f2550);
        try {
            c4162 = new C4162(c3886Mo1569.m6971(c2440.f8131));
            try {
                c3886Mo1569.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (c3886Mo1569 != null) {
                try {
                    c3886Mo1569.close();
                } catch (Throwable th4) {
                    AbstractC5537.m9223(th3, th4);
                }
            }
            th = th3;
            c4162 = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC4489.m7782(c4162, null);
        if (c2440.f8125 == 0) {
            return new C1642(c4162, j, true);
        }
        return new C1642(new C3636(new C4162(new C1642(c4162, c2440.f8124, true)), new Inflater(true)), j, false);
    }
}
