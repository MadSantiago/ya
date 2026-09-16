package p000;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥَۜؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2403 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f8008;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8009;

    public /* synthetic */ C2403(int i, Object obj) {
        this.f8009 = i;
        this.f8008 = obj;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        int i = this.f8009;
        int i2 = 4;
        C2358 c2358 = C2358.f7817;
        Object obj4 = this.f8008;
        switch (i) {
            case 0:
                long j = ((C1327) obj).f4595;
                C5362 c5362 = (C5362) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c5362.m8961(j) ? 4 : 2;
                }
                if (c5362.m9011(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC1211.m2580(((C3064) obj4).f10302, j, c5362, (iIntValue << 3) & 112);
                } else {
                    c5362.m8982();
                }
                return c2358;
            case 1:
                C1519 c1519 = (C1519) obj;
                C5362 c5363 = (C5362) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? c5363.m8963(c1519) : c5363.m8977(c1519) ? 4 : 2;
                }
                if (c5363.m9011(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    AbstractC1487.m3093(c1519, null, 0.0f, null, 0L, 0L, AbstractC3925.m7034(-999924215, new C4190(i2, (String) obj4), c5363), c5363, (iIntValue2 & 14) | 805306368);
                } else {
                    c5363.m8982();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5362 c5364 = (C5362) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (c5364.m9011(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC5844.m9650((InterfaceC5731) obj4, c5364, 0);
                } else {
                    c5364.m8982();
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                long j2 = ((C1327) obj).f4595;
                C5362 c5365 = (C5362) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (c5365.m9011(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    C0373.f1362.m799((Drawable) obj4, c5365, 48);
                } else {
                    c5365.m8982();
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                long j3 = ((C1327) obj).f4595;
                C5362 c5366 = (C5362) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (c5366.m9011(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    C0373.f1362.m800(((RemoteAction) obj4).getIcon(), c5366, 48);
                } else {
                    c5366.m8982();
                }
                return c2358;
            default:
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj;
                C5362 c5367 = (C5362) obj2;
                ((Number) obj3).intValue();
                c5367.m8957(-1498516085);
                C0969 c0969M4817 = AbstractC2552.m4817(2, c5367);
                C0969 c0969M4818 = AbstractC2552.m4817(5, c5367);
                C0777 c0777 = (C0777) obj4;
                C1280 c1280 = AbstractC3831.f12709;
                Object objM1671 = c0777.m1671();
                C4852 c4852 = c0777.f2814;
                boolean zBooleanValue = ((Boolean) objM1671).booleanValue();
                c5367.m8957(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                c5367.m9009(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) c4852.getValue()).booleanValue();
                c5367.m8957(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                c5367.m9009(false);
                Float fValueOf2 = Float.valueOf(f2);
                c0777.m1673();
                c5367.m8957(386845748);
                c5367.m9009(false);
                C3051 c3051M5195 = AbstractC2774.m5195(c0777, fValueOf, fValueOf2, c0969M4817, c1280, c5367, 196608);
                boolean zBooleanValue3 = ((Boolean) c0777.m1671()).booleanValue();
                c5367.m8957(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                c5367.m9009(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) c4852.getValue()).booleanValue();
                c5367.m8957(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                c5367.m9009(false);
                Float fValueOf4 = Float.valueOf(f4);
                c0777.m1673();
                c5367.m8957(-281714272);
                c5367.m9009(false);
                InterfaceC0705 interfaceC0705M7928 = AbstractC4554.m7928(interfaceC0705, ((Number) c3051M5195.f10275.getValue()).floatValue(), ((Number) c3051M5195.f10275.getValue()).floatValue(), ((Number) AbstractC2774.m5195(c0777, fValueOf3, fValueOf4, c0969M4818, c1280, c5367, 196608).f10275.getValue()).floatValue(), 0.0f, null, 131064);
                c5367.m9009(false);
                return interfaceC0705M7928;
        }
    }
}
