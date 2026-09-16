package p000;

/* JADX INFO: renamed from: ۦٌٍٔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4191 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2951 f13937;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13938;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4191(C2951 c2951, int i) {
        super(1);
        this.f13938 = i;
        this.f13937 = c2951;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f13938;
        EnumC0211 enumC0211 = EnumC0211.f793;
        EnumC0211 enumC0212 = EnumC0211.f795;
        EnumC0211 enumC0213 = EnumC0211.f796;
        C2951 c2951 = this.f13937;
        switch (i) {
            case 0:
                C2451 c2451 = (C2451) obj;
                boolean zM4575 = c2451.m4575(enumC0213, enumC0212);
                C0969 c0969 = null;
                if (zM4575) {
                    C5388 c5388 = c2951.f9903.f6021.f12209;
                    if (c5388 != null) {
                        c0969 = c5388.f17807;
                    }
                } else if (c2451.m4575(enumC0212, enumC0211)) {
                    C5388 c5389 = c2951.f9901.f18231.f12209;
                    if (c5389 != null) {
                        c0969 = c5389.f17807;
                    }
                } else {
                    c0969 = AbstractC0757.f2748;
                }
                return c0969 == null ? AbstractC0757.f2748 : c0969;
            default:
                C2451 c2452 = (C2451) obj;
                if (c2452.m4575(enumC0213, enumC0212)) {
                    C2565 c2565 = c2951.f9903.f6021.f12211;
                    return c2565 != null ? c2565.f8562 : AbstractC0757.f2749;
                }
                if (!c2452.m4575(enumC0212, enumC0211)) {
                    return AbstractC0757.f2749;
                }
                C2565 c2566 = c2951.f9901.f18231.f12211;
                return c2566 != null ? c2566.f8562 : AbstractC0757.f2749;
        }
    }
}
