package p000;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: ۥَّٝؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1862 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3142 f6203;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3729 f6204;

    public C1862(C3729 c3729, C3142 c3142) {
        this.f6204 = c3729;
        this.f6203 = c3142;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1521 m3709(C1521 c1521) {
        String str;
        this.f6203.getClass();
        String lowerCase = AbstractC4981.m8362(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.ROOT);
        String str2 = (c1521 == null || (str = c1521.f5161) == null) ? lowerCase : str;
        int i = c1521 != null ? c1521.f5160 + 1 : 0;
        this.f6204.getClass();
        return new C1521(C3729.m6575().f16405, lowerCase, str2, i);
    }
}
