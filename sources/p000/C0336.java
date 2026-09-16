package p000;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: ۥؓؖۧۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0336 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0336 f1251 = new C0336(C4342.f14328, C1704.m3512());

    /* JADX INFO: renamed from: ۥۗ */
    public final C1704 f1252;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4342 f1253;

    public C0336(C4342 c4342, C1704 c1704) {
        c4342.getClass();
        this.f1253 = c4342;
        this.f1252 = c1704;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0336 m770(AbstractC4650 abstractC4650, boolean z) throws C5463 {
        C4342 c4342M7637;
        int iMo4597 = abstractC4650.mo4597();
        if (iMo4597 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iMo4597).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iMo4597);
            sb.append(". Current version is: 1");
            throw new C5463(sb.toString());
        }
        abstractC4650.mo4597();
        int iMo4609 = abstractC4650.mo4609(abstractC4650.mo4593());
        C2955 c2955 = C2955.f9912;
        int i = AbstractC5529.f18251;
        C1704 c1704M3513 = C1704.m3513(abstractC4650, C2955.f9911);
        abstractC4650.mo4607(iMo4609);
        C0348 c0348 = new C0348();
        Inflater inflater = (Inflater) c0348.f1280;
        try {
            if (z) {
                int iMo46010 = abstractC4650.mo4609(abstractC4650.mo4593());
                int iMo4596 = abstractC4650.mo4596();
                try {
                    c4342M7637 = C4342.m7637(AbstractC4650.m8025(new InflaterInputStream(new C4809(c0348, abstractC4650), inflater, iMo4596 < 0 ? 4096 : Math.min(iMo4596, 4096)), 4096));
                    inflater.reset();
                    if (abstractC4650.mo4596() != 0) {
                        throw new C5463("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    abstractC4650.mo4607(iMo46010);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(abstractC4650.mo4595());
                try {
                    c4342M7637 = C4342.m7637(AbstractC4650.m8025(new C4809(c0348, 2), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            c0348.close();
            return new C0336(c4342M7637, c1704M3513);
        } catch (Throwable th3) {
            try {
                c0348.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
