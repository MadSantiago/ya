package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۦٍؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2825 extends AbstractC1079 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f9440;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2825(int i, String str) {
        super(str);
        this.f9440 = i;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2150 mo779(C1489 c1489, List list) {
        int i = this.f9440;
        C4607 c4607 = InterfaceC2150.f7060;
        switch (i) {
            case 0:
                return c4607;
            case 1:
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return this;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C5563(Double.valueOf(0.0d));
            default:
                return c4607;
        }
    }
}
