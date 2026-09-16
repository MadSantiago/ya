package p000;

import android.text.style.StrikethroughSpan;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥؙٙؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1635 implements InterfaceC1652 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f5477;

    public /* synthetic */ C1635(int i) {
        this.f5477 = i;
    }

    @Override // p000.InterfaceC1652
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo3440(C2711 c2711, C5008 c5008) {
        int i = 0;
        switch (this.f5477) {
            case 0:
                return new C4259((C5728) c2711.f8985, 0);
            case 1:
                return new C5232((C5728) c2711.f8985);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C5799(i, (C5728) c2711.f8985);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1978(0);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C0923((C5728) c2711.f8985, ((Integer) AbstractC4225.f14013.m477(c5008)).intValue());
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5728 c5728 = (C5728) c2711.f8985;
                String str = (String) AbstractC4593.f15162.m477(c5008);
                AbstractC1605 abstractC1605 = (AbstractC1605) c2711.f8984;
                C4992 c4992 = (C4992) c2711.f8982;
                C0220 c0220 = AbstractC4593.f15158;
                HashMap map = c5008.f16580;
                C0838 c0838 = new C0838(str, abstractC1605, c4992, (C5913) map.get(c0220));
                C0220 c0221 = AbstractC4593.f15157;
                Object obj = Boolean.FALSE;
                Object obj2 = map.get(c0221);
                if (obj2 != null) {
                    obj = obj2;
                }
                return new C4478(c5728, c0838, ((Boolean) obj).booleanValue());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C2477((C5728) c2711.f8985, (String) AbstractC4225.f14018.m477(c5008), (C4992) c2711.f8981);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                if (EnumC0424.f1536 == AbstractC4225.f14010.m477(c5008)) {
                    return new C1729((C5728) c2711.f8985, ((Integer) AbstractC4225.f14011.m477(c5008)).intValue());
                }
                return new C5519((C5728) c2711.f8985, String.valueOf(AbstractC4225.f14020.m477(c5008)).concat(". "));
            case 8:
                return new StrikethroughSpan();
            case 9:
                return new C1978(1);
            default:
                return new C4259((C5728) c2711.f8985, 1);
        }
    }
}
