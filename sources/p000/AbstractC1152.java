package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥٍّؓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1152 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0969 f4005 = AbstractC4489.m7811(0.0f, 0.0f, null, 7);

    static {
        Map map = AbstractC4168.f13869;
        AbstractC4489.m7811(0.0f, 0.0f, new C4497(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final InterfaceC5372 m2408(Object obj, C1280 c1280, InterfaceC3347 interfaceC3347, Float f, String str, C5362 c5362, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objM8999 = c5362.m8999();
        Object obj2 = C2850.f9517;
        if (objM8999 == obj2) {
            objM8999 = AbstractC2774.m5183(null);
            c5362.m8987(objM8999);
        }
        InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
        Object objM89910 = c5362.m8999();
        if (objM89910 == obj2) {
            objM89910 = new C5825(obj, c1280, f);
            c5362.m8987(objM89910);
        }
        C5825 c5825 = (C5825) objM89910;
        InterfaceC4367 interfaceC4367M5175 = AbstractC2774.m5175(null, c5362);
        if (f != null && (interfaceC3347 instanceof C0969)) {
            C0969 c0969 = (C0969) interfaceC3347;
            if (!AbstractC3831.m6874(c0969.f3422, f)) {
                interfaceC3347 = new C0969(c0969.f3424, c0969.f3423, f);
            }
        }
        InterfaceC4367 interfaceC4367M5176 = AbstractC2774.m5175(interfaceC3347, c5362);
        Object objM89911 = c5362.m8999();
        if (objM89911 == obj2) {
            objM89911 = AbstractC1631.m3405(-1, 0, 6);
            c5362.m8987(objM89911);
        }
        InterfaceC4541 interfaceC4541 = (InterfaceC4541) objM89911;
        boolean zM8977 = c5362.m8977(interfaceC4541) | c5362.m8977(obj);
        Object objM89912 = c5362.m8999();
        if (zM8977 || objM89912 == obj2) {
            objM89912 = new C1225(1, interfaceC4541, obj);
            c5362.m8987(objM89912);
        }
        AbstractC3925.m7040((InterfaceC4448) objM89912, c5362);
        boolean zM8978 = c5362.m8977(interfaceC4541) | c5362.m8977(c5825) | c5362.m8963(interfaceC4367M5176) | c5362.m8963(interfaceC4367M5175);
        Object objM89913 = c5362.m8999();
        if (zM8978 || objM89913 == obj2) {
            Object c5770 = new C5770(interfaceC4541, c5825, interfaceC4367M5176, interfaceC4367M5175, null);
            c5362.m8987(c5770);
            objM89913 = c5770;
        }
        AbstractC3925.m7030((InterfaceC5731) objM89913, c5362, interfaceC4541);
        InterfaceC5372 interfaceC5372 = (InterfaceC5372) interfaceC4367.getValue();
        return interfaceC5372 == null ? c5825.f19169 : interfaceC5372;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final InterfaceC5372 m2409(float f, C0969 c0969, C5362 c5362) {
        return m2408(new C4497(f), AbstractC3831.f12711, c0969, null, "DpAnimation", c5362, 0, 8);
    }
}
