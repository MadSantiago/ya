package p000;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦؐؗ٘٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2998 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2248 f10075;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f10076;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2998(C2248 c2248, int i) {
        super(0);
        this.f10076 = i;
        this.f10075 = c2248;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f10076;
        C2248 c2248 = this.f10075;
        switch (i) {
            case 0:
                return AbstractC2164.m4195(c2248.f7461);
            default:
                String strM8048 = c2248.f7461.m8048("Content-Type");
                if (strM8048 == null) {
                    return null;
                }
                Pattern pattern = C0822.f2914;
                try {
                    return AbstractC5378.m9040(strM8048);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
