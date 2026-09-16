package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥؘؙٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0757 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0969 f2748;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0969 f2749;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0969 f2750 = AbstractC4489.m7811(0.0f, 400.0f, null, 5);

    static {
        AbstractC4489.m7811(0.0f, 400.0f, null, 5);
        Map map = AbstractC4168.f13869;
        f2749 = AbstractC4489.m7811(0.0f, 400.0f, new C0873(4294967297L), 1);
        f2748 = AbstractC4489.m7811(0.0f, 400.0f, new C4207(4294967297L), 1);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C5521 m1643(C4203 c4203, int i) {
        InterfaceC0215 interfaceC0215M7811 = c4203;
        if ((i & 1) != 0) {
            interfaceC0215M7811 = AbstractC4489.m7811(0.0f, 400.0f, null, 5);
        }
        return new C5521(new C3650(new C3075(interfaceC0215M7811), (C2565) null, (C5388) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1808 m1644() {
        return new C1808(new C3650(new C3075(AbstractC4489.m7811(0.0f, 400.0f, null, 5)), (C2565) null, (C5388) null, (LinkedHashMap) null, 126));
    }
}
