package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۦؔؓۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5757 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f18973;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18974;

    public /* synthetic */ C5757(int i, Object obj) {
        this.f18974 = i;
        this.f18973 = obj;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f18974;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((InterfaceC1663) this.f18973).cancel();
                return c2358;
            case 1:
                ((List) this.f18973).get(((Number) obj).intValue());
                return null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C2600) this.f18973).mo335(c2358);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C2317 c2317 = (C2317) this.f18973;
                if (c2317 != null) {
                    c2317.f7657 = zBooleanValue;
                }
                return c2358;
            default:
                float[] fArr = ((C0132) obj).f538;
                InterfaceC2015 interfaceC2015 = (InterfaceC2015) this.f18973;
                if (interfaceC2015.mo2807()) {
                    C4773.m8145(interfaceC2015).mo2788(interfaceC2015, fArr);
                }
                return c2358;
        }
    }

    public /* synthetic */ C5757() {
        this.f18974 = 3;
    }
}
