package p000;

import java.util.Map;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۦۤؓ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5648 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4994 f18601;

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public C5648() {
        boolean z;
        Boolean bool;
        Map map = AbstractC0502.f1819;
        boolean z2 = C0113.f449;
        if (!C0113.m208()) {
            C3657 c3657M9266 = AbstractC5537.m9266("__--");
            z = (c3657M9266 == null || (bool = (Boolean) c3657M9266.m6535(new Object[0])) == null) ? false : bool.booleanValue();
        }
        EnumC5242 enumC5242 = !((Boolean) AbstractC0502.f1817.getValue()).booleanValue() ? EnumC5242.f17311 : AbstractC0502.f1818 ? AbstractC0487.m1073() < 739523110 ? EnumC5242.f17301 : !AbstractC0502.f1820 ? EnumC5242.f17302 : EnumC5242.f17310 : (z && AbstractC0487.m1036(new C4441(new long[]{6443901636132499133L, -2921626608664767108L, 4977915696661478747L, -8095541073046435167L}).toString()) == null) ? EnumC5242.f17303 : (!z || AbstractC0487.m1073() >= 739523110) ? z ? EnumC5242.f17308 : (((Boolean) AbstractC0502.f1816.getValue()).booleanValue() || AbstractC3310.m6080()) ? EnumC5242.f17305 : EnumC5242.f17309 : EnumC5242.f17301;
        App app = App.f407;
        C1443 c1443 = AbstractC2776.m5217().f409;
        C1542 c1542 = AbstractC2539.f8462;
        Object obj = c1542.f5218;
        String str = c1542.f5219;
        boolean z3 = C1443.f4940;
        String str2 = (String) c1443.m3068(obj, str);
        C1443 c1444 = AbstractC2776.m5217().f409;
        C1542 c1543 = AbstractC2539.f8443;
        this.f18601 = AbstractC1605.m3349(new C1966(enumC5242, false, R.string.dialog_lspatch_message, false, false, str2, ((Boolean) c1444.m3068(c1543.f5218, c1543.f5219)).booleanValue(), false, false));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m9481(C5648 c5648, int i, int i2) {
        Object value;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 2) != 0) {
            i = R.string.dialog_lspatch_message;
        }
        int i3 = i;
        C4994 c4994 = c5648.f18601;
        do {
            value = c4994.getValue();
        } while (!c4994.m8386(value, C1966.m3846((C1966) value, null, z, i3, false, false, null, false, false, false, 505)));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9482(boolean z) {
        while (true) {
            C4994 c4994 = this.f18601;
            Object value = c4994.getValue();
            boolean z2 = z;
            if (c4994.m8386(value, C1966.m3846((C1966) value, null, false, 0, false, false, null, false, z2, false, 383))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9483(boolean z) {
        C4994 c4994;
        Object value;
        C1966 c1966M3846;
        do {
            c4994 = this.f18601;
            value = c4994.getValue();
            C1966 c1966 = (C1966) value;
            if (z) {
                c1966M3846 = C1966.m3846(c1966, null, false, 0, false, true, null, false, false, false, 495);
            } else {
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f409;
                C1542 c1542 = AbstractC2539.f8462;
                Object obj = c1542.f5218;
                String str = c1542.f5219;
                boolean z2 = C1443.f4940;
                String str2 = (String) c1443.m3068(obj, str);
                C1443 c1444 = AbstractC2776.m5217().f409;
                C1542 c1543 = AbstractC2539.f8443;
                c1966M3846 = C1966.m3846(c1966, null, false, 0, false, false, str2, ((Boolean) c1444.m3068(c1543.f5218, c1543.f5219)).booleanValue(), false, false, 399);
            }
        } while (!c4994.m8386(value, c1966M3846));
    }
}
