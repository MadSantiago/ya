package p000;

import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: renamed from: ۥ٘ؓۦؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1567 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0867 f5283;

    static {
        C0867 c0867;
        try {
            Class.forName("java.nio.file.Files");
            c0867 = new C4084();
        } catch (ClassNotFoundException unused) {
            c0867 = new C0867();
        }
        f5283 = c0867;
        String str = C5051.f16766;
        C4992.m8381(System.getProperty("java.io.tmpdir"));
        new C5134(C5134.class.getClassLoader());
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract void mo1562(C5051 c5051);

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m3319(C5051 c5051) {
        return mo1565(c5051) != null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public abstract List mo1563(C5051 c5051);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract void mo1564(C5051 c5051, C5051 c5052);

    /* JADX INFO: renamed from: ۥۜ */
    public abstract C1377 mo1565(C5051 c5051);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract InterfaceC3832 mo1566(C5051 c5051);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract void mo1567(C5051 c5051);

    /* JADX INFO: renamed from: ۦِ */
    public abstract InterfaceC3832 mo1568(C5051 c5051);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract C3886 mo1569(C5051 c5051);

    /* JADX INFO: renamed from: ۦۗ */
    public abstract InterfaceC4598 mo1570(C5051 c5051);

    /* JADX INFO: renamed from: ۦۙ */
    public final C1377 m3320(C5051 c5051) throws FileNotFoundException {
        C1377 c1377Mo1565 = mo1565(c5051);
        if (c1377Mo1565 != null) {
            return c1377Mo1565;
        }
        C5028.m8454(c5051, "no such file: ");
        return null;
    }
}
