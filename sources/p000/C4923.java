package p000;

import java.util.Collection;

/* JADX INFO: renamed from: ۦٍۖؖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4923 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f16232;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f16233;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f16234;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f16235;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16236;

    public /* synthetic */ C4923(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16236 = i;
        this.f16235 = obj;
        this.f16233 = obj2;
        this.f16234 = obj3;
        this.f16232 = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f16236;
        boolean zBooleanValue = true;
        Object obj2 = this.f16232;
        Object obj3 = this.f16234;
        Object obj4 = this.f16233;
        Object obj5 = this.f16235;
        switch (i) {
            case 0:
                C5837 c5837 = (C5837) obj5;
                C1568 c1568 = (C1568) obj4;
                C5745 c5745 = (C5745) obj3;
                C2350 c2350 = (C2350) obj2;
                if (c5837.m9646()) {
                    C5002 c5002 = c5837.f19234;
                    C5149 c5149 = c5837.f19244;
                    C5149 c51410 = c5837.f19229;
                    C5450 c5450 = new C5450();
                    C3464 c3464 = new C3464(c5002, c5149, c5450, 16);
                    InterfaceC1637 interfaceC1637 = c1568.f5285;
                    interfaceC1637.mo3446(c5745, c2350, c3464, c51410);
                    C2829 c2829 = new C2829(c1568, interfaceC1637);
                    c1568.f5284.set(c2829);
                    c5450.f17965 = c2829;
                    c5837.f19223 = c2829;
                }
                return new C3279(1);
            case 1:
                C2750 c2750 = (C2750) obj5;
                c2750.f9097 = new C1405((C0880) obj4, (C4319) obj3, (InterfaceC0762) obj2);
                return new C4954(8, c2750);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC5731 interfaceC5731 = (InterfaceC5731) obj4;
                C4229 c4229 = (C4229) obj3;
                String str = (String) obj2;
                if ((obj5 instanceof Collection) && ((Collection) obj5).isEmpty()) {
                    obj5 = null;
                }
                if (obj5 != null) {
                    zBooleanValue = ((Boolean) interfaceC5731.mo219(obj5, obj)).booleanValue();
                    if (c4229.f14028 != 3 && AbstractC3761.m6632(AbstractC4009.f13362) <= 0) {
                        String strM4262 = AbstractC2198.m4262(obj5);
                        String strM8362 = strM4262 != null ? AbstractC4981.m8362(strM4262.toString(), " (Kotlin reflection is not available)", "") : null;
                        String strM8363 = obj != null ? AbstractC4981.m8362(obj.toString(), " (Kotlin reflection is not available)", "") : null;
                        String str2 = zBooleanValue ? "HIT" : "MISS";
                        StringBuilder sb = new StringBuilder("[FILTER] [");
                        sb.append(str2);
                        sb.append("] ");
                        sb.append(str);
                        sb.append(": ");
                        String strM6622 = AbstractC3761.m6622(sb, strM8362, " [RESOLVED] ", strM8363);
                        if (AbstractC3761.m6632(AbstractC4009.f13362) <= 0) {
                            AbstractC4009.f13365.mo7233(strM6622);
                        }
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                C1916 c1916 = (C1916) obj5;
                C3031 c3031 = (C3031) obj4;
                C3594 c3594 = (C3594) obj3;
                C0644 c0644 = (C0644) obj2;
                C5535 c5535 = (C5535) obj;
                float fFloatValue = ((Number) c5535.f18269.getValue()).floatValue() - c1916.f6312;
                if (C4773.m8133(fFloatValue)) {
                    if (((Boolean) c0644.mo211(Float.valueOf(c1916.f6312))).booleanValue()) {
                        c5535.m9211();
                    }
                } else if (C4773.m8133(fFloatValue - c3031.m5621(c3594, fFloatValue))) {
                    c1916.f6312 += fFloatValue;
                    if (((Boolean) c0644.mo211(Float.valueOf(c1916.f6312))).booleanValue()) {
                        c5535.m9211();
                    }
                } else {
                    c5535.m9211();
                }
                return C2358.f7817;
        }
    }
}
