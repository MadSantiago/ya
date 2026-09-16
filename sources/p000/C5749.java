package p000;

import java.util.Set;

/* JADX INFO: renamed from: ۦۦًؓؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5749 implements InterfaceC0581 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4046 f18961;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1360 f18962;

    /* JADX INFO: renamed from: ۥۣ */
    public final Set f18963;

    public C5749(Set set, C1360 c1360, C4046 c4046) {
        this.f18963 = set;
        this.f18962 = c1360;
        this.f18961 = c4046;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1414 m9573(String str, C1329 c1329, InterfaceC2456 interfaceC2456) {
        Set set = this.f18963;
        if (!set.contains(c1329)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c1329, set));
        }
        return new C1414(this.f18962, str, c1329, interfaceC2456, this.f18961, 13);
    }
}
