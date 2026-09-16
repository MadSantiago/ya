package p000;

import android.graphics.Bitmap;
import java.io.EOFException;

/* JADX INFO: renamed from: ۥّۚؑ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2248 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f7459;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f7460;

    /* JADX INFO: renamed from: ۥّ */
    public final C4714 f7461;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5130 f7462;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5130 f7463;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f7464;

    public C2248(C4162 c4162) throws EOFException {
        this.f7463 = AbstractC3933.m7095(3, new C2998(this, 0));
        this.f7462 = AbstractC3933.m7095(3, new C2998(this, true ? 1 : 0));
        this.f7459 = Long.parseLong(c4162.mo2663(Long.MAX_VALUE));
        this.f7464 = Long.parseLong(c4162.mo2663(Long.MAX_VALUE));
        this.f7460 = Integer.parseInt(c4162.mo2663(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(c4162.mo2663(Long.MAX_VALUE));
        C5086 c5086 = new C5086(24);
        for (int i2 = 0; i2 < i; i2++) {
            String strMo2663 = c4162.mo2663(Long.MAX_VALUE);
            Bitmap.Config config = AbstractC0080.f15150;
            int iM1521 = AbstractC0684.m1521(':', 0, 6, strMo2663);
            if (iM1521 == -1) {
                C1078.m2273("Unexpected header: ".concat(strMo2663));
                throw null;
            }
            c5086.m8692(AbstractC0684.m9760(strMo2663.substring(0, iM1521)).toString(), strMo2663.substring(iM1521 + 1));
        }
        this.f7461 = c5086.m8701();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4296(C5025 c5025) {
        c5025.mo2699(this.f7459);
        c5025.writeByte(10);
        c5025.mo2699(this.f7464);
        c5025.writeByte(10);
        c5025.mo2699(this.f7460 ? 1L : 0L);
        c5025.writeByte(10);
        C4714 c4714 = this.f7461;
        c5025.mo2699(c4714.size());
        c5025.writeByte(10);
        int size = c4714.size();
        for (int i = 0; i < size; i++) {
            c5025.mo2660(c4714.m8049(i));
            c5025.mo2660(": ");
            c5025.mo2660(c4714.m8047(i));
            c5025.writeByte(10);
        }
    }

    public C2248(C2147 c2147) {
        this.f7463 = AbstractC3933.m7095(3, new C2998(this, 0 == true ? 1 : 0));
        this.f7462 = AbstractC3933.m7095(3, new C2998(this, 1));
        this.f7459 = c2147.f7035;
        this.f7464 = c2147.f7030;
        this.f7460 = c2147.f7031 != null;
        this.f7461 = c2147.f7034;
    }
}
